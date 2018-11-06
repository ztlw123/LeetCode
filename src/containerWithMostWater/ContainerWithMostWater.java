package containerWithMostWater;

/**
 * @author 翟佳豪
 * @date 2018/09/27
 * @since Version 1.0
 */
//Q: 数组的每个指针i及其值作为坐标（i,a[i]），求坐标间面积的最大值
//Best answer: 最佳方法是从数组头和尾取指针，两指针相等时跳出，否则一直向中间紧逼
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int max_area = 0;
        if(height.length < 2)
            return 0;

        for(int i=0; i<height.length; i++){
            for(int j=i+1; j<height.length; j++){
                int temp_area = Math.min(height[i], height[j]) * (j - i);

                if(temp_area > max_area)
                    max_area = temp_area;
            }
        }

        return max_area;
    }

    public static void main(String[] args) {
        int[] a = {1,8,6,2,5,4,8,3,7};
        System.out.println(new ContainerWithMostWater().maxArea(a));
    }
}
