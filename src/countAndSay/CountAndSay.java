package countAndSay;

/**
 * @Author zjh
 * @Date 2018/11/13,20:02
 * @Description 1用字符串“1”表示，2则读取1中数字个数，即“一个1”，表示为"11",3则读取2中数字个数，即“两个1”，表示为"21",
 *              4则读取3中数字个数，即“一个2一个1”，表示为"1211",5则读取4中数字个数，即“一个1，一个2，两个1”，表示为"111221"。
 *              依次类推。
 *              6. 312211  7.13112221等
 * @Solution 采用递归的思想，n为1时返回1，否则在它前一个字符串中做比较得出最新的字符串
 */
public class CountAndSay {
    public String countAndSay(int n) {
        if(n == 1)
            return "1";

        String str = countAndSay(n-1) + "*";    //加个*可避免数组越界
        String result = "";
        int count = 1;

        char[] c = str.toCharArray();

        for(int i=0; i<c.length-1; i++){
            if(c[i] == c[i+1]){
                count++;
            }
            else {
                result = result + count + c[i];
                count = 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(new CountAndSay().countAndSay(10));
    }
}
