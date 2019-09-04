package HuaWei;

/**
 * @Author zjh
 * @Date 2019/07/26,18:46
 */
public class h2016 {
    public static void main(String[] args) {
        int[] a = {5,3,3,6,1,7,1,2};
        hw_1("9,AUStralia");
        hw_2(a);
    }

    public static void hw_1(String str) {
        char[] arr = str.toCharArray();
        for(int i=0; i<arr.length; i++) {
            if (arr[i] >= 'A' && arr[i] <= 'Z')
                System.out.print(arr[i]);
        }
    }

    public static void hw_2(int[] arr) {
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<arr.length; i++) {
            for (int j=0; j<arr.length-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
                }
            }
        }

        sb.append(arr[0]);
        for(int i=1; i<arr.length; i++) {
            if(arr[i] == arr[i-1])
                continue;
            sb.append(arr[i]);
        }

        System.out.println(sb.toString());
    }
}
