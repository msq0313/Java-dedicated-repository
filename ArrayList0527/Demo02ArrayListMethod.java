package ArrayList0527;

/*
ArrayList当中常用的方法有：

public boolean add(E e): 向集合中添加元素，参数的类型和泛型一致。
public E get(int index): 从集合当中获取元素，参数是索引编号，返回值就是对应位置的元素。
public E remove(int index):从集合当中删除元素，参数是索引编号，返回值就是被删除掉的元素。
public int size():获取集合的尺寸长度，返回值是集合中包含的元素的个数。
 */

import java.util.ArrayList;


public class Demo02ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //向集合中添加元素：
        list.add("迪丽热巴");
        list.add("古力娜扎");
        list.add("马尔扎哈");
        list.add("赵丽颖");
        //从集合中获取元素：
        System.out.println(list.get(1));
        //从集合中删除元素：删除元素后，会被后面元素补上来
        System.out.println(list.remove(2));
        System.out.println(list.get(2));
        //获取长度：
        System.out.println(list.size());
    }
}
