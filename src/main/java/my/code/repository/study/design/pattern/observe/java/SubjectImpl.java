package my.code.repository.study.design.pattern.observe.java;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Djh on 2018/7/27 14:51
 * E-Mail ：1544579459@qq.com
 */
public class SubjectImpl implements Subject {
    private List<Observe> mObserveList;

    SubjectImpl() {
        mObserveList = new ArrayList<>();
    }


    @Override
    public void register(Observe observe) {
        if (observe == null) {
            throw new RuntimeException("Observe is null!");
        }
        if (!mObserveList.contains(observe)) {
            mObserveList.add(observe);
        }
    }

    @Override
    public void remove(Observe observe) {
        mObserveList.remove(observe);
    }

    @Override
    public void notifyChange() {
        for (Observe observe : mObserveList) {
            observe.update();
        }
    }
}
