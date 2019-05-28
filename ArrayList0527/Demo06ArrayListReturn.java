package ArrayList0527;

import com.sun.source.tree.LiteralTree;

import java.util.ArrayList;
import java.util.Random;

/*
题目：
用一个大集合存入20个随机数字，然后筛选其中的偶数元素，放到小集合中。
要求使用自定义的方法来实现筛选。

 */
public class Demo06ArrayListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            list1.add(r.nextInt(10));
        }
        System.out.println(list1);
        System.out.println("========================");
        ArrayList<Integer> list2 = listReturn(list1);
        System.out.println("偶数个数为:" + list2.size());
        System.out.println(list2);
    }
    public static ArrayList listReturn(ArrayList<Integer> list) {
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            if (list.get(i) % 2 == 0) {
                list2.add(list.get(i));
            }
        }
        return list2;
    }
}
