fun sayHello(greeting: String, itemToGreet:String) = println ("$greeting $itemToGreet")

fun calculateAverage(numbers: List<Double>): Double {
    if (numbers.isEmpty()) {
        return 0.0 // Handle the case when the list is empty to avoid division by zero.
    }

    val sum = numbers.sum()
    return sum / numbers.size
}


fun main() {
    val names= arrayOf("Pragya", "Tofunmi", "Prof. Laufer")
    names.forEach { name ->
        sayHello("Hi", name)
    }
    println()
    println("*************************")
    val numbers = listOf(5.0, 10.0, 15.0, 20.0, 25.0)
    val average = calculateAverage(numbers)
    println("Average: $average")

}
