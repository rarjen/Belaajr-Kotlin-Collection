package app

data class Fruit(val name: String, val quantity: Int);

fun main() {
    /**
     * Ordering: Custom
     *
     * Selain menggunakan comparable bawaan kotlin, kita juga bisa membuat comparable sendiri
     * Ini cocok untuk mengurutkan data yang kita buat sendiri
     *
     * Ordering : Custom Operators
     * sortedBy(selector: (T) -> R) => Mengurutkan collection secara ascending menggunakan selector
     * sortedByDescending(selector: (T) -> R) => Mengurutkan collection secara descending menggunakan selector
     * sortedWith(Comparator<T>) => Mengurutkan collection dengan Comparator<T>
     */

    val fruits: List<Fruit> = listOf<Fruit>(
        Fruit("Apple", 10),
        Fruit("Orange", 5),
        Fruit("Banana", 7)
    );
    println(fruits.sortedBy { it.quantity }); //[Fruit(name=Orange, quantity=5), Fruit(name=Apple, quantity=10)]
    println(fruits.sortedByDescending { it.quantity }); //[Fruit(name=Apple, quantity=10), Fruit(name=Orange, quantity=5)]

    println(fruits.sortedWith(compareBy { it.quantity })); //[Fruit(name=Orange, quantity=5), Fruit(name=Apple, quantity=10)]
    println(fruits.sortedWith(compareByDescending { it.quantity })); //[Fruit(name=Apple, quantity=10), Fruit(name=Orange, quantity=5)]

    println(fruits.sortedWith(Comparator {a, b ->
        a.quantity.compareTo(b.quantity);
    })) //[Fruit(name=Orange, quantity=5), Fruit(name=Apple, quantity=10)]

    //Shorthand
//    fruits.sortedWith(compareBy { it.quantity });
//    fruits.sortedBy { it.quantity };

    // Sorted By Name
    println(fruits.sortedBy { it.name }); //[Fruit(name=Apple, quantity=10), Fruit(name=Banana, quantity=7), Fruit(name=Orange, quantity=5)]
    println(fruits.sortedBy { fruit ->  fruit.name }); //[Fruit(name=Apple, quantity=10), Fruit(name=Banana, quantity=7), Fruit(name=Orange, quantity=5)]

}