package app

fun <T> displayCollection(collection: Collection<T>) {
    for (element in collection) {
        println(element);
    }
}

fun main() {
    /*
    Collection
    - Semua data collection adl turunan dari Interface Collection
    - Collection digunakan sebagai general operation thd struktur data collection, seperti membaca dan menulis data di collection
     */

    // Mirip Polymorphism
    displayCollection(listOf("Otniel", "Kevin", "Abiel"));
    displayCollection(setOf("Otniel", "Kevin", "Abiel"));
    displayCollection(mapOf("a" to "Otniel").entries);
//    displayCollection(mapOf("Otniel", "Kevin", "Abiel")); //error: mapOf bukan extends/turunan dari Collection

    /*
    Output:

    Otniel
    Kevin
    Abiel
    Otniel
    Kevin
    Abiel
    a=Otniel
     */
}