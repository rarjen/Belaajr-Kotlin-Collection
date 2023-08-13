package app

fun main() {
    /**
     * Take & Drop Operators
     *
     * Untuk mengambil sebagian element di collection, selain menggunakan slice, kita juga bisa menggunakan operator take dan drop
     */
    /**
     * Take Operators
     *
     * take(n) => Mengambil collection diawal sejumlah n
     * takeLast(n) => Mengambil collection diakhir sejumlah n
     * takeWhile((T) -> Boolean) => Mengambil elemen dari awal selama kondisi bernilai true, jk false, maka akan berhenti
     * takeWhileLast((T) -> Boolean) => Sama seperti takeWhile, namun dimulai dari element akhir
     *
     * Drop Operators
     *
     * drop(n) => Menghapus collection diawal sejumlah n
     * dropLast(n) => Menghapus collection diakhir sejumlah n
     * dropWhile((T) -> Boolean) => Menghapus elemen dari awal selama kondisi bernilai true, jk false, maka akan berhenti
     * dropWhileLast((T) -> Boolean) => Sama seperti takeWhile, namun dimulai dari element akhir
     */

    val list : List <Int> = (1..100).toList();
    val takeList: List <Int> = list.take(20);
    val takeLastTry: List <Int> = list.takeLast(10);
    println(list.takeWhile { it < 5 }) //[1, 2, 3, 4]

    println(takeList) //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]
    println(takeLastTry) //[91, 92, 93, 94, 95, 96, 97, 98, 99, 100]

    //Contoh PZN
    val chars: List<Char> = ('a'..'z').toList();

    // Take
    println(chars.take(3)); //[a, b, c]
    println(chars.takeWhile { it < 'f' }); //[a, b, c, d, e]
    println(chars.takeLast(2)); //[y, z]
    println(chars.takeLastWhile { it > 'w' }); //[x, y, z]

    //Drop
    println(chars.drop(23)) //[x, y, z]
    println(chars.dropLast(23)) //[a, b, c]
    println(chars.dropWhile { it < 'x' }) //[x, y, z]
    println(chars.dropLastWhile { it > 'c' }) //[a, b, c]

}