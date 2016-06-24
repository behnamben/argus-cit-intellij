// This is a generated file. Not intended for manual editing.
package org.argus.cit.intellij.jawa.lang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.argus.cit.intellij.jawa.lang.psi.JawaElementTypes.*;
import org.argus.cit.intellij.jawa.lang.psi.mixins.JawaAccessFlagAnnotationImplMixin;
import org.argus.cit.intellij.jawa.lang.psi.*;
import com.intellij.psi.stubs.IStubElementType;

public class JawaAccessFlagAnnotationImpl extends JawaAccessFlagAnnotationImplMixin implements JawaAccessFlagAnnotation {

  public JawaAccessFlagAnnotationImpl(ASTNode node) {
    super(node);
  }

  public JawaAccessFlagAnnotationImpl(org.argus.cit.intellij.jawa.lang.psi.stubs.JawaAccessFlagStub stub, IStubElementType nodeType) {
    super(stub, nodeType);
  }

  public void accept(@NotNull JawaVisitor visitor) {
    visitor.visitAccessFlagAnnotation(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JawaVisitor) accept((JawaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PsiElement getId() {
    return findChildByType(ID);
  }

  public String[] getModifiers() {
    return JawaPsiImplUtil.getModifiers(this);
  }

}
