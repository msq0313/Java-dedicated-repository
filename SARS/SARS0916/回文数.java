package SARS.SARS0916;

import java.util.Scanner;

public class 回文数 {
    public static void main(String[] args) {
        System.out.println("请输入整数");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(isPalindrome(n));
    }
    private static boolean isPalindrome(int x){
        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        if (x == 0) {
            return true;
        }
        boolean istrue;
        int i = 0;
        //循环使后半部分数反转
        while (x > i) {
            i = i * 10 + x % 10;
            x /= 10;
        }
        istrue = x == i || x == i / 10;
        return istrue;
    }
}
