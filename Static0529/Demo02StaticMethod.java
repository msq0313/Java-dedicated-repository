package Static0529;

/*
一旦使用static修饰成员方法，就成为静态方法。静态方法不属于对象，而属于类
如果方法没有static关键字，那么必须首先创建对象，然后通过对象才能使用它。

静态变量：类名称.静态变量
静态方法：类名称.静态方法（）

注意事项：
1、静态不能访问非静态
原因：因为在内存中先有静态内容，后有非静态内容。先人不知道后人，后人知道先人。
静态方法当中不能用this关键字
原因：this代表当前对象，通过谁调用的方法，谁就是当前对象。
 */
public class Demo02StaticMethod {
    public static void main(String[] args) {
        MyClass a = new MyClass();//首先创建对象
        //然后才能使用没有static关键字的内容
        a.method();

        //对于静态方法来说，可以通过对象名进行调用，也可以直接通过类名
        a.methodStatic();//正确，不推荐，编译后也会成为下面这种
        MyClass.methodStatic();//正确，不推荐

        //对于本类当中的静态方法，可以省略类名称
        myMethod();
    }

    public static void myMethod() {
        System.out.println("自己的方法！");
    }
}
