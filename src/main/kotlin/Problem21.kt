// Function to read a non-negative number from the user
fun readNumber(message: String): Int {
    var number: Int
    do {
        println(message)
        number = readLine()?.toInt() ?: 0
    } while (number < 0)
    return number
}

// Function to calculate the Fibonacci number for the given input
fun calculateFibonacci(number: Int) : Int {
    if (number <= 1) {
        return number
    }

    var prev1 = 0
    var prev2 = 1
    var fabNumber = 0

    for (i in 2..number) {
        fabNumber = prev1 + prev2
        prev1 = prev2
        prev2 = fabNumber
    }
return  fabNumber
}

fun main() {
    val numberToGenerate = readNumber("Enter the number of Fibonacci sequence elements to generate")
    println("Fibonacci Series:")
    for (i in 0..<numberToGenerate) {
        val fibonacci = calculateFibonacci(i)
        println(fibonacci)
    }
}
