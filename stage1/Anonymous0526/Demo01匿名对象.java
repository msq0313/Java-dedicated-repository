package Anonymous0526;

/*
创建对象的标准格式：
类名称 对象名 = new 类名称();

匿名对象就是只有右边的对象，没有左边的名字和赋值运算符。
new 类名称();

注意：匿名对象只能使用一次，下次再用不得不再创建一个新对象。
使用建议：如果确定有一个对象只需要使用唯一的一次，就可以用匿名对象。
 */
public class Demo01匿名对象 {
    public static void main(String[] args) {
        Person one = new Person();
        one.name = "高圆圆";
        one.showName();
        System.out.println("=============");

        //匿名对象
        new Person().name = "赵又廷";
        new Person().showName();
    }
}
