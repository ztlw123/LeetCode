package remoteElement;

/**
 * @Author zjh
 * @Date 2018/11/06,21:34
 * @Description 给定一个整型数组nums和一个整数val，删除nums中的所有val，返回这时的长度，长度之外还有什么元素并不重要
 * @Solution 设置一个慢指针，当循环指针不等于指定值val时，把循环指针赋给慢指针，否则什么都不做，继续循环。
 */
public class RemoteElement {
    public int removeElement(int[] nums, int val) {

        if (nums.length == 0 || nums == null)
            return 0;

        int slow = 0;

        for(int i=0; i<nums.length; i++) {
            if(nums[i] != val) {
                nums[slow++] = nums[i];
            }
            else {
                continue;
            }
        }

        return slow;
    }

    public static void main(String[] args) {
//        int[] nums = {3, 2, 2, 4, 5, 2, 3};
        int[] nums = {1,1,1,1,1,1};

        int size = new RemoteElement().removeElement(nums, 1);

        System.out.println(size);
        for(int i : nums) {
            System.out.println(i);
        }
    }
}
