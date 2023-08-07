package app

fun main() {
    val mutableMap: MutableMap<String, String> = mutableMapOf();

    // Menambahkan data ke map
    mutableMap["a"] = "Otniel";
    mutableMap["b"] = "Kevin";
    mutableMap.put("c", "Abiel");

    // Print mutableMap
    println(mutableMap.entries); //[a=Otniel, b=Kevin, c=Abiel]

    println(mutableMap["a"]);
    println(mutableMap["b"]);
    println(mutableMap.get("c"));


    // Jika key d tidak ada maka akan ditampilkan pair key - value nya
    println(mutableMap.getOrDefault("d", "Leinto"));
    println(mutableMap["d"]); //null

    /*
    Output :

    Otniel
    Kevin
    Abiel
    Leinto
    null
     */

    mutableMap.remove("b");

    println(mutableMap["a"]);
    println(mutableMap["b"]);
    println(mutableMap.get("c"));
    /*
    Output :

    Otniel
    null
    Abiel
     */



}