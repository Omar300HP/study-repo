class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        var isDuplicate = false;
        val itemsCount = mutableMapOf<Int, Int>();

        for (i in nums) {
            if (itemsCount.containsKey(i)) {
                isDuplicate = true
                break;
            }
            itemsCount[i] = 1
        }

        return isDuplicate
    }
}