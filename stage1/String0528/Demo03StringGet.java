package String0528;

/*
String当中与获取有关的常用方法有：

public int length():获取字符串当中含有的字符个数，拿到字符串长度。
public String concat(String str):将当前字符串和参数字符串拼接成为返回值新的字符串。
public char charAt(int index):获取指定索引位置的单个字符。（索引从0开始）
public int indexOf(String str):查找参数字符串在本字符串当中首次出现的索引位置，如果没有返回=1

 */
public class Demo03StringGet {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = " World";
        int length = str1.length();
        System.out.println(length);
        System.out.println(str1.concat(str2));
        System.out.println(str1.charAt(1));
        System.out.println(str1.indexOf(str2));
        System.out.println(str1.indexOf("ell"));
    }
}
