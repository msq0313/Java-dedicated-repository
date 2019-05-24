package method0522.demo03;

/*
题目：
方法 用来打印指定次数的HelloWorld。
 */
public class Demo03MethodPrint {
    public static void main(String[] args) {
        print(3);
    }

    public static void print(int a) {
        for (int i = 0; i < a; i++) {
            System.out.println("Hello World!" + (i +1 ));
        }
    }
}
