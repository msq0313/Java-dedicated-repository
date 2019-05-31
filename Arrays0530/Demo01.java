package Arrays0530;

import java.sql.SQLOutput;
import java.util.Arrays;

/*
java.util.Arrays是一个与数组相关的工具类，
里面提供了大量的静态方法，用来实现数组常用操作。

public static String toString(数组）:将参数数组变成字符串
[元素1，元素2，元素3...]

public static void sort(数组):
按照默认升序（从小到大）对数组的元素进行排序

备注：
1.如果是数值，sort默认从小到大
2.如果是字符串，sort默认升序
3.如果是自定义类型，那么这个自定义的类需要有
Comparable或者Comparator接口的支持
 */

public class Demo01 {
    public static void main(String[] args) {
        int[] array = {20, 30, 10};
        //将int[]数组按照默认格式变成字符串
        String str = Arrays.toString(array);
        System.out.println(str);
        System.out.println("================");

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
