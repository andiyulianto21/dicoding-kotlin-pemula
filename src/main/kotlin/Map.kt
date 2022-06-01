fun main() {
    //map = collection yang berisi index yang dapat dibuat sendiri
    val capitalCity = mapOf(
        "madrid" to "Spain",
        "london" to "England",
        "jakarta" to "Indonesia"
    )
    capitalCity.forEach { city, country -> println("$city : $country") }
    println(capitalCity["paris"]) //jika key yang dicari tidak ada maka akan tampil nilai null sedangkan...
//    println(capitalCity.getValue("paris")) //menggunakan metode ini akan menampilkan exception

    val ibukota = capitalCity.keys //key pada map haruslah unik
    println(ibukota) //[madrid, london, jakarta]
    val negara = capitalCity.values
    println(negara) //[Spain, England, Indonesia]

    val mutableMap = capitalCity.toMutableMap()
    mutableMap.put("kuala lumpur", "Malaysia")
    mutableMap.remove("london")
    mutableMap.forEach{ (k, v) -> println("mutable::: $k : $v")}

}