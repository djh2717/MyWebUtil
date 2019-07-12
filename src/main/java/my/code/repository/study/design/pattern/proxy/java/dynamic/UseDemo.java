package my.code.repository.study.design.pattern.proxy.java.dynamic;

import java.lang.reflect.Proxy;

/**
 * @author djh on  2019/3/18 14:20
 * @E-Mail 1544579459@qq.com
 */
public class UseDemo {

    public static void main(String[] args) {

        RealImp realImp = new RealImp();
        SubjectInternal subjectInternal = new SubjectInternal(realImp);

        Subject subject =
                (Subject) Proxy.newProxyInstance(Subject.class.getClassLoader(),
                        new Class[]{Subject.class}, subjectInternal);

        subject.someMethod();

    }
}