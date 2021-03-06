package combinationSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author zjh
 * @Date 2018/11/21,22:01
 * @Description 给定一个正整数的无重复数组，一个目标值target。从中找出组合，其和为target，元素可重复利用，但是组合结果不可重复。
 * @Solution 使用递归，每次找到一个组合，输入为结果数组，临时数组，输入数组，目标target，下标位置。
 *             对输入数组从下标位置开始循环，将该元素添加到临时数组后，递归调用母函数，只不过target参数变为target-num[i]。
 *           结束条件（跳出本次for循环）：target<0则直接结束；target=0时说明是一组符合要求的组合，加入结果集
 */
public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(candidates);
        findOne(result, new ArrayList<>(), candidates, target, 0);

        return result;

    }

    public boolean findOne(List<List<Integer>> result, List<Integer> tempList, int[] nums, int target, int start) {
        if(target < 0)
            return false;
        else if(target == 0) {
            result.add(new ArrayList<>(tempList));  //add templist 和add new Arr的区别是啥？？？
            return false;
        }
        else {
            for(int i=start; i<nums.length; i++) {
                tempList.add(nums[i]);
                boolean flag = findOne(result, tempList, nums, target-nums[i], i);
                tempList.remove(tempList.size()-1);
                if(!flag) break;
            }

            return true;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,4,5};

        List<List<Integer>> list = new CombinationSum().combinationSum(nums, 8);

        for(List<Integer> l : list) {
            for(int i : l) {
                System.out.print(i + " ");
            }
            System.out.println(" ");
        }
    }
}
