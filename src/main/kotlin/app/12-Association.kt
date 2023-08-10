package app

fun main() {
    /**
     * Transformations: Assocaition
     *
     * Association adalah operasi transformasi dari collection menjadi map
     * Dalam beberapa operasi association, element hasil bisa menjadi key atau value
     *
     */
    /**
     * Transformations: Association Operation
     *
     * associate((T) -> Pair<K, V>) : Merubah collection T menjadi Map<K, V>
     * associateWith(T -> V) : Merubah collection T menjadi Map<T, V>
     * associateBy(T -> K) : Merubah collection T menjadi Map<K, T>
     */

    val list1 = listOf<String>("Otniel", "Kevin", "Abiel");
    val map1: Map<String, Int> = list1.associate { Pair(it, it.length) }; // value nya length tiap string
    val map2: Map<String, Int> = list1.associateWith { it.length };
    val map3: Map<Int, String> = list1.associateBy { it.length }; // value nya adalah String.

    println(map1) //{Otniel=6, Kevin=5, Abiel=5}
    println(map2) //{Otniel=6, Kevin=5, Abiel=5}
    println(map3) //{6=Otniel, 5=Abiel} -> Hanya di print 2 karena 5=Kevin ditimpa oleh 5=Abiel
}