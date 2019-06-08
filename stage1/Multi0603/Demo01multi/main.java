package Multi0603.Demo01multi;
/*
代码当中体现多态性，其实就是一句话：父类引用指向子类对象。

格式：
父类名称 对象名 = new 子类名称();
或者
借口名称 对象名 = new 实现类名称();
 */
public class main {
    public static void main(String[] args) {
        Fu obj = new Zi();

        obj.method();
        obj.methodFu();
    }
}
