package Scanner类0525;

import java.util.Scanner;

/*
题目：
键盘输入三个int数字，然后求出其中的最大值

思路：

 */
public class Demo02Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[3];
        System.out.println("请输入三个数字");
        array[0] = sc.nextInt();
        array[1] = sc.nextInt();
        array[2] = sc.nextInt();
        int max = array[0];
        for (int i = 1; i < 3; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("最大值是" + max);
    }
}
