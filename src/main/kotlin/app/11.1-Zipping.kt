package app

fun main() {
    /**
     * Transformations: Zipping
     *
     * Zipping adalah transformasi yg digunakan untuk menggabungkan dua buah collection
     */
    /**
     * Transformations: Zipping Operations
     *
     * zip(collection) : Menggabungkan dua collection, sehingga menghasilkan pair <T1, T2>
     * zip(collection, transform: (T1, T2) -> R) : Menggabungkan dua collection dengan lambda transform sehingga menghasilkan collection baru dari result lambda transform
     */

    val list1 = listOf("Otniel", "Kevin", "Abiel");
    val list2 = listOf("Progammer", "Zaman", "Now");

    val list3: List<Pair<String, String>> = list1.zip(list2);
    val list4: List<String> = list1.zip(list2) { item1, item2 ->
        item1 + item2;
    }
    println(list3); //[(Otniel, Progammer), (Kevin, Zaman), (Abiel, Now)]
    println(list4); //[OtnielProgammer, KevinZaman, AbielNow]


    val listNumber1 = listOf(1, 2, 3, 4, 5);
    val listNumber2 = listOf(6, 7, 8, 9, 10);

    // Kita bisa melakukan operasi apa saja yang kita mau
    val totalNumber: List<Int> = listNumber1.zip(listNumber2) { item1, item2 ->
        item1 + item2;
    }

    val pairNumber: List<Pair<Int, Int>> = listNumber1.zip(listNumber2);

    println(pairNumber) //[(1, 6), (2, 7), (3, 8), (4, 9), (5, 10)]
    println(totalNumber) //[7, 9, 11, 13, 15]


    val campur1 = listOf<String>("Otniel", "Kevin", "Abiel");
    val campur2 = listOf<Int>(1, 2, 3);
    val campur3: List<Pair<String, Int>> = campur1.zip(campur2);
    println(campur3); //[(Otniel, 1), (Kevin, 2), (Abiel, 3)]

    // Otomatis di konversi ke string
    val campur4: List<String> = campur1.zip(campur2) { item1, item2 ->
        item1 + item2;
    }
    println(campur4); //[Otniel1, Kevin2, Abiel3]


    // Contoh Pair tidak sama
    val try1: List<String> = listOf("Otniel", "Kevin", "Abiel");
    val try2: List<String> = listOf("Lei", "Leinto");

    val try3: List<Pair<String, String>> = try1.zip(try2);

    // Output hanya berhenti sesuai dengan jumlah pasangan terpendak
    println(try3); //[(Otniel, Lei), (Kevin, Leinto)]

}