package app

fun main() {
    /**
     * Set Spesific Operations
     *
     * Di Kotlin juga terdapat operations yg khusus digunakan untuk Set
     *
     * Set Spesific Operator
     * union(collection) => Mengembalikan semua element dari kedua set (Karena set itu menyimpan data unique maka akan dipilih 1 saja datanya bila ada dupikasi)
     * intersect(collection) => Mengembalikan semua element yg terdapat di kedua set
     * substract(collection) => Mengembalikan semua element yg tidak dimiliki oleh set
     */

    val numbers1 = (1..10).toSet();
    val numbers2 = (6..15).toSet();

    println(numbers1 union numbers2); //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]
    println(numbers1.union(numbers2)); //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]

    println(numbers1 intersect numbers2); //[6, 7, 8, 9, 10]
    println(numbers1.intersect(numbers2)); //[6, 7, 8, 9, 10]

    //Mengambil data numbers1 yang tidak ada di numbers2
    println(numbers1 subtract numbers2); //[1, 2, 3, 4, 5]
    println(numbers1.subtract(numbers2)); //[1, 2, 3, 4, 5]

    //Mengambil data numbers2 yang tidak ada di numbers1
    println(numbers2 subtract numbers1); //[11, 12, 13, 14, 15]

}