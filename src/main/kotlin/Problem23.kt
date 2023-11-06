/**
 * readString - function to read input from the user.
 * @return: the user-input string.
 *
 */
fun readString (): String
{
    print("Please Enter Your String?\n")
    return readLine().toString()
}
/**
 * printFirstLetterInString - function to print first letter
 * @param name: the string to process.
 */
fun printFirstLetterInString(name : String)
{
    var firstLetter = true
    println("\nEnter letters of this string")
    for (i in name.indices)
    {
        if (name[i] != ' ' && firstLetter)
        {
            println(name[i])
        }
        firstLetter = if (name[i] == ' ') true else false
    }
}

/**
 * main - is the entry point of the program
 */
fun main() {
    val name = readString()
    printFirstLetterInString(name)
}