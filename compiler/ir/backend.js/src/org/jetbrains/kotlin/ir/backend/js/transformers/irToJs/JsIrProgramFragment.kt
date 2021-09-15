/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.ir.backend.js.transformers.irToJs

import org.jetbrains.kotlin.ir.symbols.IrClassSymbol
import org.jetbrains.kotlin.js.backend.ast.JsGlobalBlock

class JsIrProgramFragment {
    val declarations = JsGlobalBlock()
    val classes = mutableMapOf<IrClassSymbol, JsIrClassModel>()
    val initializers = JsGlobalBlock()
}