fun main() {
    //filter()
    val listAngka = listOf(1,2,3,4,5,6,7,8,9,10)
    val genap = listAngka.filter { it % 2 == 0 }
    val ganjil = listAngka.filterNot { it % 2 == 0 }
    println("$listAngka == $genap vs $ganjil")

    //map()
    val listAngka2 = listOf(5,10,15,20)
    val multiplyBy2 = listAngka2.map { it * 2 }
    println(multiplyBy2)

    //count() = menghitung banyak data
    val listAngka3 = listOf(2,4,5,6,8,9)
    val countingSemua = listAngka3.count()
    val countingGenap = listAngka3.count { it % 2 == 0}
    println("$countingGenap vs $countingSemua")

    //last()
    val number = listOf(1,2,3,4,5)
    val takeFirstMoreThan3 = number.last{ it > 3}//5
    val takeLastMoreThan3 = number.first{ it > 3}//4
    println("$takeFirstMoreThan3 vs $takeLastMoreThan3")

    //sorted(), sortedDescending()
    val abjad = listOf('A', 'C','D','B','E')
    val abjadDesc = abjad.sortedDescending()//z-a
    val abjadAsc = abjad.sorted() //a-z
    println("$abjadDesc vs $abjadAsc")

}