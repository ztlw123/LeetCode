package fourSum;

import java.util.*;

/**
 * @Author zjh
 * @Date 2018/10/31,17:03
 * @Description 给定一个整型数组和一个目标值target，找出所有四个数之和为target的集合
 * @Solution 对第一个数循环，内部做三数之和的算法
 */
public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> resultList = new ArrayList<>();
        Set<List<Integer>> checkSet = new HashSet<>();
        List<Integer> oneResult;

        if(nums == null || nums.length < 4)
            return resultList;

        Arrays.sort(nums);

        for(int i=0; i<nums.length; i++) {
            int threeSum = target - nums[i];

            for(int j=i+1; j<nums.length; j++) {
                int twoSum = threeSum - nums[j];

                int left = j+1, right = nums.length-1;

                while (left < right) {
                    if(nums[left] + nums[right] < twoSum){
                        left++;
                        continue;
                    }
                    else if(nums[left] + nums[right] > twoSum){
                        right--;
                        continue;
                    }
                    else{
                        oneResult = new ArrayList<>();
                        oneResult.add(nums[i]);
                        oneResult.add(nums[j]);
                        oneResult.add(nums[left]);
                        oneResult.add(nums[right]);

                        if(checkSet.add(oneResult))
                            resultList.add(oneResult);

                        left++;
                        right--;
                    }
                }
            }
        }

        return resultList;
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, -1, 0};
        List<List<Integer>> result = new FourSum().fourSum(nums, 2);

        for (int i=0; i<result.size(); i++){
            System.out.println(Arrays.toString(result.get(i).toArray()));
        }
    }
}
