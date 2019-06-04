package Random0526;

import java.util.Random;
import java.util.Scanner;

/*
题目：
用代码模拟猜数字小游戏。

 */
public class Demo02 {
    public static void main(String[] args) {
        Random r = new Random();
        int randomNum = r.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("请猜数:");
        while (true) {
            int guessNum = sc.nextInt();
            if (guessNum > randomNum) {
                System.out.println("大了");
            } else if (guessNum < randomNum) {
                System.out.println("小了");
            } else {
                System.out.println("猜中了！游戏结束");
                break;
            }
        }
    }
}
