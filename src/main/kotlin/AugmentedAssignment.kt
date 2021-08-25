fun main() {
    var number = 20
    var number2 = 40
    //number = number + number2
    //augmented assignment itu update variabel awal
    number += number2 //yang sama dengan yang dikiri karena augm

    println(number)

    var x = 11
    var y = 13

    x -= y
    x += y
    x *= y
    x /= y
   // x %= y // yang diprint yang x karena (x = x % y)


    println(x)
}