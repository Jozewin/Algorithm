	//88. Merge Sort
// Not a best solution but this is how i solved this problem


class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        val newArr = nums1.copyOf()
        var i = 0
        var j = 0
        var k = 0
        var y = m
        var x = n
        while(x>0 && y>0){
            if(newArr[i]<nums2[j]){
                nums1[k++] = newArr[i++]
                y--
            }else if(newArr[i]>nums2[j]){
                nums1[k++] = nums2[j++]
                x--
            }else if(newArr[i]==nums2[j]){
                nums1[k++] = newArr[i++]
                y--
            }
        }   
        while(y>0){
            nums1[k++] = newArr[i++]
            y--
        }

        while(x>0){
            nums1[k++] = nums2[j++]
            x--
        }
    }
}
