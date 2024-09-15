package onboarding

fun solution2(cryptogram: String): String {
    val cryptogramList = mutableListOf<Any>()
    for (char in cryptogram) {
        cryptogramList.add(char.toString())
    }

    return cryptogramList.toString()
}

