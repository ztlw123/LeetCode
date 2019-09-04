package 笔试题;

/**
 * @Author zjh
 * @Date 2019/03/18,10:15
 */
import java.util.*;

public class FishEatFish {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);

        int index = 0;
        for(; index<n; index++){
            if(arr[index] > 0)
                break;
        }

        if(index == 0) {
            int count = arr[index];
            for(int i=1; i<n-1; i++)
                count = count - arr[i];

            System.out.println(arr[n-1] - count);
            return;
        }
        else if(index == n-1) {
            int count = 0;
            for(int i=0; i<n-1; i++)
                count += arr[i];

            System.out.println(arr[n-1] - count);
            return;
        }
        else {
            int count1 = 0;
            int count2 = arr[index];
            for(int i=0; i<index; i++)
                count1 += arr[i];

            for (int j=index+1; j<n-1; j++)
                count2 = count2 - arr[j];

            System.out.println(arr[n-1] - count1 - count2);

            return;
        }

    }
}