package Random0526;

import java.util.Random;
import java.util.Scanner;

/*
题目要求：
根据int变量n的值，来获取随机数字，范围是[1,n]。

 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入n:");
        int n = sc.nextInt();
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            int num =  r.nextInt(n) + 1;
            System.out.println(num);
        }
    }
}
