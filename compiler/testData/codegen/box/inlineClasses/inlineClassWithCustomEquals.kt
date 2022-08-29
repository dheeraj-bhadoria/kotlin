// IGNORE_BACKEND_FIR: JVM_IR
// FIR status: not supported in JVM
// IGNORE_BACKEND_FIR_WITH_IR_LINKER: JVM_IR
// IGNORE_BACKEND: JVM
// IGNORE_BACKEND: JVM_IR
// WITH_STDLIB
// WORKS_WHEN_VALUE_CLASS
// LANGUAGE: +ValueClasses

@file:Suppress("RESERVED_MEMBER_INSIDE_VALUE_CLASS")

OPTIONAL_JVM_INLINE_ANNOTATION
value class Z(val data: Int) {
    override fun equals(other: Any?): Boolean =
        other is Z &&
                data % 256 == other.data % 256
}

fun box(): String {
    if (Z(0) != Z(256)) throw AssertionError()

    return "OK"
}