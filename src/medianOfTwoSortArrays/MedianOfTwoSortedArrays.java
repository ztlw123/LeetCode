package medianOfTwoSortArrays;

/**
 * @Author zjh
 * @Date 2018/09/13,16:07
 */
public class MedianOfTwoSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length = nums1.length + nums2.length;

        if(length % 2 == 0){
            return (findKth(nums1, 0, nums1.length, nums2, 0, nums2.length, length/2) +
                    findKth(nums1, 0, nums1.length, nums2, 0, nums2.length, length/2 + 1)) / 2.0f;
        }
        else {
            return findKth(nums1, 0, nums1.length, nums2, 0, nums2.length, length/2 + 1);
        }

    }

    private static double findKth(int[] a, int start_1, int len_1, int[] b, int start_2, int len_2, int k){

        if(len_1 > len_2) {
            return findKth(b, start_2, len_2, a, start_1, len_1, k);
        }

        if(len_1 == 0){
            return b[start_2 + k -1];
        }

        if(k == 1){
            return Math.min(a[start_1], b[start_2]);
        }

        int p = Math.min(k/2, len_1);
        int q = k - p;

        if(a[start_1 + p - 1] == b[start_2 + q - 1]) {
            return a[start_1 + p - 1];
        }
        else if(a[start_1 + p - 1] > b[start_2 + q - 1]) {
            return findKth(a, start_1, len_1, b, start_2 + q, len_2 - q, k - q);
        }
        else if(a[start_1 + p - 1] < b[start_2 + q - 1]) {
            return findKth(a, start_1 + p, len_1 - p, b, start_2, len_2, k - p);
        }

        return 0;
    }

    public static void main(String[] args) {

        int[] a = {1};
        int[] b = {2};

        System.out.println(MedianOfTwoSortedArrays.findMedianSortedArrays(a, b));
    }
}
