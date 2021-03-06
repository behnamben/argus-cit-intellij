/*
 * Copyright (c) 2016. Fengguo (Hugo) Wei and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Detailed contributors are listed in the CONTRIBUTOR.md
 */

package org.argus.cit.intellij.jawa.lang.structureview.elements.impl

import com.intellij.ide.util.treeView.smartTree.TreeElement
import com.intellij.navigation.ItemPresentation
import org.argus.cit.intellij.jawa.lang.psi.JawaClassOrInterfaceDeclaration
import org.argus.cit.intellij.jawa.lang.structureview.elements.JawaStructureViewElement
import org.argus.cit.intellij.jawa.lang.structureview.presentations.impl.JawaClassItemPresentation
import org.argus.jawa.core.util._

import collection.JavaConverters._

/**
  * @author <a href="mailto:fgwei521@gmail.com">Fengguo Wei</a>
  */
class JawaClassStructureViewElement(element: JawaClassOrInterfaceDeclaration) extends JawaStructureViewElement(element, false) {
  def getPresentation: ItemPresentation = new JawaClassItemPresentation(element)
  def getChildren: Array[TreeElement] = {
    val children: MSet[TreeElement] = msetEmpty
    element.getMethodDeclarationList.asScala.foreach { md =>
      children += new JawaMethodStructureViewElement(md)
    }
    element.getInstanceFieldDeclarationBlock.getInstanceFieldDeclarationList.asScala.foreach { fd =>
      children += new JawaFieldStructureViewElement(fd.getFieldDeclaration)
    }
    element.getStaticFieldDeclarationList.asScala.foreach { fd =>
      children += new JawaFieldStructureViewElement(fd.getFieldDeclaration)
    }
    children.toArray
  }
}
