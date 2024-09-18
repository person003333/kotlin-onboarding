package onboarding

fun solution4(word: String): String {
    val alphabetList = listOf(
        'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
        'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
    )
    val wordList = mutableListOf<Char>()
    for (char in word) {
        wordList.add(char)
    }

    for (j in alphabetList.indices) {
        for (i in 0 until wordList.size) {
            if (wordList[i] == alphabetList[j]) {
                wordList[i] = alphabetList[25 - j]
            } else if (wordList[i] == alphabetList[j].lowercaseChar()) {
                wordList[i] = alphabetList[25 - j].lowercaseChar()
            }
        }
    }
   
}

fun main() {
    println(solution4("I love you"))
}