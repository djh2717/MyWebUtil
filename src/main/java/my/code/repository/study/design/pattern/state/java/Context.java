package my.code.repository.study.design.pattern.state.java;

/**
 * @author djh on  2018/11/12 22:06
 * @E-Mail 1544579459@qq.com
 */
public class Context {
    private State mState;

    public void setState(State state) {
        mState = state;
    }

    void controlToNextChannel() {
        mState.nextChannel();
    }

    void controlTurnUpVolume() {
        mState.turnUpVolume();
    }
}
