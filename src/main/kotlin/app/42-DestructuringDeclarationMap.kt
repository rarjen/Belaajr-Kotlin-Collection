package app

fun main() {
    /**
     * Destructuring Declarations di Map
     *
     * Sebelumnya kita telah belajar destructuring declaration
     * Map menyimpan datanya dalam Entry<K,V>, dimana Entry memiliki function component1() untuk mendapatkan Key, dan component2() untuk mendapatkan Value
     * Hal ini jadi memungkinkan kita melakukan desctructuring di Entry Map
     *
     */

    val map: Map<String, String> = mapOf(
        "a" to "Otniel",
        "b" to "Kevin",
        "c" to "Abiel",
    )

    for ((key, value) in map) {
        println("$key : $value")
    }

    map.forEach { (key, value) -> println("$key : $value") };
    map.forEach { entry -> println("${entry.component1()} : ${entry.component2()}") }
}