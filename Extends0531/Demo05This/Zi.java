package Extends0531.Demo05This;
/*
super关键字用来访问父类内容，而this关键字用来访问本类内容，三种用法：
1.在本类的成员方法中，访问本类的成员变量。
2.在本类的成员方法中，访问本类的另一个成员方法。
3.在本类的构造方法中，访问本类的另一个构造方法。
在第三种用法当中要注意：
A.this（调用）也必须是构造方法的第一个及唯一一个语句
B.super和this两种构造调用，不能同时使用
*/
public class Zi extends Fu {
    int num = 10;

    public Zi() {
        this(0);

    }
    public Zi(int num) {
        System.out.println("有参子类构造方法执行");
    }

    public int method(int num) {
        System.out.println(this.num);
        System.out.println(num);
        return num;
    }

    public void method2() {
        System.out.println(this.method(123));
    }
}
