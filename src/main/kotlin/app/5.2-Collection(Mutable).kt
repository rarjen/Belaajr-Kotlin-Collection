package app

fun <T> displayMutableCollection(collection: MutableCollection<T>) {
    for (item in collection) {
        println(item);
    }
}

fun main() {
    // Ini merupakan turunan dari collection sehingga bisa implement fun dari collection


    displayMutableCollection(mutableListOf("Otniel", "Kevin", "Abiel"));
    displayMutableCollection(mutableSetOf("Otniel", "Kevin", "Abiel"));
    displayMutableCollection(mutableMapOf("a" to "Kevin").entries);


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