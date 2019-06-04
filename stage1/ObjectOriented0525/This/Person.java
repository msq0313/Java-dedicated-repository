package ObjectOriented0525.This;

public class Person {

    String name;//自己的名字

    //who是对方的名字
    public void sayHello(String name) {
        System.out.println(name + "，你好。我是" + this.name);
    }
}
