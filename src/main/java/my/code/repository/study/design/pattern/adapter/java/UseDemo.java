package my.code.repository.study.design.pattern.adapter.java;

/**
 * 适配器模式: 关键字 "适配".
 * <p>
 * 此模式用于把两个互相不关联的对象通过适配的方法使其能够在一起工作.
 * <p>
 * 该模式主要有三种类别:
 * <p>
 * 1.继承适配器. 通过继承一个类, 重写父类的方法, 然后实现某个接口, 在重写的父类方法中调用实现的接口
 * 方法, 从而完成了从父类到接口的适配.
 * <p>
 * 2.对象适配器. Java中的继承过于宝贵, 且继承是侵入性的, 因此我们更应该采用关联的方法来持有一个对象,
 * 然后实现某个接口, 在接口方法中调用对象的方法, 从而实现适配.
 * <p>
 * 3.接口适配器. 通过对某个接口的空实现, 然后让客户端只需重写想要实现的具体行为即可, 此模式很常见,
 * 如: AnimatorListenerAdapter.
 *
 * @author djh on  2018/8/10 00:05
 * @E-Mail 1544579459@qq.com
 */
public class UseDemo {

    private static class Mobile {
        private void charge(int voltage) {
            if (voltage == 5) {
                System.out.println("电压匹配成功!");
            } else {
                System.out.println("高电压");
            }
        }
    }

    public static void main(String[] args) {
        ObjectAdapter objectAdapter = new ObjectAdapter(new Src());
        Mobile mobile = new Mobile();
        mobile.charge(objectAdapter.mobileCharge());
    }
}