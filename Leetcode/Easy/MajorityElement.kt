class Solution {
    fun majorityElement(nums: IntArray): Int {

    var count = 0
    var ele = -1
    nums.indices.forEach { i ->
        when {
            count == 0 -> {
                count = 1
                ele = nums[i]
            }
            nums[i] == ele -> {
                count++
            }
            else -> {
                count--
            }
        }
    }
    return ele
}
}
