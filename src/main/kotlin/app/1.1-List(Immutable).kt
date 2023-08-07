package app

fun main() {
    /*
    List
    - List, adalah collection yang datanya seperti Array dan memiliki akses data menggunakan index
    - Data di List boleh duplicate, artinya kita boleh memasukkan data yang sama berkali-kali ke dalam sebuah List yang sama
    - Data list adalah immutable yang berarti kita hanya bisa mengambil data nya
    */

    val list: List<String> = listOf("Otniel", "Kevin", "Abiel");

    println(list[0]);
    println(list[1]);
    println(list[2]);

    // Print index ke-n dari value x
    println(list.indexOf("Kevin")); //1
    println(list.indexOf("Nothing")); //-1

    // Cek apakah value ada
    println(list.contains("Abiel")); //true
    println(list.contains("Nothing")); //false

    // Mengecek di list apakah semua value x ada didlm list
    println(list.containsAll(listOf("Otniel", "Abiel"))); //true
    println(list.containsAll(listOf("Otniel", "Nothing"))); //false

    // Mengecek apakah list empty
    println(list.isEmpty()); //false

    // Mengecek apakah tidak empty
    // Bukan bawaan dari kotlin, tapi merupakan extension function yang melakukan operasi kebalikan dari isEmpty()
    println(list.isNotEmpty()); //true

}