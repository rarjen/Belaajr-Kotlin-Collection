package app

fun main() {
    /**
     * List Spesific Operation
     *
     * Di Kotlin banyak operasi yg khusus dinuat untuk list
     *
     * List Spesific Operator (1)
     *
     * getOrElse(index, (index) -> T) => Mengambil element di index, jika tidak ada, mengembalikan nilai lambda
     * getOrNull(index) => Mengambil element di index, jika tidak ada, mengembalikan null
     * subList(from, to) => Mengambil semua element dari from (inclusive) ke to (exclusive)
     * binarySearch(value) => Melakukan pencarian menggunakan algoritma binary search (Data harus terurut)
     *
     * List Spesific Operator (2)
     * indexOf(value) => Mengambil index element yang sama dengan value
     * lastIndexOf(value) => Mengambil index element terakhir yang sama dengan value (Digunakan misal ada data duplicate sehingga diambil data paling terakhir)
     * indexOfFirst((T) -> Boolean) => Mengambil index element yang sama dengan kondisi
     * indexOfLast((T) -> Boolean) => Mengambil index element terakhir yang sama dengan kondisi
     *
     */

    val list = listOf<String>("Otniel", "Kevin", "Abiel");
    println(list.get(1)); //Kevin
    println(list.getOrNull(10)) //null
    println(list.getOrElse(10) { index -> 0 }) //0
    println(list.getOrElse(10) { index -> "Tidak ada" }) //Tidak ada
    println(list.subList(0, 2)); //[Otniel, Kevin] Ambil data dari index 0-1

    val sortedList = list.sorted();
    println(sortedList.binarySearch("Kevin")); //1 (hasil kembaliannya adalah index)
    println(list.binarySearch("Abiel")); //-1 (Tidak ditemukan krn tidak terurut)


    val numbers = listOf<Int>(1, 1, 2, 2, 3, 3, 4, 4, 5, 5);
    println(numbers.indexOf(2)); //2
    println(numbers.lastIndexOf(2)); //3

    println(numbers.indexOfFirst { it > 3 });//6
    println(numbers.indexOfLast { it > 3 });//9

}