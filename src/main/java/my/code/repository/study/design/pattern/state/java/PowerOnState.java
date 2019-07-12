package my.code.repository.study.design.pattern.state.java;

/**
 * @author djh on  2018/11/12 22:08
 * @E-Mail 1544579459@qq.com
 */
public class PowerOnState implements State {
    @Override
    public void nextChannel() {
        System.out.println("下一频道");
    }

    @Override
    public void turnUpVolume() {
        System.out.println("调高音量");
    }

    @Override
    public void turnDownVolume() {
        System.out.println("调低音量");
    }
}
