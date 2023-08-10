package app

fun main() {
    /**
     * Transformations: Unzip Operations
     *
     * unzip() : Mengubah collection Pair<T1, T2> menjadi dua collection, collection 1 dan collection 2
     * Unzip hanya bisa digunakan untuk Pair. Jadi list harus tipe data berupa pair
     */

    val list: List<Pair<String, String>> = listOf(
        "1" to "Otniel",
        "2" to "Kevin",
        "3" to "Abiel",
    )

    val pair: Pair<List<String>, List<String>> = list.unzip();
    println(pair); //([1, 2, 3], [Otniel, Kevin, Abiel])
    println(pair.first) //[1, 2, 3]
    println(pair.first[0]); //1
    println(pair.second); //[Otniel, Kevin, Abiel]

    // Melakukan destructuring
    println("Destructuring")
    val (list1, list2) = list.unzip();
    println(list1) //[1, 2, 3]
    println(list2) //[Otniel, Kevin, Abiel]


    // Try
    val listTry: List<Pair<Int, String>> = listOf(
        1 to "L",
        2 to "E",
        3 to "I",
        4 to "N",
        5 to "T",
        6 to "O",
    )
    val lists: Pair<List<Int>, List<String>> = listTry.unzip();

    println(lists); //([1, 2, 3, 4, 5, 6], [L, E, I, N, T, O])
}