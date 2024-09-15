package onboarding

fun solution2(cryptogram: String): String {
    val cryptogramList = mutableListOf<Any>()
    var i = 0
    for (char in cryptogram) {
        cryptogramList.add(char.toString())
    }
    while (i < cryptogramList.size - 1) {
        if (cryptogramList[i] == cryptogramList[i + 1]) {
            cryptogramList.removeAt(i)
            cryptogramList.removeAt(i)
            i -= 2
        }
        i++
    }
    val result = StringBuilder()
    for (j in 0 until cryptogramList.size) {
        result.append(cryptogramList[j])
    }
    return result.toString()
}
