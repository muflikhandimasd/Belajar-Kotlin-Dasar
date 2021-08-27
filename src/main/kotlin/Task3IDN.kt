// Muflikhan Dimas Dwiprayogi
// nested loops
fun main() {
    val range = 1..5
    for (i in range){
        for (j in 1..i){
            print("*  ") //di dalam String diberi spasi 2 kali
        }
        println()
    }
}