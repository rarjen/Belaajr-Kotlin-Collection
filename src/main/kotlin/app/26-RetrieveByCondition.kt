package app

fun main() {
    /**
     * Retrieve Single Elements by Condition
     *
     * Selain mengambil satu element di collection berdasarkan posisi, kita juga bisa mengambil single element berdasarkan kondisi
     *
     * Retrieve Single Element by Condtition Operators:
     *
     * first((T) -> Boolean)                => Mengambil element pertama yang sesuai kondisi
     * last((T) -> Boolean)                 => Mengambil element terakhir yang sesuai dengan kondisi
     * firstOrNull((T) -> Boolean) / find() => Mengambil element pertama yang sesuai kondisi, atau null jika tidak ada
     * lastOrNull((T) -> Boolean) / findLast() => Mengambil element terakhir yang sesuai kondisi, atau null jika tidak ada
     *
     */

    val range = (1..20).toList();

    // Jika first dan last tidak ada kondisi yang terpenuhi maka akan throw exception
    println(range.first { it > 10}) //11
    println(range.last { it > 10}) //20
    println(range.firstOrNull { it > 50}) //null
    println(range.lastOrNull { it > 50}) //null
    println(range.find { it > 50}) //null
    println(range.findLast { it > 50}) //null

}