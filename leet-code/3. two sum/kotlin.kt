class TwoSunSolution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var answer = intArrayOf()
        var valueIndexMap: MutableMap<Int, Int> = mutableMapOf()

        for (i in 0..nums.size - 1) {
            val current = target - nums[i]
            if (valueIndexMap.containsKey(current)) {
                answer = intArrayOf(valueIndexMap.getValue(current), i)
                break
            }

            valueIndexMap.set(nums[i], i)
        }

        return answer
    }
}
