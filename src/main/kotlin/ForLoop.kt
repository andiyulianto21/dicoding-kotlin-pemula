fun main() {
    val rangeNumbers = 5..15 step 5
    for(range in rangeNumbers){
        println(range)
    }

    rangeNumbers.forEach { value ->
        println(value)
    }

    rangeNumbers.forEachIndexed{index, value ->
        println("index ke-$index : $value")
    }

    val listOfAge = listOf(10, 15, null, 25, null, 51);
    for(age in listOfAge){
        if(age == null) continue
        println(age)
    }

    loop@ for (i in 1..5){
        println("$i outside loop")

        for (j in 1..2){
            if(j>=2) break@loop
            println("$j inside loop")
        }
    }
}