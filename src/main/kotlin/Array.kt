//Array adalahy tipe data yang menampung kumpulan data yang setipe
// Penamaan variabel array gunakan english plural misal names
//intArrayOf() : IntArray
//booleanArrayOf() : BooleanArray
//charArrayOf() : CharArray
//longArrayOf() : LongArray
//shortArrayOf() : ShortArray
//byteArrayOf() : ByteArray

//Tulis dan pelajari operasi Array
// nameVariable.set(isi data, pengganti) atau nameVariable[posisi] = ubahan

//operasinya = size, get, set

fun main() {
    val member = arrayOf(12, "Dimas" , 10.23) // spy bisa dicampur trus diganti beda tipe didalemnya harus ada desimal atau floating point
    val angka : Array<Int> = arrayOf(12, 23 ,45) //ini yg direkomendasikan
    val nummm = intArrayOf(12, 68, 90, 12)
                   //index [0] [1] [2] [3]
    //nummm.set(2, "Spring")// Error karena ga setipe

    member.set(1, 39) // jika Array
    member[2] = "Muflikhan"
    member[0] = false
    val boolean = booleanArrayOf(true, false, true)

    val name : Array<String> = arrayOf("Muflikh", "Dimas", "Dwiprayogi")

    println(member[0])

    val nummarray : Array<String?> = arrayOfNulls(6)
    nummarray[2] = "Hore"

    println(nummarray.contentToString())
}