package Extends0531.Demo03Constructor;

/*
继承关系中，父子类构造方法的访问特点：

1.子类构造方法当中有一个默认隐含的“super()”调用，所以一定是先调用的
父类构造，后执行子类构造。
2.子类构造可以通过super关键字来调用父类重载构造。
3.super的父类构造调用，必须是子类构造方法的第一个语句。不能出现多次super()。
总结：
子类必须调用父类构造方法，不写则默认添加super();写了则用写的指定的super调用，
super()只能有一个，且必须是第一个语句。
 */
public class main {
    public static void main(String[] args) {
        Zi zi = new Zi();
    }
}