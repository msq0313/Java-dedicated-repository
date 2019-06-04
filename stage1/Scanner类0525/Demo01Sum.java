package Scanner类0525;


import java.util.Scanner;

/*
Scanner：
引用类型的一般使用步骤：

1.导包
import 包路径.类名称；
如果需要使用的目标类，和当前类位于同一个包下，则可以省略导包语句不写。
只有java.lang包下的内容不需要导包，其他的包都需要import语句

2.创建
类名称 对象名 = new 类名称();
Scanner sc new Scanner(System.in);

3.使用
对象名.成员方法名()

System.in代表从键盘输入

获取键盘输入的一个int数字：int num = sc.nextInt();
获取键盘输入的一个字符串：String str = sc.next();

题目：键盘输入两个int数字，并且求出和值。

思路：
1.既然需要键盘输入，那么就用Scanner
2.Scanner的三个步骤：导包、创建、使用
3.需要两个数字，调用两次nextInt方法
 */
public class Demo01Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int a = sc.nextInt();
        System.out.println("请输入第二个数字");
        int b = sc.nextInt();

        int result = a + b;
        System.out.println("结果是：" + result);

    }
}
