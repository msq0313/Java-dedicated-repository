package demo04;

public class MethodOverloadSame {

    public static void main(String[] args) {
        long a=20;
        byte b=25;
        System.out.println(isSame(a,b));
    }

    public static boolean isSame(byte a, byte b) {
        System.out.println("两个byte参数的方法执行！");
        boolean same;
        if (a == b) {
            same = true;
        } else {
            same = false;
        }
        return same;
    }

    public static boolean isSame(short a, short b) {
        System.out.println("两个short");
        boolean same = a == b ? true : false;
        return same;
    }

    public static boolean isSame(int a, int b) {
        System.out.println("两个int");
        return a == b;
    }

    public static boolean isSame(long a, long b) {
        System.out.println("两个long");
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }
}