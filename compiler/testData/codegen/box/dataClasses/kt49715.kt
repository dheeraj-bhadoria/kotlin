// IGNORE_BACKEND_FIR: JVM_IR
// FIR status: [IR VALIDATION] Duplicate IR node: FUN GENERATED_DATA_CLASS_MEMBER name:toString
// IGNORE_BACKEND_FIR_WITH_IR_LINKER: JVM_IR
// CHECK_BYTECODE_LISTING
// WITH_STDLIB

import kotlin.test.*

interface A {
    fun Any.toString(): String = "hello"
}

data class B(val x: Int) : A {
    fun Any.hi() = "hi"
}

fun box(): String {
    val b = B(1)
    assertEquals("B(x=1)", b.toString())
    assertTrue(b == B(1))
    assertTrue(1.hashCode() == b.hashCode())
    return "OK"
}
