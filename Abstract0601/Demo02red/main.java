package Abstract0601.Demo02red;

import javax.xml.transform.Source;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Manager manager = new Manager("群主", 100);
        Member member1 = new Member("成员1",0);
        Member member2 = new Member("成员2",0);
        Member member3 = new Member("成员3",0);

        System.out.println("初始金钱：");
        manager.show();
        member1.show();
        member2.show();
        member3.show();
        System.out.println("========================");

        ArrayList<Integer> list = manager.send(20, 3);
        member1.receive(list);
        member2.receive(list);
        member3.receive(list);

        manager.show();
        member1.show();
        member2.show();
        member3.show();
    }
}
