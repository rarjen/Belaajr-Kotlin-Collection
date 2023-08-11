package app

import java.lang.StringBuilder

fun main() {
    /**
     * Transformations: String Representation
     *
     * String Representations adl operasi transformasi utk mengubah collectingh mjd string
     */

    /**
     * String Representation Operation
     *
     * joinToString(separator, prefix, suffix) : Mengubah collection menjadi string dgn separator, prefix, dan suffix
     * joinToString(separator, prefix, suffix, transform) : Mengubah collection menjadi string dgn separator, prefix, dan suffix, namun akan diubah dalam transform terleboh dahulu
     * joinTo(Appendable, separator, prefix, suffix, transform) : Sama seprti joinToString, namun string ditambahkan ke Appendable
     */

    val names: List<String> = listOf<String>("Otniel", "Kevin", "Abiel");
    println(names.joinToString(" ", "|", "|")); //|Otniel Kevin Abiel|
    println(names.joinToString(" ", "|", "|") { value -> "Item $value" }) //|Item Otniel Item Kevin Item Abiel|


    val appendable = StringBuilder();
    names.joinTo(appendable, ",", "|", "|") { it }
    names.joinTo(appendable, " ", ">", "<") { it }
    names.joinTo(appendable, " ", "@", "@") { it }
    println(appendable.toString()); //|Otniel,Kevin,Abiel|
    //|Otniel,Kevin,Abiel|>Otniel Kevin Abiel<@Otniel Kevin Abiel@

    // Contoh PZN
    val numbers: List<Int> = (1..10).toList();
    println(numbers.joinToString()) //1, 2, 3, 4, 5, 6, 7, 8, 9, 10
}