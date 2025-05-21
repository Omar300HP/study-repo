class IsAnagramSolution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) {
            return false
        }

        return s.split("").sorted().joinToString("") == t.split("").sorted().joinToString("")
    }
}