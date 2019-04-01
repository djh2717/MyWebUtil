package my.code.repository.study.design.pattern.observe.java;

/**
 * @author Djh on 2018/7/27 14:49
 * E-Mail ：1544579459@qq.com
 */
public interface Subject {
    void register(Observe observe);

    void remove(Observe observe);

    void notifyChange();
}
