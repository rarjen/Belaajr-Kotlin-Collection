package app

fun main() {
    /**
     * Ordering : Reverse
     *
     * Di Kotlin, kita bisa mendapatkan collection dengan urutan data terbalik dari data aslinya
     *
     * reversed() => Membuat collection baru dengan urutan terbalik dari collection aslinya
     * asReversed() => Membuat view terhadap collection dengan urutan terbalik, jika collection aslinya berubah, view pun akan ikut berubah
     *
     */

    val list1 = mutableListOf<String>("Otniel", "Kevin", "Abiel");
    val listReverse = list1.reversed();
    val listAsReverse = list1.asReversed();
    list1.add("Programmer");
    println(listReverse); //[Abiel, Kevin, Otniel]
    println(listAsReverse); //[Programmer, Abiel, Kevin, Otniel]
}