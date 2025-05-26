class GroupAnagramsSolution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val wordsMap = mutableMapOf<String, MutableList<String>>()

        for (word in strs) {
            val lettersList = MutableList<Int>(26) { 0 }

            for (letter in word) {
                val index = (letter.code - "a"[0].code)
                lettersList[index]++
            }

            val mapKey = lettersList.toString()
            if (wordsMap.containsKey(mapKey)) {
                wordsMap[mapKey]?.add(word)
            } else {
                wordsMap[mapKey] = mutableListOf(word)
            }
        }

        return wordsMap.values.toList()
    }
}
