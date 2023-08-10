package app

class Member(val name: String, val hobbies: List<String>);

fun main() {
    val members: List<Member> = listOf(
        Member("Otniel", listOf("Gaming", "Coding")),
        Member("Leinto", listOf("Badminton", "Gym"))
    )


    val hobbies: List<String> = members.flatMap { it.hobbies };
    println(hobbies); //[Gaming, Coding, Badminton, Gym]

    // Contoh menggunakan flatten (harus melakukan 2x operasi. Di map dlu llau di flatten karena tipe data it.hobbies adalah List<List<String>>
    val hobbies2 = members.map{ it.hobbies }.flatten();
    println(hobbies2); //[Gaming, Coding, Badminton, Gym]

    // Contoh menggunakan faltMap
    val hobbies3 = members.flatMap { it.hobbies };
    println(hobbies3); //[Gaming, Coding, Badminton, Gym]


}