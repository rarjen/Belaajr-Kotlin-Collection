package app

fun main() {
    /**
     * Map Spesific Operations
     *
     * Di Koltin juga terdapat banyak operasi khusus untuk Map
     *
     * Map Spesific Operator
     *
     * getOrElse(key, (key) -> V) => Mengambil value sesuai key, jika tidak ada eksekusi lambda
     * getValue(key) => mengambil value sesuai key, atau throw exception
     * filter((Entry<K, V>) -> Boolean) => Filter sesuai kondisi
     * filterKeys((K) -> Boolean) => Filter dengan kondisi key
     * filterValues((V) -> Boolean) => Filter dgn kondisi value
     *
     */

    val map: Map<Int, String> = mapOf(
        1 to "Otniel",
        2 to "Kevin",
        3 to "Abiel",
    )


    println(map.getValue(1)) //Otniel
//    println(map.getValue(4)) //Error
    println(map.getOrElse(4) { "Tidak ada" }) //Tidak ada
    println(map.filter { (key, value) -> value.length > 5 }); //{1=Otniel}
    println(map.filterKeys { key -> key > 2 }); //{3=Abiel}
    println(map.filterValues { value -> value.length > 5 }); //{1=Otniel}

    val map2: Map<Char, String> = mapOf(
        'a' to "Eko",
        'b' to "Kurniawan",
        'c' to "Khannedy",
    )

    map2.getOrElse('d',  { println("Tidak ada") }); //Tidak ada
    map2.getOrElse('d') { println("Null") }; //Null
    val filter = map2.filter { (key, value) -> value.length > 5 }
    println(filter); //{a=Eko}

    val filter2 = map2.filter { (key, value) -> key == 'a' }
    println(filter2);

    val filterKeys = map2.filterKeys { key -> key > 'b' }
    println(filterKeys); //{c=khannedy}

}