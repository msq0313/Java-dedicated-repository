package SARS.SARS0918;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SSN2 {
    public static void main(String[] args) {
        String eL = "[0-9]{3}-[0-9]{2}-[0-9]{4}";
        Pattern p = Pattern.compile(eL);
        System.out.println("Enter a SSN:");
        Scanner input = new Scanner(System.in);
        String test = input.next();
        Matcher m = p.matcher(test);
        boolean dataFlag = m.matches();
        if (!dataFlag) {
            System.out.println(test + " is an invalid social security number");
        }else{
            System.out.println(test + " is a valid social security number");
        }
    }
}
