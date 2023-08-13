package app

fun main() {
    /**
     * Windowed Operation
     *
     * Windowed adl oeprasi utk mendapatkan semua kemungkinan collection sesuai dengan range yg telah ditentukan
     *
     * Windowed Operator
     * windowed(size, step, partialWindow) => Mengambil semua kemungkinan collection sebesar size, dilanjut dengan step, dan diakhiri dengan partialWindow
     * windowed(size, step, partialWindow, transform) => Sama seperti windowed() sebelumnya, namun hasil collection di transform
     *
     */

    val range: List<Int> = (1..5).toList();

    // default
    println(range.windowed(3)) //[[1, 2, 3], [2, 3, 4], [3, 4, 5]]

    println(range.windowed(3, 1, false)) //[[1, 2, 3], [2, 3, 4], [3, 4, 5]]
    println(range.windowed(3, 1, false) {it.size}) //[3, 3, 3]
    println(range.windowed(3, 1, true)) //[[1, 2, 3], [2, 3, 4], [3, 4, 5], [4, 5], [5]]
    println(range.windowed(3, 1, true) {it.size}) //[3, 3, 3, 2, 1]
    println(range.windowed(3, 2, false)) //[[1, 2, 3], [3, 4, 5]]
    println(range.windowed(3, 2, true)) //[[1, 2, 3], [3, 4, 5], [5]]
}