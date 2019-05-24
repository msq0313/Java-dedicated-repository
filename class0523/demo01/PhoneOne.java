package class0523.demo01;

/*
通常情况下，一个类并不能直接使用，需要根据类创建一个对象，才能使用。

1.导包：也就是指出需要使用的类，在什么位置。
import 包名称.类名称；
import demo01.Phone;
对于和当前类属于同一个包的情况，可以省略导包语句不写。

2.创建，格式：
根据Phone类，创建一个名为one的对象
格式：类名称 + 对象名 = new + 类名称()

3.使用，分为两种情况：
使用成员变量：对象名.成员变量名
使用成员方法：对象名.成员方法名(参数)

 */
public class PhoneOne {

    public static void main(String[] args) {

        Phone one = new Phone();

        System.out.println(one.brand);
        System.out.println(one.price);
        System.out.println(one.color);

        System.out.println("======================");
        one.brand = "苹果";
        one.price = 8000;
        one.color = "玫瑰金";

        System.out.println(one.brand);
        System.out.println(one.price);
        System.out.println(one.color);

        one.call("乔布斯");
        one.message();
    }
}
