/*
 * Copyright (c) 2016. Fengguo (Hugo) Wei and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Detailed contributors are listed in the CONTRIBUTOR.md
 */

package org.argus.cit.intellij.jawa.lang.psi.types.api

import org.argus.jawa.core.JawaType


/**
  * @author <a href="mailto:fgwei521@gmail.com">Fengguo Wei</a>
  */
trait JawaTypePresentation extends TypeSystemOwner {
  final def presentableText(`type`: JawaType) = `type`.jawaName

  final def canonicalText(`type`: JawaType) = `type`.canonicalName
}