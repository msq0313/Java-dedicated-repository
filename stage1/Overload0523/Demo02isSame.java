package Overload0523;

/*
题目要求：
比较两个数据是否相等。
参数类型分别为两个byte类型，两个short类型，两个int类型，两个long类型，
并在main方法中进行测试。
 */
public class Demo02isSame {
    public static void main(String[] args) {
        System.out.println(isSame(4,6));
        System.out.println(isSame((short)5,(short)5));
    }

    public static boolean isSame(byte a, byte b) {
        System.out.println("byte");
        return a == b;
    }
    public static boolean isSame(short a, short b) {
        System.out.println("short");
        return a == b;
    }
    public static boolean isSame(int a, int b) {
        System.out.println("int");
        return a == b;
    }
    public static boolean isSame(long a, long b) {
        System.out.println("long");
        return a == b;
    }
}
