package app

import data.Person

fun main() {
    /*
    Set
    - Set, adalah collection yang datanya harus unik dan tidak pasti berurut
    - Saat kita memasukkan data tidak pasti urut sesaui urutan input kita
    - Saat kita memasukkan data duplicate ke Set, maka data hanya akan disimpan satu, data duplicatenya tidak akan
      ditambahkan ke dalam Set
    - Set sangat cocok untuk menyimpan data yang emang unik, tidak boleh sama
    - Set menggunakan function hashCode() dan equals() untuk membandingkan apakah sebuah object sama atau tidak, jika
      hashCode() dan equals() nya sama, maka diangkap data tersebut duplicate, dan tidak akan diterima oleh Set
     */

    val set: Set<Person> = setOf(
        Person("Otniel"), Person("Kevin"), Person("Abiel"), Person("Kevin"), Person("Abiel")
    );


    println(set.size); //3
    println(set.contains(Person("Kevin"))) //true
    println(set.contains(Person("Nothing"))) //false

    for (person in set) {
        println(person);
    }

    /*
    Output:

    Person with name Otniel
    Person with name Kevin
    Person with name Abiel
     */
}