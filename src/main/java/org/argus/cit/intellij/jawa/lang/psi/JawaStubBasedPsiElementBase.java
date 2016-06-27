/*
 * Copyright (c) 2016. Fengguo Wei and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Detailed contributors are listed in the CONTRIBUTOR.md
 */

package org.argus.cit.intellij.jawa.lang.psi;

import com.intellij.extapi.psi.StubBasedPsiElementBase;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.ResolveState;
import com.intellij.psi.scope.PsiScopeProcessor;
import com.intellij.psi.stubs.IStubElementType;
import com.intellij.psi.stubs.StubElement;
import org.jetbrains.annotations.NotNull;

/**
 * @author <a href="mailto:fgwei521@gmail.com">Fengguo Wei</a>
 */
public class JawaStubBasedPsiElementBase<T extends StubElement> extends StubBasedPsiElementBase<T> implements JawaPsiElement {
    public JawaStubBasedPsiElementBase(@NotNull T stub, @NotNull IStubElementType nodeType) {
        super(stub, nodeType);
    }
    public JawaStubBasedPsiElementBase(@NotNull ASTNode node) {
        super(node);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" + getElementType().toString() + ")";
    }

    @Override
    public <T extends JawaPsiElement> T findChildByClassJawa(Class<T> clazz) {
        return findChildByClass(clazz);
    }

    @Override
    public <T extends JawaPsiElement> T[] findChildrenByClassJawa(Class<T> clazz) {
        return findChildrenByClass(clazz);
    }

//    @Override
//    public boolean processDeclarations(@NotNull PsiScopeProcessor processor, @NotNull ResolveState state, PsiElement lastParent, @NotNull PsiElement place) {
//        return
//    }
}
