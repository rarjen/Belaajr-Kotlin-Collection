package app

fun main() {
    /**
     * Ordering : Random
     *
     * Di Kotlin, kita juga bisa mengacak isi element di collection
     *
     * Ordering : Random Operator
     * shuffled() => Membuat collection baru dgn posisi element random
     */

    val numbers = (1..10).toList();
    println(numbers.shuffled());
    println(numbers.shuffled());
    println(numbers.shuffled());
    println(numbers.shuffled());
}