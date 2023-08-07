package app

fun <T> displayIterable(iterable: Iterable<T>) {

    // Fungsi or secara otomatis
//    for (value in iterable) {
//        println(value)
//    }

    // Manual
    val iterator = iterable.iterator();
    while (iterator.hasNext()) {
        val value = iterator.next();
        println(value);
    }
}

fun main() {
    /*
    Iterable
    - Iterable adalah superclass dari Collection interface
    - Iterable adalah general operation untuk melakukan iterasi seluruh data di collection, atau menghapus data di collection
     */

    displayIterable(listOf("Otniel", "Kevin", "Abiel"));
    displayIterable(setOf("Otniel", "Kevin", "Abiel"));
}