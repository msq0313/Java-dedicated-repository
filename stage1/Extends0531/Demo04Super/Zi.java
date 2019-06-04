package Extends0531.Demo04Super;
/*
super关键字的用法有三种：
1.在子类的成员方法中，访问父类的成员变量。
2.在子类的成员方法中，访问父类的成员方法。
3.在子类的构造方法中，访问父类的构造方法。
*/
public class Zi extends Fu {

    public Zi() {
        super();
        System.out.println("子类构造方法执行");
    }

    public void methodZi() {
        System.out.println(super.num);//父类中的num
    }

    public void method() {
        super.method();
    }
}
