package Multi0603.Demo05Laptop;

public class mouse implements USB {
    @Override
    public void start() {
        System.out.println("鼠标连接");
    }

    @Override
    public void off() {
        System.out.println("鼠标断开");
    }

    public void click() {
        System.out.println("点击");
    }
}
