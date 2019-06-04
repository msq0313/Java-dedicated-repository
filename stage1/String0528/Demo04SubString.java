package String0528;

/*
字符串的截取方法：

public String substring(int index):截取从参数位置一直到字符串末尾，返回新字符串
public String substring(int begin, int end):截取[begin,end)，返回新字符串
 */
public class Demo04SubString {
    public static void main(String[] args) {
        String str1 = "HelloWorld";
        String str2 = str1.substring(5);
        System.out.println(str1);
        System.out.println(str2);

        String str3 = str1.substring(4,7);
        System.out.println(str3);


    }
}
