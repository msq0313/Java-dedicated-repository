package Extends0531.Demo01Extends;

public class Zi extends Fu{
    int numZi = 20;
    int num = 200;

    public void methodZi() {
        //本类当中有num，用本类，没有则向上找
        System.out.println(num);
    }
}
