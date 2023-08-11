package app

fun main() {
    /**
     * Plus & Minus Operators
     *
     * Di kotlin, ada operator extension function plus dan minus untuk collection
     * Parameter pertama adalah collection, dan parameter selanjutnya bisa collection atau element, dan akan menghasilkan collection baru
     *
     */
    /**
     * Plus & Minus Operators
     *
     * plus(element) : Membuat collection baru dengan menambahkan element
     * plus(collection) : Membuat collection baru dengan menambahkan collection
     * minus(element) : Membuat collection baru dengan menghapus element
     * minus(collection) : Membuat collection baru dengan menghapus collection
     */

    // List
    val list1: List<String> = listOf<String>("Otniel", "Kevin", "Abiel");
    val list2: List<String> = list1 + "Programmer";
    val list3: List<String> = list1 + listOf<String>("Programmer", "Zaman", "Now");
    val list4 = list1 - "Otniel";
    val list5 = list1 - listOf<String>("Kevin", "Abiel");

    println(list2); //[Otniel, Kevin, Abiel, Programmer]
    println(list3); //[Otniel, Kevin, Abiel, Programmer, Zaman, Now]
    println(list4); //[Kevin, Abiel]
    println(list5); //[Otniel]

    // Map
    val map1: Map<String, String> = mapOf<String, String>(
        "a" to "Otniel",
        "b" to "Kevin",
    )
    val map2: Map<String, String> = map1 + mapOf<String, String>("c" to "Abiel")
    val map3 = map1 - "a";

    println(map2); //{a=Otniel, b=Kevin, c=Abiel}
    println(map3); //{b=Kevin}

}