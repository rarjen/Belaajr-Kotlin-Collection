package app

fun main() {
    /*
    Map
    - Map (atau dictionary), adalah collection yang berbentuk key-value, dimana key berperan sebagai index.
    - Key harus unik, jika kita menggunakan Key yang sama, maka data sebelumnya akan di replace oleh data yang baru
    - Tipe data key bisa menggunakan tipe data apapun sesuai yang kita inginkan
     */
    val map: Map<String, String> = mapOf(
        "a" to "Otniel",
        "b" to "Kevin",
        "c" to "Abiel",
        Pair("d", "Contoh Pair")
    )

    // Mengambil keys
    println(map.keys); //[a, b, c, d]

    // Mengambil value
    println(map.values); //[Otniel, Kevin, Abiel, Contoh Pair]

    // Mengambil entry
    println(map.entries); //[a=Otniel, b=Kevin, c=Abiel, d=Contoh Pair]

    // Bisa destructuring
    for ((key, value) in map) {
        println("$key to $value");
        /*
        Output:

        a to Otniel
        b to Kevin
        c to Abiel
        d to Contoh Pair
         */
    }




}