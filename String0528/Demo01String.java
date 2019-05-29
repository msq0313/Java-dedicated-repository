package String0528;

/*
创建字符串的常见3+1钟方式。
三种构造方法：
public String() 创建一个空白字符串，不含有任何内容。
public String(char[] array) 根据字符数组的内容，来创建对应的字符串。
public String(byte[] array) 根据字节数组的内容，来创建对应的字符串。
一种直接创建：曾经一直用的 String str = "abc";
 */
public class Demo01String {
    public static void main(String[] args) {
        //使用空参构造
        String str1 = new String();
        System.out.println("第一个字符串：" + str1);

        //根据字符数组创建字符串
        char[] charArray = {'a', 'b', 'c' };
        String str2 = new String(charArray);
        System.out.println("第二个字符串：" + str2);

        //根据字节数组创建字符串
        byte[] byteArray = {97, 98, 99};
        String str3 = new String(byteArray);
        System.out.println("第三个字符串：" + str3);

        //直接创建
        String str4 = "h3235j";
        System.out.println("第四个字符串：" + str4);

    }
}
