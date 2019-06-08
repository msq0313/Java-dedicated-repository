package Multi0603.Demo04updown;
/*
如何才能知道一个父类引用的对象，本来是什么子类？
格式：
对象 instanceof 类名称
得到boolean值结果，也就是判断前面的对象能不能当做后面类型的实例
 */
public class Instanceof {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.eat();

        //判断一下父类引用animal本来是猫还是狗
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.act();
        } else if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.act();
        }
    }
}
