package findFirstAndLastPositionOfArr;

/**
 * @Author zjh
 * @Date 2018/11/19,21:23
 * @Description 给定一个升序数组，其中元素可重复，给定一个target，找出target在数组中对应的下标起始位置，时间复杂度为O(logn)。
 *              例如：{1,2,3,5,8,8,8,9,12}，得到结果为{4,6}。若未找到则返回{-1，-1}。
 *
 * @Solution 看到O(logn)第一时间想到二分法的思想，当找到mid对应target时，分别朝mid的左右两侧找直到左右下标对应的值不等于target，
 *           记录结果下标。
 */
public class FindFirstAndLastPositionOfArr {
    public int[] searchRange(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int[] result = {-1, -1};

        while (left < right) {
            int mid = (left + right) / 2;

            if(nums[mid] == target) {
                int l = mid, r = mid;
                while (nums[l] == target) {
                    l--;
                    if(l == -1)
                        break;
                }
                while (nums[r] == target) {
                    r++;
                    if(r == nums.length)
                        break;
                }

                result[0] = l + 1;
                result[1] = r - 1;

                return result;
            }
            else if(nums[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        if(left == right && nums[left] == target) {
            result[0] = left;
            result[1] = left;

            return result;
        }

        return result;
    }

    public static void main(String[] args) {
        int nums[] = {5,7,7,8,8,10};
        int[] result = new FindFirstAndLastPositionOfArr().searchRange(nums, 7);

        System.out.println(result[0] + "    " + result[1]);
    }
}
