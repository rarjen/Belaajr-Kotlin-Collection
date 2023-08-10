package app

fun main() {
    /**
     * Transformations: Mapping
     *
     * Transformasi mapping digunakan untuk mengubah data ke data lain. (ex: mengubah listOf<String> mjd listOf<Int>)
     * Mapping akan membutuhkan lambda function sebagai parameter, dan akan mengembalikan collection hasil result lambda nya
     * Urutan collection baru hasil dari mapping adalah sama dengan urutan collection aslinya.
     *
     */

    /**
     * Transformations: Mapping Operations
     *
     * map(transform: (T) -> R) : Mengubah collection mjd collection baru sesuai lambda transform
     * mapIndexed(transform: (index, T) -> R) : mengubah collection menjadi collection baru, dg tambahab param index
     * mapNotNull(transform: (T) -> R) : Sama seperti map(), namun menghiraukan hasil null
     * mapIndexedNotNull(transform: (index, T) -> R) : sama seperti mapIndexed(), namun menghiraukan nilai null
     */

    // Example
    // Merupakan extension function dari iterble bukan bawaan list
    val list1: List<String> = listOf("Otniel", "Kevin", "Abiel");
    val list2: List<String> = list1.map { item -> item.toUpperCase() }; // membuat collection baru dengan value di uppercase

    // cara lain
//    val list2: List<String> = list1.map { it.toUpperCase() }; // membuat collection baru dengan value di uppercase
    val lists: List<Int> = list1.map { it.length }; // menggunakan it krn lambda memiliki 1 param saja
    println(lists) //[6, 5, 5]
    val list3: List<Int> = list1.map { item -> item.length } // membuat collction baru dengan panjang masing" data -> [6, 5, 5]
    val list4: List<String> = list1.mapNotNull { value ->
        // Jika value = Otniel maka return value, selebihnya null
        if (value == "Otniel") value else null; //Otniel
    }


    // Cara manual uppercase list1
    val temp = mutableListOf<String>();
    for (value in list1) {
        temp.add(value.toUpperCase());
    }
    val upperCase = temp.toList();

    println(upperCase); //[OTNIEL, KEVIN ABIEL]
    println(upperCase[0]); //OTNIEL


    // Bisa digunakan di set
    val set1 = setOf("Verstappen", "Hamilton", "Bottas");
    val set2 = set1.map { it.toLowerCase() };
    println(set2);  //[verstappen, hamilton, bottas]


    // Map Indexed Not Null (melakukan ignore pada null)
    val names = listOf("Ribery", "Robben", "Lewandowski", "Muller", "Kimmich", "Neuer");
    val namesGanjil = names.mapIndexedNotNull { index, name ->
        if (index % 2 == 0) null
        else name

    }
    println(namesGanjil);


    val numbers = (1..100).toList();
    val ganjil = numbers.mapNotNull {
        if (it % 2 == 0) null;
        else it;
    }
    println(ganjil);

    // Bisa digunakan untuk filtering juga

}