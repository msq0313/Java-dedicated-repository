package Multi0603.Demo05Laptop;

public class keyboard implements USB{
    @Override
    public void start() {
        System.out.println("键盘连接");
    }

    @Override
    public void off() {
        System.out.println("键盘断开");
    }

    public void type() {
        System.out.println("键盘输入");
    }
}
