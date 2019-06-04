package Static0529;

public class MyClass {

    //成员方法 可访问成员变量、静态变量
    public void method() {
        System.out.println("这是一个普通的成员方法。");
    }

    //静态方法 只可访问静态变量、不可访问成员变量
    public static void methodStatic() {
        System.out.println("这是一个静态方法。");
    }
}
