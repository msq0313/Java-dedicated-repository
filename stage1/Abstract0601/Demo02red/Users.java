package Abstract0601.Demo02red;

public class Users {
    private String name;//姓名
    private int money;//余额

    public Users() {
    }

    public Users(String name, int money) {
        this.name = name;
        this.money = money;
    }

    //展示一下当前用户有多少钱
    public void show() {
        System.out.println("我叫：" + name + "我有：" + money);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
