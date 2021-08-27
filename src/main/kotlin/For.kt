// perulangan menggunakan for
// perulangan menggunakan for yang sering digunakan

//fun main() {
//    val names = arrayOf("Muflikhan", "Dimas", "Dwiprayogi")
//    for (name in names){
//        println(name)
//    }
//}

//

//fun main() {
//    for (e in 23..58 step 22){
//        println("Hum")
//    }

//    for (u in 2.rangeTo(6)){
//        println("Hai")
//    }

    // 2,1,0
//    for (o in 2 downTo 0){
//        println("HIHI")
//    }
//}

// perulangan range menggunakan index
//fun main() {
//    val range = 3..20 step 2
//    for ((index, value) in range.withIndex()){
//        println("value $value indexnya $index")
//    }
//}

fun main() {
    val range = 1..5
    for (i in range){
        for (j in 1..i){
            print("*  ")
        }
        print("  ")
        println()
    }
}

//fun main() {
//    val ron = 2..5
//    for (k in ron){
//        for (l in 2..5){
//            for (m in 1..3){
//                println("&&&&")
//            }
//        }
//    }
//}
