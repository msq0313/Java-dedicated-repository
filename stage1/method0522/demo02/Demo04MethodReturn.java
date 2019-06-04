package method0522.demo02;

/*
题目要求：通过方法求出两个数字之和，返回给main 有返回值
题目要求：通过方法打印两个数字之和，无返回值
 */
public class Demo04MethodReturn {
    public static void main(String[] args) {
        System.out.println("返回值是" + sum(10,20));
        print(30, 40);
    }

    public static int sum(int a, int b) {
        return (a + b);
    }

    public static void print(int a, int b) {
        System.out.println("和是" + (a + b));
    }
}
