package String0528;

/*
分割字符串的方法：
public String[] split(String regex):按照参数的规则，
将字符串切分成为若干部分。

注意事项:
split方法的参数其实是一个“正则表达式”，今后学习。
 */
public class Demo06StringSplit {
    public static void main(String[] args) {
        //以逗号分隔
        String str1 = "aaa,bbb,ccc";
        String[] array1 = str1.split(",");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        //空格也可
        //'.'不可
        System.out.println("===============");
//      注意：如果按照英文句点"."进行切分，必须写"\\." 两个反斜杠
        String str2 = "aaa.bbb.ccc";
        String[] array2 = str1.split("\\.");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
    }
}
