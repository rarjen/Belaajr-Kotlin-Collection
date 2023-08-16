package app

fun main() {
    /**
     * Grouping Interface
     *
     * Sebelumnya kita sudah bahas tentang operasi Grouping, salah satunya adalah groupingBy yang menghasilkan object dari interface Grouping
     *
     * eachCount() => Menghitung jumlah data di tiap grup
     * reduce() dan fold() => Operasi reduce() dan fold() di tiap group
     * aggregate(key: K, accumulator: R?, element: T, first: Boolean) => Operasi aggregate data di tiap group, dimana jika data pertama mana parameter first bernilai true, dan accumulator akan bernilai null
     */

    val list1 = listOf("a", "a", "b", "b", "c", "c");
    val grouping: Grouping<String, String> = list1.groupingBy { it };
    println(grouping)

    println(grouping.eachCount()); //{a=2, b=2, c=2}
    println(grouping.fold("") {accumulator, element -> accumulator + element  }); //{a=aa, b=bb, c=cc}
    println(grouping.reduce { key, accumulator, element -> accumulator + element  }); //{a=aa, b=bb, c=cc}
    println(grouping.aggregate { key, accumulator: String?, element, first ->
        if (first) element
        else accumulator + element
    }); //{a=aa, b=bb, c=cc}


}
