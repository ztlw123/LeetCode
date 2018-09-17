package twoSum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @Author zjh
 * @Date 2018/09/13,10:25
 */
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];

        List<Integer> list = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            int value = target - nums[i];

            int index = list.indexOf(value);

            if(index != -1) {
                if(index > i){
                    result[0] = i;
                    result[1] = index;
                }
                else{
                    result[0] = index;
                    result[1] = i;
                }

                return result;
            }
            list.add(i, nums[i]);
        }
        return result;

    }

    public static void main(String[] args) {

        int[] nums = {0, 2, 3, 5, 8, 4};
        int target = 5;

        int[] a = TwoSum.twoSum(nums, target);

        for(int i : a)
            System.out.println(i + " ");
    }
}
