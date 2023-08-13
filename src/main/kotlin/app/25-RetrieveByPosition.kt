package app

fun main() {
    /**
     * Retrieve Single Elements by Position
     *
     * Di kotlin kita bisa mengambil satu element di collection menggunakan posisi
     * Retrieve by Position ini melakukan iterasi dari 1 hingga ke-n data yang kita ingin ambil (bijaklah menggunakan ini)
     *
     *
     * Retrieve Single Element by Position Operations: (Extension function, bukan function bawaan)
     *
     * elementAt(index) => Mengambil element pada posisi index.
     * first() => Mengambil element pertama
     * last() => Mengambil element terakhir
     * elementAtOrNull(index) => Mengambil element pada posisi index. Null jika tidak ada index
     * elementAtOrElse(index, defaultValue) => Mengambil element pada posisi index. Atau default value jk tidak ada index
     *
     */

    val list = listOf<String>("Otniel", "Kevin", "Abiel");
    println(list.first()) //Otniel
    println(list.last()) //Abiel
    println(list.elementAt(1)) //Kevin
    println(list.elementAtOrNull(10)) //null
    println(list.elementAtOrElse(10) {"none"}); //none

    // Bisa digunakan pada set (set tidak punya index / getter)
    val set = setOf<String>("Otniel", "Kevin", "Abiel");
    println(set.first()) //Otniel
    println(set.last()) //Abiel
    println(set.elementAt(1)) //Kevin
    println(set.elementAtOrNull(10)) //null
    println(set.elementAtOrElse(10) {"none"}); //none

}