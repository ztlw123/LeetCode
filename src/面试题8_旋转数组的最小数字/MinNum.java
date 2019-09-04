package 面试题8_旋转数组的最小数字;

/**
 * @Author zjh
 * @Date 2019/03/01,10:27
 */
public class MinNum {

    public static int findMin(int[] arr) {
        if(arr == null || arr.length == 0)
            return 0;

        int left = 0;
        int right = arr.length - 1;
        int mid = 0;

        while (arr[left] >= arr[right]) {
            if(right - left == 1) {
                mid =right;
                break;
            }

            mid = (left + right) / 2;

            if(arr[left] == arr[mid] && arr[mid] == arr[right]) {
                if(arr[left+1] != arr[right-1]) {
                    mid = arr[left+1] < arr[right-1] ? left+1 : right-1;
                }
            }

            if(arr[mid] >= arr[left])
                left = mid;
            else if(arr[mid] <= arr[right])
                right = mid;
        }

        return arr[mid];
    }

    public static void main(String[] args) {
        int[] a = {1,0,1,1,1};

        System.out.println(MinNum.findMin(a));
    }
}
