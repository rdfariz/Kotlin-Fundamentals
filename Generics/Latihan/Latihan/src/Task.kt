// Coming Soon
fun main() {
    val stringResult = getResult("Kotlin")
    val intResult = getResult(100)

    // TODO 2
    println("String result: $stringResult")
    println("Int result: $intResult")
}

// TODO 1
fun <T> getResult(args: T): Int {
    return when(args) {
        is Int -> args.toInt() * 5
        is String -> args.toString().length
        else -> 0
    }
}