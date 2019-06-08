package Multi0603.Demo03method;
/*
在多态的代码当中，成员方法的访问规则是：
看new的是谁，就优先用谁，没有则向上找。

口诀：编译看左边，运行看右边。
左边类里有没有，决定编译过不过，右边类里决定运行哪个方法，
没有则向上找。
 */
public class main {
    public static void main(String[] args) {
        Fu obj = new Zi();//多态
        obj.method();//父子都有，优先用子
        obj.methodfu();//子类没有，父类有，向上找父类
//        obj.methodzi();错误写法
    }
}
