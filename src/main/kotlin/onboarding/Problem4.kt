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
    for (i in wordList.indices) {
    for (j in alphabetList.indices) {
            if (wordList[i] == alphabetList[j]) {
                wordList[i] = alphabetList[25 - j]
                break
            } else if (wordList[i] == alphabetList[j].lowercaseChar()) {
                wordList[i] = alphabetList[25 - j].lowercaseChar()
                break
            }
        }
    }
    val stringBuilder = StringBuilder()
    var result = ""
    for (i in wordList.indices) {
        result = stringBuilder.append(wordList[i]).toString()
    }
    return result
}

