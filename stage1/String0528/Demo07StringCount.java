package String0528;

import java.util.Scanner;

/*
题目：
键盘输入一个字符串，并且统计其中各种字符出现的次数。
种类有：大写字母、小写字母、数字、其他

 */
public class Demo07StringCount {
    public static void main(String[] args) {
        int big = 0, small = 0, num = 0, other = 0;
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] c = str.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] >= 'A' && c[i] <= 'Z') {
                big++;
            } else if (c[i] >= 'a' && c[i] <= 'z') {
                small++;
            } else if (c[i] >= '0' && c[i] <= '9') {
                num++;
            } else {
                other++;
            }
        }
        System.out.println("大写字母个数：" + big);
        System.out.println("小写字母个数：" + small);
        System.out.println("数字个数：" + num);
        System.out.println("其他元素个数：" + other);
    }
}
