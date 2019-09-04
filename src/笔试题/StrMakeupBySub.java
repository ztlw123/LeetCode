package 笔试题;

import java.util.Scanner;

/**
 * @Author zjh
 * @Date 2019/03/18,10:17
 * @Description 判断一个字符串是否由它的某一个子串不断首尾拼接而成
 * @Solution 首先，这个子串应该小于等于母串长度的一半，所以每次取一个子串，将母串中所有相同子串置空，若母串长度变为0，则说明符合
 */
public class StrMakeupBySub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int i = str.length() / 2;

        for(; i>=0; i--) {

            String sub = str.substring(0, i);
            if(str.replaceAll(sub, "").length() == 0) {
                System.out.println(sub);

                return;
            }
        }

        System.out.println(false);
    }
}
