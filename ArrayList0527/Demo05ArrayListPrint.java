package ArrayList0527;

import java.util.ArrayList;
import java.util.List;

/*
题目：
定义以指定格式打印集合的方法（ArrayList类型作为参数）
格式参照： {元素@元素@元素}。

System.out.println(list); [10,20,30]
printArrayList(list); {10@20@30}
 */
public class Demo05ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("迪丽热巴");
        list.add("古力娜扎");
        list.add("马尔扎哈");
        list.add("张无忌");
        printArrayList(list);
    }

    public static void printArrayList(ArrayList<String> list) {
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i != list.size() - 1) {
                System.out.print("@");
            } else {
                System.out.println("}");
            }
        }
    }
}
