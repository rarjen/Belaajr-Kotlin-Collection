package app

fun main() {
    /**
     * Mapping Operations untuk Map
     *
     * mapKeys(transform: (Entry<K, V> -> R) : Mengubah map menjadi map baru dengan nilai key baru sesuai dgn lambda
     * mapValues(transform: Entry<K, V> -> R) : Mengubah map menjadi map baru dengan nilai value baru sesuai dgn lambda transform
     *
     */

    val map1: Map<Int, String> = mapOf(
        1 to "Otniel",
        2 to "Kevin",
        3 to "Abiel",
    )

    val map2: Map<Int, String> = map1.mapKeys { it.key * 10 };
    val map3: Map<Int, String> = map1.mapValues { it.value.toUpperCase() };

    println(map2);
    println(map3);
}