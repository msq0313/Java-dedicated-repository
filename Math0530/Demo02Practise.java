package Math0530;

/*
题目：
计算在-10.8到5.9之间，绝对值大于6或者小于2.1的整数有多少个？
 */
public class Demo02Practise {
    public static void main(String[] args) {
        double num1 = -10.8;
        double num2 = 5.9;
        int a = -11;
        int i = 0;
        while (a < num2) {
            if (a > num1 && a < num2
                    && Math.abs(a) > 6 || Math.abs(a) < 2.1) {
                i++;
            }
            a++;
        }
        System.out.println(i);
    }
}
