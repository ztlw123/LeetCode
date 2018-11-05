package threeSumClosest;

import java.util.Arrays;

/**
 * @Author zjh
 * @Date 2018/10/28,17:56
 * @Description 给定一个数组和一个目标值target，找出其中三个数之和最接近target值。
 * @Solution 遍历数组查询每个数对应的三元组，先对数组排序，设定头尾指针，头指针指向查询的数的下一位，尾指针指向末尾。
 *           每次检查三数之和与target比较，其差若小于closest，则更新closest。判断若三数和小于target，head右移；若大于target，rear左移。
 */
public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {

        int closest = Integer.MAX_VALUE;   //记录三数之和与target的差距
        int closest_sum = 0;               //最接近的三数之和

        Arrays.sort(nums);

        for(int i=0; i<nums.length; i++) {
            int head = i + 1, rear = nums.length-1;

            while (head < rear) {
                int three_sum = nums[i] + nums[head] + nums[rear];
                int temp_close = Math.abs(target - three_sum);

                if(temp_close < closest){

                    closest = temp_close;
                    closest_sum = three_sum;
                }

                if(three_sum < target)
                    head++;
                else if(three_sum > target)
                    rear--;
                else
                    return three_sum;
            }
        }

        return closest_sum;
    }

    public static void main(String[] args) {
        int[] nums = {0,5,4,2,3};

        System.out.println(new ThreeSumClosest().threeSumClosest(nums, 1));
    }
}
