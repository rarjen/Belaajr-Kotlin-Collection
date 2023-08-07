package app

fun <T> displayMutableListIterator(mutableLisIterator: MutableListIterator<T>) {
    while (mutableLisIterator.hasNext()) {
        val value = mutableLisIterator.next();
        println(value)
    }
}

fun removeOddNumber(mutableLisIterator: MutableListIterator<Int>) {
    while (mutableLisIterator.hasNext()) {
        val item = mutableLisIterator.next();
        if (item % 2 == 1) {
            mutableLisIterator.remove();
        }
    }
}

fun main() {
    /**
     * Function di Mutable List Iterator
     * next(): T
     * hasNext(): Boolean
     * remove(): Unit -> Menghapus data yang lagi di iterate
     * set(T): Unit
     * add(T): Unit
     */

    val mutableList = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    removeOddNumber(mutableList.listIterator());
    displayMutableListIterator(mutableList.listIterator())
}