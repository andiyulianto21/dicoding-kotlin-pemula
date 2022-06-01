//class biasa
class Dosen(val name: String, val age: Int)
//data class
data class Mahasiswa(val name:String, val age:Int){
    fun intro(){
        println("Hi my name is $name and i'm $age years old.")
    }
}

fun main() {
    val dosen = Dosen("Sri", 42)
    println("${dosen.age.toString()} : ${dosen.name.toString()}")
    //data class
    val mhs = Mahasiswa("Andi", 21)
    println("${mhs.age} : ${mhs.name}")
    //bisa copy object juga
    val mhs2 = mhs.copy(name = "Budi")
    println("${mhs2.age} : ${mhs2.name}")
    //destructuring
    val (name, age) = mhs2
    println("destructuring = $name : $age")
    //memanggil method dalam objek data class
    mhs2.intro()
}