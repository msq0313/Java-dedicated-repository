package method0522.demo02;

/*
定义方法的完整方式：
修饰符 返回值类型 方法名称（参数类型 参数名称，...）{
    方法体
    return 返回值；
}

修饰符：现阶段的固定写法，public static
返回值类型：也就是方法最终产生的数据结果是什么类型
方法名称：方法的名字，规则和变量一样，小驼峰
PS：参数如果有多个，使用逗号进行分隔
return: 第一停止当前方法，第二返回值

！注意：void类型方法只能够  单独调用

 */

public class Demo02Method {

    public static void main(String[] args) {
        System.out.println(sum(10,20));
    }
    public static int sum(int a, int b){
        int sum = a + b;
        return sum;
    }
}
