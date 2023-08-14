package app

fun main() {
    /**
     * Aggregate
     *
     * Kotlin memiliki berbagai operasi utk melakukan aggregate
     *
     * Aggregate Operator (1)
     *
     * max() dan min() => Mengambil nilai max dan min
     * average() => Mengambil rata-rata
     * sum() => Menghitung jumlah seluruh element
     * count() => Mengambil berapa banyak element
     *
     * Aggregate Operator (2)
     *
     * maxBy(selector) dan minBy(selector) => Mengambil nilai maksimal dan minimum
     * maxWith(Comparator) dan minWith(Comparator) => Mengambil nilai maksimal dan minimum sesuai comparator
     * sumBy(selector) => Mengambil nilai jumlah seluruh element sesuai selector
     * sumByDouble(selector) => Sama dengan sumBy() namun menghasilkan Double
     *
     */

    val list = (1..10).toList();
    println(list.max()); //10
    println(list.min()); //1
    println(list.average()); //5.5
    println(list.sum()); //55
    println(list.count()); //10
}
