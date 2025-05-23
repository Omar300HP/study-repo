class IsAnagramSolution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) {
            return false
        }

        val lettersMap = mutableMapOf<Char, Int>();

        for (character in s){
            lettersMap[character] = (lettersMap.getOrDefault(character, 0)) + 1
        }

        for (character in t){
            var count = lettersMap.getOrDefault(character, 0);
            if (count == 0){return false}
            lettersMap[character] = count - 1;
        }

        return true
    }
}