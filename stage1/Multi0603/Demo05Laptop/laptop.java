package Multi0603.Demo05Laptop;

public class laptop {
    public void powerOn() {
        System.out.println("笔记本开机");
    }

    public void powerOff() {
        System.out.println("笔记本关机");
    }

    public void useDevice(USB usb) {
        usb.start();
        if (usb instanceof mouse) {
            mouse mouse = new mouse();
            mouse.click();
        } else if (usb instanceof keyboard) {
            keyboard keyboard = new keyboard();
            keyboard.type();
        }
        usb.off();
    }

}
