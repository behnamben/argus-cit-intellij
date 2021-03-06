/*
 * Copyright (c) 2016. Fengguo (Hugo) Wei and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Detailed contributors are listed in the CONTRIBUTOR.md
 */

package org.argus.cit.intellij.jawa.lang.psi.stubs.impl

import com.intellij.psi.PsiElement
import com.intellij.psi.stubs.{IStubElementType, StubElement}
import com.intellij.util.io.StringRef
import org.argus.cit.intellij.jawa.lang.psi.JawaExtendsAndImplementsClause
import org.argus.cit.intellij.jawa.lang.psi.stubs.JawaExtendsAndImplementsClauseStub
import org.argus.jawa.core.JawaType

/**
  * @author <a href="mailto:fgwei521@gmail.com">Fengguo Wei</a>
  */
class JawaExtendsAndImplementsClausesStubImpl [ParentPsi <: PsiElement](parent: StubElement[ParentPsi],
                                                                        elemType: IStubElementType[_ <: StubElement[_ <: PsiElement], _ <: PsiElement])
  extends StubBaseWrapper[JawaExtendsAndImplementsClause](parent, elemType) with JawaExtendsAndImplementsClauseStub {

  private var extType: StringRef = _
  private var impTypes: Array[StringRef] = _

  def this(parent: StubElement[ParentPsi],
           elemType: IStubElementType[_ <: StubElement[_ <: PsiElement], _ <: PsiElement],
           extType: String,
           impTypes: Array[String]) = {
    this(parent, elemType.asInstanceOf[IStubElementType[StubElement[PsiElement], PsiElement]])
    this.extType = StringRef.fromString(extType)
    this.impTypes = impTypes map StringRef.fromString
  }

  def this(parent: StubElement[ParentPsi],
           elemType: IStubElementType[_ <: StubElement[_ <: PsiElement], _ <: PsiElement],
           extType: StringRef,
           impTypes: Array[StringRef]) = {
    this(parent, elemType.asInstanceOf[IStubElementType[StubElement[PsiElement], PsiElement]])
    this.extType = extType
    this.impTypes = impTypes
  }

  override def getExtendType: JawaType = {
    if(this.extType != null) new JawaType(StringRef.toString(this.extType))
    else null
  }

  override def getInterfaceTypes: Array[JawaType] = {
    this.impTypes.map(t => new JawaType(StringRef.toString(t)))
  }
}
