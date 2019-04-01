package my.code.repository.study.design.pattern.state.java;

/**
 * @author djh on  2018/11/12 22:08
 * @E-Mail 1544579459@qq.com
 */
public class PowerOffState implements State {
    @Override
    public void nextChannel() {
        System.out.println("关机状态,无法操作");
    }

    @Override
    public void turnUpVolume() {
        System.out.println("关机状态,无法操作");
    }

    @Override
    public void turnDownVolume() {
        System.out.println("关机状态,无法操作");
    }
}
