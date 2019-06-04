package Arrays0530;

import java.util.Arrays;
import java.util.SortedMap;

/*
题目：
请使用Arrays相关的API，将一个随机字符串中的所有字符升序排列，
并倒序打印。
 */
public class Demo02Practise {
    public static void main(String[] args) {
        String str = "k3jqw234l56kj234l6h";

        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        //倒序遍历
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]);
        }
    }
}
