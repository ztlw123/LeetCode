/**
 * @Author zjh
 * @Date 2019/08/30,10:30
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {1,3,5,5,5,5,5,8,9,10};
        System.out.println(binary(a, 5));
    }

    public static int binary(int[] arr, int target) {

        int start = 0, end = arr.length-1;
        while (start<end) {
            int mid = (start + end) / 2;

            if(arr[mid] <= target) {
                start = mid;
            }
            else {
                end = mid-1;
            }
        }
        if(arr[start] == target)
            return start;

        return -1;
    }
}
