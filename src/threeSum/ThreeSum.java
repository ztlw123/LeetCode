package threeSum;

import java.util.*;

/**
 * @Author zjh
 * @Date 2018/10/26,16:05
 * @Description 给定一个数组，找出其中三个数之和为0的所有三元组并去重。
 * @Solution 遍历数组查询每个数对应的三元组，先对数组排序，设定头尾指针，头指针指向查询的数的下一位，尾指针指向末尾。
 *           每次比较头尾指针之和，若大于查询数字，则移动尾指针，小于则移动头指针。去重工作通过一个set实现。
 */
public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> checkSet = new HashSet<>();
        List<List<Integer>> resultList = new ArrayList<>();
        List<Integer> threeInteger;

        Arrays.sort(nums);

        for(int i=0; i<nums.length; i++) {
            int head = i+1, tail = nums.length-1;

            while(head < tail) {
                if(nums[head] + nums[tail] > -nums[i]){
                    tail--;
                    continue;
                }
                else if(nums[head] + nums[tail] < -nums[i]){
                    head++;
                    continue;
                }
                else{
                    threeInteger = new ArrayList<>();
                    threeInteger.add(nums[i]);
                    threeInteger.add(nums[head]);
                    threeInteger.add(nums[tail]);

                    if(checkSet.add(threeInteger)){
                        resultList.add(threeInteger);
                    }

                    head++;
                    tail--;

                    continue;
                }
            }
        }

        return resultList;
    }

    public static void main(String[] args) {
        long start = new Date().getTime();
        int[] nums = {-1,-1,-1,-1,0,0,0,0,0,1,1,1,1,1};
        List<List<Integer>> result = new ThreeSum().threeSum(nums);

        for (int i=0; i<result.size(); i++){
            System.out.println(Arrays.toString(result.get(i).toArray()));
        }

        long end = new Date().getTime();

        System.out.println((end-start)/1000);

    }
}
