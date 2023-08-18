package app

fun main() {
    /**
     * Sequence
     *
     * Selain List, Set dan Map, di Kotlin juga terdapat collection yang bernama Sequence
     * Sequence sekilas sama dengan collection lain, namun berbeda cara kerjanya ketika kita menambahkan banyak operasi ke sequence
     * Collection lain, ketika kita menambahkan beberapa operasi, semua akan dieksekusi secara eager. Setiap proses akan mengembalikan collection baru.
     * Berbeda dengan sequence, sequence mengeksekusi semua operasi secara lazy. Hanya akan dieksekusi ketika dibutuhkan
     *
     */

    // Kode bukan sequence (Operasi nya eager yang mana setiap ditambahkan operasi maka langsung di eksekusi)
    // Jadi saat kita mngambil 4 maka akan di eksekusi semuanya
    // Asumsi kita punya data 1000 maka akan dieksekusi semua 1000 data pdhl cuma butuh 4
//    val words = "The quick brown fox jumps over the lazy dog".split(" "); //words menjadi listOf<String>
//
//    val lengthList = words
//        .filter {
//            println("filter : $it");
//            it.length > 3;
//        }
//        .map {
//            println("length: ${it.length}");
//            it.toUpperCase();
//        }
//        .take(4);
//
//    println("Lengths of first 4 words longer than 3 chars: ");
//    println(lengthList);


    // Kode Sequence
    val words2 = "The quick brown fox jumps over the lazy dog".split(" ");
    val wordsSequence = words2.asSequence()

    val lengthSequence = wordsSequence
        .filter {
            println("filter: $it");
            it.length > 3;
        }
        .map {
            println("map: $it");
            it.toUpperCase();
        }
        .take(4);

    println("Lengths of first 4 words longer than 3 chars: ");
    println(lengthSequence.toList());
}