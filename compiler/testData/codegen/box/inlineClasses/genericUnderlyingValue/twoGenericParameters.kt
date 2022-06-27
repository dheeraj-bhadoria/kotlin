// LANGUAGE: +GenericInlineClassParameter
// TARGET_BACKEND: JVM
// IGNORE_BACKEND: JVM
// WITH_STDLIB

@JvmInline
value class Z<T, U : T>(val value: U)

fun foo(value: Z<String, String>) {
    res = value.value
}

var res = "FAIL"

fun box(): String {
    Z("OK").let(::foo)
    return res
}