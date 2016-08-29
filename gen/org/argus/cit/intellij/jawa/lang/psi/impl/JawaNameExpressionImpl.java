/*
 * Copyright (c) 2016. Fengguo (Hugo) Wei and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Detailed contributors are listed in the CONTRIBUTOR.md
 */

// This is a generated file. Not intended for manual editing.
package org.argus.cit.intellij.jawa.lang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.argus.cit.intellij.jawa.lang.psi.JawaElementTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.argus.cit.intellij.jawa.lang.psi.*;

public class JawaNameExpressionImpl extends ASTWrapperPsiElement implements JawaNameExpression {

  public JawaNameExpressionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JawaVisitor visitor) {
    visitor.visitNameExpression(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JawaVisitor) accept((JawaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public JawaStaticFieldNameSymbol getStaticFieldNameSymbol() {
    return PsiTreeUtil.getChildOfType(this, JawaStaticFieldNameSymbol.class);
  }

  @Override
  @Nullable
  public JawaVarSymbol getVarSymbol() {
    return PsiTreeUtil.getChildOfType(this, JawaVarSymbol.class);
  }

}
