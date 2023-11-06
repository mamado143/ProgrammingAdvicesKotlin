/**
 * Function: readChar
 * Description: Reads a single character from the user's input.
 * Returns: The character entered or a space if no character is entered.
 */
fun readChar(): Char {
    println("Enter the character: ")
    return readLine()?.get(0) ?: ' '
}

/**
 * Function: invertChar
 * Description: Inverts the case of a given character (if it's a letter).
 * Parameter: ch - the character to be inverted
 * Returns: The inverted character (in case of a letter) or the same character if it's not a letter.
 */
fun invertChar(ch: Char): Char {
    return if (ch.isLetter()) {
        if (ch.isUpperCase()) {
            ch.lowercaseChar()
        } else {
            ch.uppercaseChar()
        }
    } else {
        ch // Return the character unchanged if it's not a letter
    }
}

fun main() {
    val readChar = readChar()
    val invertedChar = invertChar(readChar)
    println("The inverted character is $invertedChar")
}
