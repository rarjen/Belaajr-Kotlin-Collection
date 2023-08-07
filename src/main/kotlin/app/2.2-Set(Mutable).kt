package app

import data.Person


fun main() {
    // Contoh menggunakan Object Class
    val mutableSet: MutableSet<Person> = mutableSetOf(
        Person("Otniel"), Person("Kevin"), Person("Abiel")
    )

    // Add Data
    mutableSet.add(Person("Leinto"));
    mutableSet.add(Person("Leinto")); // akan ditolak (tidak dimasukkan)

    println(mutableSet.size) //4
    println(mutableSet.contains(Person("Leinto"))); //true

    for (person in mutableSet) {
        println(person);
        /*
        Output:

        Person with name Otniel
        Person with name Kevin
        Person with name Abiel
        Person with name Leinto
        */
    }


    // Bisa menggunakan tipe data lain
    val mutableSetString: MutableSet<String> = mutableSetOf();
    mutableSetString.add("Otniel");
    mutableSetString.add("Kevin");
    mutableSetString.add("Abiel");

    for (value in mutableSetString) {
        println(value);

        /*
        Output:

        Otniel
        Kevin
        Abiel
         */
    }

}