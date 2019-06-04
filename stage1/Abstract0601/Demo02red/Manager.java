package Abstract0601.Demo02red;

import java.util.ArrayList;

public class Manager extends Users {
    public Manager() {
    }

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList send(int money, int n) {
        //需要一个集合，用来存储若干个红包的金额
        ArrayList<Integer> list = new ArrayList<>();
        //看一下群主初始金钱够不够
        int firstmoney = super.getMoney();
        if (money > firstmoney) {
            System.out.println("余额不足");
            return list;//返回空集合
        }
        int kind1 = money / n;
        int kind2 = kind1 + money % n;
        for (int i = 0; i < n - 1; i++) {
            list.add(kind1);
        }
        //最后一个红包
        list.add(kind2);
        //重新设置余额
        super.setMoney(firstmoney - money);

        return list;

    }
}
