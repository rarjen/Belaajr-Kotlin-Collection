package app

fun main() {
    /**
     * Collection Operations
     *
     * Kotlin sudah menyediakan berbagai macam operation yang bisa kita lakukan di collection
     * Sebelumnya kita sudah bahas banyak sekali operasi yang tersedia sebagai function bawaan collection
     * Kotlin juga menyediakan operations tambahan berubah extension function
     * Collection operations berupa extension function selalu menghasilkan collection baru, tanpa mengubah data di collection aslinya
     * Oleh karena itu, collection operations di Kotlin sangat aman ketika dilakukan karena tidak akan mengubah collection aslinya
     */

    /**
     * Jenis Operations
     *
     * Transformations, melakukan transformasi terhadap collection
     * Filtering, melakukan filtering atau seleksi terhadap collection
     * plus and minus operators, operasi + dan - terhadap collection
     * Grouping, melakukan pemisahan dalam group terhadap collection
     * Retrieving collection parts, mengambil sebagian data di collection
     * Retrieving single elements, mengambil satu data di collection
     * Ordering, melakukan pengurutan data di collection
     * Aggregate operations, melakukan agregasi terhadap data yang ada di collection
     *
     */


    // Biasanya kita melakukan ini
//    for (value in listOf("Otniel", "Kevin", "Abiel")) {
//        println(value);
//    }

    // ForEach
    listOf("Otniel", "Kevin", "Abiel").forEach {
        println(it);
    }

    mutableListOf("Otniel", "Kevin", "Abiel").forEachIndexed { index, value ->
        println("$index: $value");
    }

    /**
     * Output:
     *
     * Otniel
     * Kevin
     * Abiel
     * 0: Otniel
     * 1: Kevin
     * 2: Abiel
     */

    // Bisa digunakan pada setOf juga krn extension function dari iterable. Jadi semua class turunan dari iterable bisa digunakan

    setOf("Otniel", "Kevin", "Abiel").forEach {
        println(it);
    }

    mutableSetOf("Otniel", "Kevin", "Abiel").forEachIndexed { index, value ->
        println("$index: $value");
    }

    /**
     * Output:
     *
     * Otniel
     * Kevin
     * Abiel
     * 0: Otniel
     * 1: Kevin
     * 2: Abiel
     */
}