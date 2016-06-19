/*
 * Copyright (c) 2016. Fengguo Wei and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Detailed contributors are listed in the CONTRIBUTOR.md
 */

package org.argus.cit.intellij.core.lang

import com.intellij.openapi.fileTypes.{FileTypeConsumer, FileTypeFactory}

/**
 * @author <a href="mailto:fgwei521@gmail.com">Fengguo Wei</a>
 */
class JawaFileTypeFactory extends FileTypeFactory {
    def createFileTypes(fileTypeConsumer: FileTypeConsumer) {
        fileTypeConsumer.consume(JawaFileType, "pilar")
    }
}