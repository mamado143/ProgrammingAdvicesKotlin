// Program: String Case Conversion
// Description: This program reads a string, converts all letters to uppercase, and then to lowercase.

/**
 * Function to read a string input from the user.
 * @return: The user-input string.
 */
fun readStringFromUser(): String {
    println("Please Enter your string")
    return readlnOrNull().toString()
}

/**
 * Function to convert all letters in the string to uppercase while preserving spaces.
 * @param s1: The input string.
 * @return: The string with all letters in uppercase.
 */
fun convertToUpper(s1: String): String {
    var result = ""
    for (i in s1.indices) {
        val charName = s1[i]
        if (charName != ' ') {
            result += charName.uppercaseChar()
        } else {
            result += " " // Add the space in the result to preserve the structure
        }
    }
    return result
}

/**
 * Function to convert all letters in the string to lowercase while preserving spaces.
 * @param s1: The input string.
 * @return: The string with all letters in lowercase.
 */
fun convertToLower(s1: String): String {
    var result = ""
    for (i in s1.indices) {
        val charName = s1[i]
        if (charName != ' ') {
            result += charName.lowercaseChar()
        } else {
            result += " " // Add the space in the result to preserve the structure
        }
    }
    return result
}

fun main() {
    val enterName = readStringFromUser()
    val upperCaseString = convertToUpper(enterName)
    val lowerCaseString = convertToLower(enterName)

    println("Uppercase: $upperCaseString")
    println("Lowercase: $lowerCaseString")
}