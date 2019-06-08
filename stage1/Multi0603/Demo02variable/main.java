package Multi0603.Demo02variable;
/*
访问成员变量的两种方式：

1.直接通过对象名称访问成员变量：看等号左边是谁，优先用谁，没有则向上找。
2.间接通过成员方法访问成员变量：看该方法属于谁（Ctrl单击），优先用谁，没有则向上找。
 */
public class main {
    public static void main(String[] args) {
        Fu obj = new Zi();
        System.out.println(obj.num);
        System.out.println("=============");

        //子类没有覆盖重写，就是父
        //子类如果覆盖重写，就是子
        obj.shouNum();
    }
}
