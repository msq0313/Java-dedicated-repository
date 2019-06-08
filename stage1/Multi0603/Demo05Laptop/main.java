package Multi0603.Demo05Laptop;

public class main {
    public static void main(String[] args) {
        laptop laptop = new laptop();
        laptop.powerOn();
//        USB usb = new mouse();都是正确写法
//        keyboard keyboard = new keyboard();
        laptop.useDevice(new mouse());

        laptop.useDevice(new keyboard());
        laptop.powerOff();
    }
}
