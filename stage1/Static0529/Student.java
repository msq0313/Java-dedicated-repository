package Static0529;

public class Student {
    private int id;
    private String name;//姓名
    private int age;//年龄
    static String room;
    private static int idCounter = 0;//学号计数器，new一次加1

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++idCounter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
