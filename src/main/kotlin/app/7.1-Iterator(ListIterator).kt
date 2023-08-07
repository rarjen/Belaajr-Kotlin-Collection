package app

fun <T> displayListIterator(listIterator: ListIterator<T>) {
    println("Display Next")
    while (listIterator.hasNext()) {
        val value = listIterator.next();
        println(value);
    } // Maju hingga ujung

    println("Display Previous")
    while (listIterator.hasPrevious()) {
        val value = listIterator.previous();
        println(value);
    } // Saat sampe ujung balik lagi
}

fun main() {
    /*
    Iterator
    - Sebelumnya kita sudah bahas tentang Iterator di Iterable dan MutableIterator di MutableIterable
    - Iterator juga memiliki child interface, yaitu ListIterator dan MutableListIterator
    - ListIterator digunakan oleh List, dan MutableListIterator digunakan oleh MutableList
    - Set tetap menggunakan Iterator
    - Sedangkan Map tidak mendukung Iterator
     */

    // Karena ini iterator bukan iterbale maka ditambahkan .listIterator() untuk mengambil data
    displayListIterator(listOf("Otniel", "Kevin", "Abiel").listIterator())

    /*
    Output:

    Display Next
    Otniel
    Kevin
    Abiel
    Display Previous
    Abiel
    Kevin
    Otniel
     */
}