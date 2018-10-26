package integerToRoman;

/**
 * @Author zjh
 * @Date 2018/10/09,16:38
 * @Description 整数转为罗马数字字符串，只能转换1——3999的数
 * @Solutin 一个罗马符号的字符串数组，对应一个整型数组，通过循环每次判断是否大于整型数组中的数，每次减去该数，找到对应的罗马字符串传入buffer。
 */
public class IntegerToRoman {
    public String intToRoman(int num) {
        StringBuilder stringBuilder = new StringBuilder();

        if(num < 1 || num > 3999)
            return "";

        String[] symbol = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] value =     {1000, 900, 500,  400, 100,   90,  50,   40,  10,    9,   5,    4,   1};

        for(int i=0; num!=0; i++){
            while (num >= value[i]){
                num -= value[i];
                stringBuilder.append(symbol[i]);
            }
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(new IntegerToRoman().intToRoman(58));
    }
}
