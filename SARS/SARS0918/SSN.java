package SARS.SARS0918;

import java.util.Scanner;

public class SSN {
    public static void main(String[] args) {
        System.out.println("Enter a SSN:");
        Scanner input = new Scanner(System.in);
        String s = input.next();
        int flag = 0;
        if (s.length() == 11 && s.charAt(3) == '-' && s.charAt(6) == '-') {
            for (int i = 0; i < s.length(); i++) {
                if (i == 3) {
                    continue;
                }
                if(i == 6){
                    continue;
                }
                if (s.charAt(i) < '0' || s.charAt(i) > '9') {
                    flag = 1;
                    break;
                }
            }
        }
        else flag = 1;

        if (flag == 0) {
            System.out.println(s + " is a valid social security number");
        } else if (flag == 1) {
            System.out.println(s + " is an invalid social security number");
        }
    }
}