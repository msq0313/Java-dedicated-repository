package Multi0603.Demo04updown;
/*
向上转型一定是安全的，正确的。但是也有一个弊端，
对象一旦向上转型为父类，那么就无法调用子类原本特有的内容。
 */
public class main {
    public static void main(String[] args) {
        //对象的向上转型，就是：父类引用指向子类对象。
        Animal animal = new Cat();//创建的时候是一只猫
        animal.eat();//猫吃鱼

        //animal.act;//错误写法!
        Cat cat = (Cat) animal;
        cat.act();

        Dog dog = (Dog) animal;
        //编译不会报错，发生类转换异常ClassCastException
    }
}
