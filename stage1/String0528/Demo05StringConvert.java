package String0528;

/*
String当中与转换相关的常用方法有：

public char[] toCharArray():将当前字符串拆分成为字符数组作为返回值。
public byte[] getBytes():获得当前字符串底层的字节数组。
public String replace(CharSequence oldString, CharSequence newString):
将所有出现的老字符串替换成为新的字符串，返回替换之后的结果新字符串。

 */
public class Demo05StringConvert {
    public static void main(String[] args) {
        //转换成为字符数组
        char[] chars = "Hello".toCharArray();
        System.out.println(chars[0]);
        System.out.println(chars.length);
        //转换成为字节数组
        byte[] bytes = "abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        //替换字符串

        String str1 = "HelloWorld";
        String str2 = str1.replace("l", "*");
        System.out.println(str2);

    }
}
