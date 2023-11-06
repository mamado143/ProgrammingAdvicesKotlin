//Write a program to read str then uppercase the first letter.
/**
 * readString - function to read input from the user.
 * @return: the user-input string.
 *
 */
fun ReadString (): String
{
    println("Please enter your String")
    return readln().toString()
}

/**
 * UpperFirstLetterInString - is function to capitalize the first letters of string.
 * @param name: is the input name.
 * @return: returns the result.
 */
fun UpperFirstLetterInString(name: String) {
    var firstLetter = true
    var result = ""

    println("\nString with first letters capitalized:")

    for (i in name.indices) {
        val currentChar = name[i]

        result += if (currentChar.isLetter() && firstLetter) {
            currentChar.uppercaseChar()
        } else {
            currentChar.lowercaseChar()
        }

        firstLetter = if (currentChar.isWhitespace()) true else false
    }

    println(result)
}


fun main() {
    val name = ReadString()
    println(name)
    UpperFirstLetterInString(name)

}