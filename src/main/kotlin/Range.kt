// Jika ingin menulis banyak data kelamaan kalo input satu satu
// Tulis operasi rangenya


fun main() {
    val jumlahrumah = 2 downTo 4 step 39
    val nomorkelas = 4..39 step 2

//    println(jumlahrumah.count())
//    println(jumlahrumah.contains(34500))
//    println(jumlahrumah.first)
//    println(jumlahrumah.last)
//    println(jumlahrumah.step)

    println(nomorkelas.count())
    println(nomorkelas.last)
    println(nomorkelas.contains(17))

}