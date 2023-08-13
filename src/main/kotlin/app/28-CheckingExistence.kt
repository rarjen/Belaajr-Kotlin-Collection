package app

fun main() {
    /**
     * Checking Resistence
     *
     * Kotlin mendukung operasi untuk mengecek apakah dalam collection terdapat data yang kita cari
     *
     * Checking Existence Operator
     * contains(element) : Boolean => Mengecek apakah terdapat element di collection
     * containsAll(Collection<T>) : Boolean => Mengecek apakah terdapat element collection T di collection
     * isEmpty() : Boolean => Mengecek apakah collection kosong
     * isNotEmpty() : Boolean Mengecek apakah collection tidak kosong
     *
     */

    val range = (1..10).toList();
    println(range.contains(5)); //true
    println(range.containsAll(listOf(7, 8, 9, 10))); //true
    println(range.isEmpty()); //false
    println(range.isNotEmpty()); //true
}