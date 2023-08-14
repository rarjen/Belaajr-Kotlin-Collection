package app

fun main() {
    /**
     * Ordering Natural
     *
     * Mengurutkan data sudah menjadi salah satu kebiasaan yang kita lakukan saat membuat program
     * Kotlin mendukung operasi untuk mengurutkan collection
     * Pada materi Kotlin Generic kita sudah belajar tentang interface Comparable, yaitu interface yang digunakan untuk melakukan perbandingan dua buat object, yang biasanya digunakan untuk mengurutkan data
     * Secara default tipe data yang ada di kotlin sudah memiliki Comparable (seperti Number, Char atau String). Oleh karena itu kita tidak perlu lagi membuat Comparable sendiri untuk mengurutkan data tersebut
     *
     *
     * Ordering : Natural Operator
     * sorted() => Mengurutkan collection scr asc
     * sortedDescending() => Mengurutkan collection scr desc
     */

    val numbers: List<Int> = listOf(1, 4, 2, 4, 6, 3, 5);
    println(numbers.sorted()); //[1, 2, 3, 4, 4, 5, 6]
    println(numbers.sortedDescending()); //[6, 5, 4, 4, 3, 2, 1]

    val chars: List<Char> = listOf('d', 'a', 'z', 'c', 'a', 'x');
    println(chars.sorted()); //[a, a, c, d, x, z]
    println(chars.sortedDescending()); //[z, x, d, c, a, a]
}