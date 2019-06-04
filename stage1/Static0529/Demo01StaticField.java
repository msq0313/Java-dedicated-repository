package Static0529;

/*
如果一个成员变量使用了static关键字，那么这个变量不再属于对象自己，
而是属于所在的类。多个对象共享同一份数据。
 */
public class Demo01StaticField {
    public static void main(String[] args) {
        Student one = new Student("比尔", 19);
        one.room = "101教室";
        System.out.println("姓名：" + one.getName() + "，年龄：" + one.getAge() +
                "，学号：" + one.getId());
        Student two = new Student("盖茨", 20);
        System.out.println("姓名：" + two.getName() + "，年龄：" + two.getAge() +
                "，学号：" + two.getId());
    }
}
