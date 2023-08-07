package app

fun main() {
    /*
    Pair
    Sebelum kita bahas collection Map, ada baiknya kita mengenal Pair
    Pair adalah representasi dari data yang berpasangan
    Di Map, Pair digunakan sebagai data Map ketika pertama kali Map dibuat
     */

    val pair1 = Pair("Otniel", "Kevin");
    println(pair1.first); //Otniel
    println(pair1.second); //Kevin

    // Cara lain menggunakan pair
    val pair2: Pair<String, String> = "Verstappen" to "Perez"
    println(pair2.first); //Verstappen
    println(pair2.second); //Perez
}