package app

class Application(map: Map<String, Any>) {
    // Delegasi ke map
    val name: String by map;
    val version: Int by map
}

fun main() {
    /**
     * Properties di Map
     *
     * Salah satu hal yg biasa dilakukan dalam membuat program adl, menyimpan va;ue properties di Map
     * kadaing ini dilakukan ketika parsing dara JSON atau hal-hal dinamus lainnya
     * Dalam keadaan seperti ini, kita bisa melakukan delgate properties di Map
     *
     */

    val application = Application(mapOf(
        "name" to "Kotlin App",
        "version" to 1
    ));

    println(application.name);
    println(application.version);

}