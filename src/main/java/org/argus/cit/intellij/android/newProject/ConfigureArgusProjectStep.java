/*
 * Copyright (c) 2016. Fengguo (Hugo) Wei and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Detailed contributors are listed in the CONTRIBUTOR.md
 */

package org.argus.cit.intellij.android.newProject;

import com.android.tools.idea.npw.WizardUtils;
import com.android.tools.idea.wizard.WizardConstants;
import com.android.tools.idea.wizard.dynamic.DynamicWizardStepWithHeaderAndDescription;
import com.android.tools.idea.wizard.dynamic.ScopedStateStore;
import com.android.tools.idea.wizard.dynamic.ScopedStateStore.Key;
import com.intellij.openapi.Disposable;
import com.intellij.openapi.fileChooser.*;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.TextFieldWithBrowseButton;
import com.intellij.openapi.vfs.LocalFileSystem;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.openapi.vfs.VirtualFileWrapper;
import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;
import org.argus.amandroid.core.ApkGlobal$;
import org.argus.jawa.core.util.FileUtil$;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.Set;

/**
 * @author <a href="mailto:fgwei521@gmail.com">Fengguo Wei</a>
 */
public class ConfigureArgusProjectStep extends DynamicWizardStepWithHeaderAndDescription {

    private TextFieldWithBrowseButton myProjectLocation;
    private TextFieldWithBrowseButton myAppPath;
    private JPanel myPanel;
    private JLabel myAppName;
    private JLabel myPackageName;

    public ConfigureArgusProjectStep(@NotNull Disposable disposable) {
        this("Configure your new analysis", disposable);
    }

    public ConfigureArgusProjectStep(String title, Disposable parentDisposable) {
        super(title, null, parentDisposable);
        setBodyComponent(myPanel);
    }

    @Override
    public void init() {
        register(NewProjectWizard.APK_LOCATION_KEY(), myAppPath);
        register(WizardConstants.APPLICATION_NAME_KEY, myAppName);
        registerValueDeriver(WizardConstants.APPLICATION_NAME_KEY, myAppNameDeriver);
        register(WizardConstants.PACKAGE_NAME_KEY, myPackageName);
        registerValueDeriver(WizardConstants.PACKAGE_NAME_KEY, PACKAGE_NAME_DERIVER);
        register(WizardConstants.PROJECT_LOCATION_KEY, myProjectLocation);
        registerValueDeriver(WizardConstants.PROJECT_LOCATION_KEY, myProjectLocationDeriver);

        FileChooserDescriptor apkFileChooserDescriptor = new FileChooserDescriptor(true, false, true, false, false, false);
        myAppPath.addBrowseFolderListener("Apk Path", "Please choose an APK", null, apkFileChooserDescriptor);
        myProjectLocation.addActionListener(e -> browseForFile());
        super.init();
    }

    @Override
    public boolean validate() {
        if (!myPath.validate()) return false;
        WizardUtils.ValidationResult locationValidationResult = WizardUtils.validateLocation(myState.get(WizardConstants.PROJECT_LOCATION_KEY));
        setErrorHtml(locationValidationResult.isOk() ? "" : locationValidationResult.getFormattedMessage());

        boolean validApk = true;
        String errorMessage = "";
        String path = myState.get(NewProjectWizard.APK_LOCATION_KEY());
        if (path == null || path.equals("")) {
            return false;
        }
        if (!ApkGlobal$.MODULE$.isValidApk(FileUtil$.MODULE$.toUri(path))) {
            validApk = false;
            errorMessage = "Given APK is not valid. It maybe not an apk file, or don't have AndroidManifest.xml or *.dex files.";
        }
        setErrorHtml(validApk ? "" : errorMessage);
        return !locationValidationResult.isError() && validApk;
    }

    @Override
    public JComponent getPreferredFocusedComponent() {
        return myAppName;
    }

    @NotNull
    @Override
    public String getStepName() {
        return "Configure your new analysis";
    }

    private void browseForFile() {
        FileSaverDescriptor fileSaverDescriptor = new FileSaverDescriptor("Project Location", "Please choose a location for your project");
        File currentPath = new File(myProjectLocation.getText());
        File parentPath = currentPath.getParentFile();
        if (parentPath == null) {
            String homePath = System.getProperty("user.home");
            parentPath = new File(homePath == null ? File.separator : homePath);
        }
        VirtualFile parent = LocalFileSystem.getInstance().findFileByIoFile(parentPath);
        String filename = currentPath.getName();
        VirtualFileWrapper fileWrapper =
                FileChooserFactory.getInstance().createSaveFileDialog(fileSaverDescriptor, (Project) null).save(parent, filename);
        if (fileWrapper != null) {
            myProjectLocation.setText(fileWrapper.getFile().getAbsolutePath());
        }
    }

    private static final ValueDeriver<String> myAppNameDeriver = new ValueDeriver<String>() {
        @Nullable
        @Override
        public Set<Key<?>> getTriggerKeys() {
            return makeSetOf(NewProjectWizard.APK_LOCATION_KEY());
        }

        @Nullable
        @Override
        public String deriveValue(@NotNull ScopedStateStore state, @Nullable Key changedKey, @Nullable String currentValue) {
            String path = state.get(NewProjectWizard.APK_LOCATION_KEY());
            if (path == null || path.equals("")) return "";
            return new File(path).getName().substring(0, new File(path).getName().lastIndexOf("."));
        }
    };

    public static final ValueDeriver<String> PACKAGE_NAME_DERIVER = new ValueDeriver<String>() {
        @Nullable
        @Override
        public Set<Key<?>> getTriggerKeys() {
            return makeSetOf(NewProjectWizard.APK_LOCATION_KEY());
        }

        @Nullable
        @Override
        public String deriveValue(@NotNull ScopedStateStore state, Key changedKey, @Nullable String currentValue) {
            String path = state.get(NewProjectWizard.APK_LOCATION_KEY());
            if (path == null || path.equals("")) return "";
            if (!ApkGlobal$.MODULE$.isValidApk(FileUtil$.MODULE$.toUri(path))) return "";
            return NewProjectWizard.loadPackageNameFromManifestFile(new File(path));
        }
    };

    private static final ValueDeriver<String> myProjectLocationDeriver = new ValueDeriver<String>() {
        @Nullable
        @Override
        public Set<Key<?>> getTriggerKeys() {
            return makeSetOf(WizardConstants.APPLICATION_NAME_KEY);
        }

        @Nullable
        @Override
        public String deriveValue(@NotNull ScopedStateStore state, @Nullable Key changedKey, @Nullable String currentValue) {
            String name = state.get(WizardConstants.APPLICATION_NAME_KEY);
            name = name == null ? "" : name;
            name = name.replaceAll(WizardConstants.INVALID_FILENAME_CHARS, "");
            name = name.replaceAll("\\s", "");
            File baseDirectory = WizardUtils.getProjectLocationParent();
            File projectDir = new File(baseDirectory, name);
            int i = 2;
            while (projectDir.exists()) {
                projectDir = new File(baseDirectory, name + i);
                i++;
            }
            return projectDir.getPath();
        }
    };

    @NotNull
    @Override
    protected WizardStepHeaderSettings getStepHeader() {
        return ConfigureArgusProjectPath.buildConfigurationHeader();
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        myPanel = new JPanel();
        myPanel.setLayout(new GridLayoutManager(5, 2, new Insets(0, 5, 0, 0), -1, -1));
        final JLabel label1 = new JLabel();
        label1.setText("Project location:");
        myPanel.add(label1, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label2 = new JLabel();
        label2.setText("Apk Path:");
        label2.setDisplayedMnemonic('A');
        label2.setDisplayedMnemonicIndex(0);
        myPanel.add(label2, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final Spacer spacer1 = new Spacer();
        myPanel.add(spacer1, new GridConstraints(4, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        myProjectLocation = new TextFieldWithBrowseButton();
        myProjectLocation.setEditable(false);
        myPanel.add(myProjectLocation, new GridConstraints(3, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        myAppPath = new TextFieldWithBrowseButton();
        myAppPath.setEditable(false);
        myPanel.add(myAppPath, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final JLabel label3 = new JLabel();
        label3.setText("Apk Name:");
        label3.setDisplayedMnemonic('A');
        label3.setDisplayedMnemonicIndex(0);
        myPanel.add(label3, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label4 = new JLabel();
        label4.setText("Package Name:");
        label4.setDisplayedMnemonic('P');
        label4.setDisplayedMnemonicIndex(0);
        myPanel.add(label4, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        myAppName = new JLabel();
        myAppName.setText("NewApp");
        myPanel.add(myAppName, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        myPackageName = new JLabel();
        myPackageName.setText("com.example");
        myPanel.add(myPackageName, new GridConstraints(2, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    private Font $$$getFont$$$(String fontName, int style, int size, Font currentFont) {
        if (currentFont == null) return null;
        String resultName;
        if (fontName == null) {
            resultName = currentFont.getName();
        } else {
            Font testFont = new Font(fontName, Font.PLAIN, 10);
            if (testFont.canDisplay('a') && testFont.canDisplay('1')) {
                resultName = fontName;
            } else {
                resultName = currentFont.getName();
            }
        }
        return new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return myPanel;
    }
}
