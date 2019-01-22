package searchInRotatedSortedArray;

/**
 * @Author zjh
 * @Date 2018/11/19,14:29
 * @Description 给定一个被旋转过的升序数组，它可能如示例：70123456,67012345，56701234,45670123,34567012。。。在
 *              O(logn)时间复杂度内找到目标target的位置，找不到则返回-1.
 * @Solution 由于O(logn)时间复杂度，则必定要使用二分法查找了。
 *           1. 先确定如果left<right则说明数组有序，可以直接通过target和mid比较来缩小left、right范围。
 *           2. 若left不小于right，判断mid如果大于left，说明mid左侧是有序的，target如果大于mid，或者
 *              target小于left，则在右侧无序部分找，否则在左侧部分找。
 *           3. 判断mid如果不大于left，说明mid的右侧是有序的，下面同2.
 */
public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {

        int left = 0, right = nums.length-1;

        while (left < right) {
            int mid = (left + right) / 2;

            if(target == nums[mid])
                return mid;

            if(nums[left] < nums[right]) {
                if(target > nums[mid])
                    left = mid + 1;
                if(target < nums[mid])
                    right = mid - 1;
            }
            else {
                if(nums[mid] >= nums[left]) {
                    if(target > nums[mid] || target < nums[left]) {
                        left = mid + 1;
                    }
                    else {
                        right = mid - 1;
                    }
                }
                else {
                    if(target < nums[mid] || target > nums[right]) {
                        right = mid - 1;
                    }
                    else {
                        left = mid + 1;
                    }
                }
            }
        }

        if (left == right && nums[left] == target)
            return left;
        return -1;
    }
}
