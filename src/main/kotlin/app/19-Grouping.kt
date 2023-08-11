package app

fun main() {
    /**
     * Grouping
     *
     * Grouping adl operasi utk meng-grup kan element-element yg ada di collection
     */
    /**
     * Grouping Operators
     *
     * groupBy((T) -> K): Map<K, List<T>> => Menggabungkan collection menjadi group Map<K, List<T>>
     * groupingBy((T) -> K) : Grouping<K, T>
     *     -> Menggabungkan collection menjadi object Grouping<K, T>
     *     -> Grouping interface akan dibahas lebih detail di materi terpisah
     *
     */

    val list1 = listOf<String>("a", "a", "b", "b", "c", "c", "c", "d");
//    val map: Map<String, List<String>> = list1.groupBy { it };
    val map: Map<String, List<String>> = list1.groupBy { value -> value }; // membuat key sama dengan value
    val grouping: Grouping<String, String> = list1.groupingBy { it };

    println(map); //{a=[a, a], b=[b, b], c=[c, c, c], d=[d]}
    println(map["a"]); //[a, a]
    println(grouping); //app._19_GroupingKt$main$$inlined$groupingBy$1@6193b845


    // Contoh PZN (panjang value sabagai key)
    val list2 = list1 + listOf<String>("Otniel", "Kevin", "Abiel");
    val map2: Map<Int, List<String>> = list2.groupBy { it.length };
//    val map2: Map<Int, List<String>> = list2.groupBy { value -> value.length };
    println(map2) //{1=[a, a, b, b, c, c, c, d], 6=[Otniel], 5=[Kevin, Abiel]}
}