package method0522.demo02;

/*
有参数：小括号当中有内容，当一个方法需要一些数据条件，才能完成任务的时候，就是有参数。
例如两个数字相乘，必须知道两个数字各是多少，才能相乘。

无参数：小括号当中留空。一个方法不需要任何数据条件，自己就能独立完成任务，就是无参数。
例如定义一个方法，打印固定10次HelloWorld。
 */
public class Demo03MethodParam {

    public static void main(String[] args) {
        method1(10,20);
        method2();
    }
    //两个数字相乘 有参数
    public static void method1(int a, int b) {
        int result = a * b;
        System.out.println(result);
    }

    //打印十次Hello World 无参数
    public static void method2() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World!");
        }
    }
}



