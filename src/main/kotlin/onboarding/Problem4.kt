package onboarding

fun solution4(word: String): String {
    val alphabetList = ('A'..'Z').toList()
    val wordList = mutableListOf<Char>()
    val result = StringBuilder()
    for (char in word) {
        wordList.add(char)
    }
    for (i in wordList.indices) {
        for (j in alphabetList.indices) {
            when {
                wordList[i] == alphabetList[j] -> {
                    wordList[i] = alphabetList[25 - j]
                    break
                }

                wordList[i] == alphabetList[j].lowercaseChar() -> {
                    wordList[i] = alphabetList[25 - j].lowercaseChar()
                    break
                }
            }
        }
        result.append(wordList[i])
    }
    return result.toString()
}

