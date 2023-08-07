package app

fun main() {
    /**
     * Konversi Collection
     *
     * Di kotlin kita bisa melakukan konversi collection ke jenis collection lain secara mudah
     * Misal kita ingin mengubah dari array ke list, atau dari range ke set, atau dari set ke list, bisa dilakukan dengan mudah
     * Semua function dimulai dengan kata “to”, misal toList, toSet, toMutableList, dan lain-lain
     */

    val array = arrayOf(1, 2, 3, 4, 5);
    val range = 1..100;

    val list = range.toList();
    val set = list.toSet();

    val mutableList = array.toMutableList();
    val mutableSet = range.toMutableSet();

    val sortedSet = range.toSortedSet();

    for (value in mutableList) {
        println(value);
    }
}