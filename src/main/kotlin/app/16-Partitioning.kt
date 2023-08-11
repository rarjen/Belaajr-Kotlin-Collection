package app

fun main() {
    /**
     * Filter : Partitioning
     *
     * Pada filtering by predicate, kita akan menghilangkan data yang tidak masuk kondisi filter
     * Dengan filtering partition, kita akan membagi collection menjadi dua, dimana collection pertama yang masuk filtering, dan collection kedua yang tidak masuk filtering
     *
     *
     * Filtering : Partition Operation
     * partition((T) -> Boolean): Pair<List<T>, List<T>>
     *     Ket: Mempartisi collection dg filtering sehingga menghasilkan Pair collection T yg masuk filter, dan
     *          collection T yang tidak masuk filter.
     */

    val list1: List<String> = listOf("Otniel", "Kevin", "Abiel");
    val list2: Pair<List<String>, List<String>> = list1.partition {it.length > 5}; // Melakukan pemisahan value dg length >5 dengan <5
    println(list2); //([Otniel], [Kevin, Abiel])
    println(list2.first) //[Otniel]
    println(list2.second) //[Kevin, Abiel]


    val list3: List<Any> = listOf(1, "Otniel", 2, "Kevin", 3, "Abiel");

    // Destructuring (Karena Pair maka bisa di destructuring)
    val listCoba : Pair<List<Any>, List<Any>> = list3.partition {it is String}
    println(listCoba); //([Otniel, Kevin, Abiel], [1, 2, 3])

    val (stringList, intList) = list3.partition{it is String};

    println(stringList); //[Otniel, Kevin, Abiel]
    println(intList); //[1, 2, 3]

    // Coba Partition Null
    val list4: List<Any?> = listOf(null, 1, "Otniel", "Kevin", null);
    val list5: Pair<List<Any?>, List<Any?>> = list4.partition {it != null}; // Melakukan pemisahan value dg length >5 dengan <5
    println(list5); //([1, Otniel, Kevin], [null, null])

    val(properList, nullList) = list4.partition { it != null}
    println(properList); //[1, Otniel, Kevin]
    println(nullList); //[null, null]
}