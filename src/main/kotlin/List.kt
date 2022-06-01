fun main() {
    //list bertipe Integer doang
    var list = listOf<Int>(9,5,3,8,10)
    //list bertipe bebas
    var list2 = listOf(true, "ando", 23, 5.32)

    //list mutable atau bisa dimanipulasi datanya
    var list3 = mutableListOf(true, "supri", 40, 2.24)
    list3.add("hai") //menambah data dari index terakhir
    list3.add(0, false) //menambah data pada index tertentu
    list3.removeLast() // mengahpus data pada index terakhir
    list3.remove("supri") //menghapus data dengan elemen tertentu
    list3[3] = 3.14 //mengubah data pada index tertentu
    list3.forEach { value -> println(value) }
}