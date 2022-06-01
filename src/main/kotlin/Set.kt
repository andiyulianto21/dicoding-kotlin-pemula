import javax.lang.model.type.UnionType

fun main() {
    val setNilai = setOf(1,1,2,3,3,5,9)
    setNilai.forEach { value -> println(value) }

    val setNilai2 = setOf(1,2,3,9,5)
    println(setNilai == setNilai2) //sama walaupun urutannya berbeda yang penting isinya sama semua
    println(10 in setNilai2) //false

    val x = setOf(8, 10, 15)
    val y = setOf(4, 10, 12)
    val union = x.union(y) //mengambil seluruhnya kecuali data yang sama
    val intersect = x.intersect(y)//hanya mengambil kesamaan
    println("$union vs $intersect")

    //mutable set / set yang dapat dimanipulasi datanya (create, delete) [ubah tidak bisa]
    val mutableSet = mutableSetOf(10,15,20)
    mutableSet.add(25)
    mutableSet.remove(15)
    println(mutableSet)
}