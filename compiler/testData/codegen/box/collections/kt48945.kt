// TARGET_BACKEND: JVM
// JVM_TARGET: 1.8
// IGNORE_BACKEND_FIR: JVM_IR
// FIR status: in progress (M.G.), different structure of f/o
// IGNORE_BACKEND_FIR_WITH_IR_LINKER: JVM_IR
// IGNORE_BACKEND: ANDROID
//  ^ NSME: java.util.AbstractMap.remove
// FULL_JDK

class Test : Map<String, String>, java.util.AbstractMap<String, String>() {
    override val entries: MutableSet<MutableMap.MutableEntry<String, String>>
        get() = throw Exception()
}

fun box(): String {
    Test().remove(null, "")
    return "OK"
}
