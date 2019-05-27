package Anonymous0526;

import java.util.Scanner;

public class Demo02匿名对象作参数及返回值 {
    public static void main(String[] args) {
        //普通使用方式
//        Scanner sc = new Scanner(System.in);
//        int sum = sc.nextInt();

        //匿名对象的方式
//        int num = new Scanner(System.in).nextInt();
//        System.out.println("输入的是：" + num);

        //使用一般方法传参
//        Scanner sc = new Scanner(System.in);
//        methodParam(sc);

        //使用匿名对象传参
//        methodParam(new Scanner(System.in));

        System.out.println("输入的是：" + methodReturn().nextInt());

    }

//    int num = methodReturn().nextInt();
//        System.out.println(num);



    public static void methodParam(Scanner sc) {
        int num = sc.nextInt();
        System.out.println("输入的是：" + num);
    }

    public static Scanner methodReturn() {
        return new Scanner(System.in);
    }
}
