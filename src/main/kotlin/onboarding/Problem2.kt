package onboarding

fun solution2(cryptogram: String): String {
    val cryptogramCharList = mutableListOf<Any>()
    var i = 0
    for (char in cryptogram) {
        cryptogramCharList.add(char.toString())
    }
    while (i < cryptogramCharList.size - 1) {
        if (cryptogramCharList[i] == cryptogramCharList[i + 1]) {
            cryptogramCharList.removeAt(i)
            cryptogramCharList.removeAt(i)
            i -= 2
        }
        i++
    }
    val result = StringBuilder()
    for (j in 0 until cryptogramCharList.size) {
        result.append(cryptogramCharList[j])
    }
    return result.toString()
}
