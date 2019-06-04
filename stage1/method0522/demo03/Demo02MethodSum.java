package method0522.demo03;

/*
题目：
方法 求出1-100之间所有数字的和值。
 */
public class Demo02MethodSum {
    public static void main(String[] args) {
        System.out.println(sum());
    }

    public static int sum() {
        int sum = 0;
        for (int i = 1; i < 101; i++) {
            sum += i;
        }
        return sum;
    }
}
