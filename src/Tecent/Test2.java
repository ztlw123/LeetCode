package Tecent;

import java.util.*;

/**
 * @Author zjh
 * @Date 2019/09/01,20:05
 */
public class Test2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list.add(0);
        list.add(2);
        list.add(3);

        list.add(1,1);
        list.set (0,5);
        for(Integer a: list)
            System.out.println(a);

    }
}
