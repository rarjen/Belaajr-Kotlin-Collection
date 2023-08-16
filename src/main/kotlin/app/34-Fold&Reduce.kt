package app

fun main() {
    /**
     * Fold & Reduce
     *
     * Jika kita ingin membuat aggregate secara manual, kita bisa menggunakan operator fold dan reduce
     * Fold dan reduce merupakan operasi yang dilakukan pada element-element yang ada di collection secara iterasi sequential dan mengembalikan hasil.
     * Hasil dari fold dan reduce akan digunakan untuk iterasi selanjutnya.
     * Bisa digunakan untuk melakukan agregate yang kompleks dan apabila tidak bisa menggunakan function aggregate sebelumnya
     *
     *
     * Fold & Reduce Operator (1)
     * reduce((R, T) -> R) : R => Pada iterasi pertama, R adalah element pertama, T adalah element selanjutnya. Iterasi selanjutnya, R adalah hasil dari iterasi sebelumnya
     * fold(R, (R, T) -> R) : R => Fold sama dengan reduce, yang membedakan adalah, fold memiliki inisial value R yang bisa kita masukkan secara manual
     * (Keuntungannnya adalah R di depan bisa memilki tipe data yang berbeda dengan collection nya)
     *
     * Fold & Reduce Operator (2)
     *
     * reduceRight() & foldRight() => Sama seperti reduce() dan fold() namun dimulai dari element akhir
     * reduceIndexed() & foldIndexed() => Sama seperti reduce() dan fold() namun terdapat parameter index
     * reduceRightIndexed() & foldRightIndexec() => Sama seperti reduceIndexec() dan foldIndexec() namun dimulai dari element akhir
     *
     */

    val numbers = (1..100).toList();
    val max = numbers.reduce { acc, i ->
        if (acc < i) i
        else acc
    }

    val min = numbers.reduce { first, second ->
        if (first < second) first;
        else second
    }

    val sum = numbers.fold(0) { acc, i ->
        acc + i;
    }

    println(min); //1
    println(max); //100
    println(sum); //5050


    val names = listOf<String>("Otniel", "Kevin", "Abiel");
    val count = names.fold(0) { first, second ->
        first + 1
    }
    println(count); //3

    val coba = numbers.foldRight(0) { first, second ->
        first - second
    }
    println(coba) //50

    val coba2 = numbers.foldRight(0) { first, second ->
        first + second;
    }
    println(coba2); //5050
}