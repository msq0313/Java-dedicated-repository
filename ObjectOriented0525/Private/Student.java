package ObjectOriented0525.Private;

/*
对于基本类型当中的boolean值，Getter方法一定要写成isXxx的形式，
而SetterXxx规则不变。
 */
public class Student {

    private String name;//姓名
    private int age;//年龄
    private boolean male;//是不是男生

    public void setMale(boolean b) {
        male = b;
    }

    public boolean isMale() {
        return male;
    }

    public void setName(String str) {
        name = str;
    }

    public String getName() {
        return name;
    }

    public void setAge(int num) {
        age = num;
    }

    public int getAge() {
        return age;
    }
}
