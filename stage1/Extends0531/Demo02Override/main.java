package Extends0531.Demo02Override;
/*
方法覆盖重写的注意事项：

1.必须保证父子类之间方法的名称相同，参数列表也相同。
@Override:写在方法前面，用来检测是不是有效的正确覆盖重写。
这个注解就算不写，只要满足需求，也是正确的方法覆盖重写。

2.子类方法的返回值必须【小于等于】父类方法的返回值范围。
小扩展提示：java.lang.Object类是所有类的公共最高父类

3.子类方法的权限必须【大于等于】父类方法的权限修饰符。
public > protected > (default) > private
 */
public class main {
}
