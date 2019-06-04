package demo02;

/*
定义格式：
public static void 方法名称（）{
    方法体
}
调用格式：
方法名称（）；
 */

public class Demo01Method {
    public static void main(String[] args) {
        printMethod();
    }

    public static void printMethod() {
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i <= 20; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
