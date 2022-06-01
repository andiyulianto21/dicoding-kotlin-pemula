fun main() {
    //sequence = sifatnya lazy evaluation berbeda dengan collection list, map dan set yang bersifat
    //eager evaluation.

    val numbers = (1..1_000_000).toList()
//    numbers.filter { it % 5 == 0 }.map { it * 2 }.forEach { print(it) }

    numbers.asSequence().filter { it % 5 == 0 }.map { it * 2 }.forEach { print(it) }
}