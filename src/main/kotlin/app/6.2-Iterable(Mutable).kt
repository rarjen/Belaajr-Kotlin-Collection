package app

fun <T> displayIterableMutable(iterable: MutableIterable<T>) {

    // Fungsi or secara otomatis
//    for (value in iterable) {
//        println(value)
//    }

    // Manual
    val iterator = iterable.iterator();
    while (iterator.hasNext()) {
        val value = iterator.next();
//        iterator.remove() // menghapus data di iterasi saat ini
        println(value);
    }
}

fun main() {
    /*
    Iterable
    - Iterable adalah superclass dari Collection interface
    - Iterable adalah general operation untuk melakukan iterasi seluruh data di collection, atau menghapus data di collection
     */

    displayIterableMutable(mutableListOf("Otniel", "Kevin", "Abiel"));
    displayIterableMutable(mutableSetOf("Otniel", "Kevin", "Abiel"));
}