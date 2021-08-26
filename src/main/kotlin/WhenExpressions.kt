//fun main() {
//    val nilaiUjian = 'C'
//
//    when(nilaiUjian){
//        'A' -> print("Amazing")
//        'B' -> print("Sip")
//        'C' -> print("yang rajin ya")
//    }
//}
//fun main() {
//
//    val nilaiUjian : Any =12
//
//    when(nilaiUjian){
//        is Long -> print("variabel Long")
//        is Int -> print("variabel tipe integer")
//        is String -> print("varibabel string")
//        else -> print("gaada tipe")
//    }
//}

//fun main() {
//    val ui = 665
//    val rangeux = 1..100
//
//    when(ui){
//        in rangeux -> print("Available")
//        !in rangeux -> print("Not available")
//        else -> print("diluar jangkauan")
//    }
//}

//fun main() {
//    val numm = 1
//
//    when(numm){
//        1 -> {
//            println("angka satu")
//            val nomer = "noomer"
//            println("Ini adalah $nomer satu")
//        }
//        else -> print("Bagus")
//    }
//}

fun main() {
    val now = 16
    when(now){
         7 -> print("Upacara sedang berlangsung")
         9 -> print("Upacara telah selesai")
         16 -> print("Jam pulang sekolah")
        else -> print("Sekarang jam 11")
    }
}