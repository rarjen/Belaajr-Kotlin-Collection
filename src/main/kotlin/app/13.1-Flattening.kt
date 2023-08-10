package app

fun main() {
    /**
     * Transformations : Flattening
     *
     * Flattening adalah operasi transformasi untuk menjadikan nested collection menjadi flat
     */
    /**
     *  Transformations : Flattening Operation
     *
     *  flatten : Mengubah nested collection menjadi flat collection
     *  flatMap((T) -> Iterable<R>) : Mengubah collection T menjadi flat collection R
     */

    val list1: List<List<String>> = listOf(
        listOf("Otniel", "Kevin", "Abiel"),
        listOf("Programmer", "Zaman", "Now")
    )

    val list2: List<String> = list1.flatten();
    println(list2); //[Otniel, Kevin, Abiel, Programmer, Zaman, Now]
}