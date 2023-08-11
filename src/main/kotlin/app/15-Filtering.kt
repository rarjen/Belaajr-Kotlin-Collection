package app

fun main() {
    /**
     * Filtering by Predicate
     *
     * Filtering adalah salah satu operasi collection yg sangat populer
     * Di Kotlin, filtering bisa menggunakan predicate berupa lambda yg berisi kondisi filter nya
     * Jika return dari predicate tersebut true, maka data di terima, jika false maka data dibuang
     */

    /**
     * Filtering by Predicate Operation
     *
     * filter((T) -> Boolean) : Melakukan filtering terhadap collection
     * filterIndexed((index, T) -> Boolean) : Melakukan filtering terhadap collection, dengan tambahan informasi index
     * filterNot((T) -> Boolean) : Kebalikan dari filter ((T) -> Boolean)
     * filterIsInstance<T>() : Mengambil hanya data instant dari T
     * filterNotNull() : Mengambil hanya data yang tidak null
     */

    val list1: List<String> = listOf("Otniel", "Kevin", "Abiel");
    val list2: List<String> = list1.filter { it.length > 5 }; // Mencari value yg punya pjg diatas 5
    println(list2) //[Otniel]

    val list3: List<String> = list1.filterIndexed { index, value -> index % 2 == 0 } // Mencari value dgn index ganjil
    println(list3) //[Otniel, Abiel]

    val list4: List<Any?> = listOf(null, 1, "Otniel", "Kevin", null);
    val list5: List<String> = list4.filterIsInstance<String>(); // Melakukan filter tipe data string pada list
    val list6: List<Int> = list4.filterIsInstance<Int>(); // Melakukan filter tipe data int pada list
    val list7: List<Any> = list4.filterNotNull(); // Melakukan exclude filter pada tipe data null

    println(list5) //[Otniel, Kevin]
    println(list6) //[1]
    println(list7) //[1, Otniel, Kevin]

}