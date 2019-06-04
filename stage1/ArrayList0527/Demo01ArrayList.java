package ArrayList0527;

import java.util.ArrayList;

/*
数组的长度不可以发生改变。
但是ArrayList集合的长度是可以随意变化的。

对于ArrayList来说，有一个尖括号<E>代表泛型。
泛型：也就是装在集合当中的所有元素，全都是统一的一种类型。
注意：泛型只能是引用类型，不能是基本类型。
 */
public class Demo01ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);

        list.add("123");
        list.add("323");
        list.add("456");

        System.out.println(list);

//        list.add(100);错误写法
    }
}
