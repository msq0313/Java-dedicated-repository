package Extends0531.Demo03Constructor;

public class Zi extends Fu {
    public Zi() {
//        super();//默认添加，调用父类无参构造方法
        super(20);
        System.out.println("子类构造方法");
    }

    public void method() {
//        super(20);//错误写法，只有子类构造方法，才能调用父类构造方法。
    }
}
