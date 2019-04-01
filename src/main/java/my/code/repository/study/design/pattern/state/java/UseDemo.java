package my.code.repository.study.design.pattern.state.java;

/**
 * 状态模式: 对象的行为会随状态的改变而改变, 其结构和策略模式几乎一致.
 *
 * @author djh on  2018/11/12 22:17
 * @E-Mail 1544579459@qq.com
 */
public class UseDemo {
    public static void main(String[] args) {
        Context context = new Context();
        context.setState(new PowerOffState());

        context.controlToNextChannel();

        context.setState(new PowerOnState());

        context.controlTurnUpVolume();
    }
}
