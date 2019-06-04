package Abstract0601.Demo02red;

import java.util.ArrayList;
import java.util.Random;

public class Member extends Users {

    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }

    public void receive(ArrayList<Integer> list) {
        //随机获取一个集合当中的索引编号
        int index = new Random().nextInt(list.size());
        int money = list.remove(index);
        //当前成员自己本来有多少钱：
        int firstmoney = super.getMoney();
        super.setMoney(firstmoney + money);
    }
}
