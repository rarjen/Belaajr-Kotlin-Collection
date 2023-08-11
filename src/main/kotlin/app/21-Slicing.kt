package app

fun main() {
    /**
     * Slice Operator
     *
     * Slice adalah operator yang digunakan untuk mengambil sebagian element yang ada di collection yang sesuai dengan parameter range
     */
    /**
     * Slice Operators
     *
     * slice(range) => Mengambil sebagian element yang ada di collection sesuai dengan index range
     */

    val list1 = (10..100).toList();
    val list2 = list1.slice(0..50); // mengambil index ke 0 - 50
    val list3 = list1.slice(0..100 step 2);
    val list4 = list1.slice(100 downTo 0 step 2);

    println(list2)
    println(list3)
    println(list4)

    /**
     * Output:
     *
     * [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50]
     * [0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50, 52, 54, 56, 58, 60, 62, 64, 66, 68, 70, 72, 74, 76, 78, 80, 82, 84, 86, 88, 90, 92, 94, 96, 98, 100]
     * [100, 98, 96, 94, 92, 90, 88, 86, 84, 82, 80, 78, 76, 74, 72, 70, 68, 66, 64, 62, 60, 58, 56, 54, 52, 50, 48, 46, 44, 42, 40, 38, 36, 34, 32, 30, 28, 26, 24, 22, 20, 18, 16, 14, 12, 10, 8, 6, 4, 2, 0]
     */
}