package app

fun main() {
    /*
    Mutable List
    - Mutable List merupakan child class / extends dari Immutable List sehingga semua operasi yang di immutable list dapat dilakukan di mutable list
     */

    val mutableList: MutableList<String> = mutableListOf("Data Awal");

    // Menambah Data
    mutableList.add("Otniel");
    mutableList.add("Kevin");
    mutableList.add("Abiel");

    // Get data
    println(mutableList[0]);
    println(mutableList[1]);
    println(mutableList[2]);
    println(mutableList[3]);

    // Set Data
//    mutableList.set(0, "Data");
//    println(mutableList[0]);
//    mutableList[0] = "Data Diubah"
//    println(mutableList[0]);


    // Remove Value from list
    mutableList.remove("Data Awal");

    println(mutableList[0]); //Otniel

    // Remove value by id
//    mutableList.removeAt(0);

    // Check empty list
    println(mutableList.isEmpty()); //false

    // Iterable
    for (value in mutableList){
        println(value);
    }
}