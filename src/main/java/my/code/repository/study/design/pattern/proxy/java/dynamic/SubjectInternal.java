package my.code.repository.study.design.pattern.proxy.java.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author djh on  2019/3/18 14:17
 * @E-Mail 1544579459@qq.com
 */
public class SubjectInternal implements InvocationHandler {

    private RealImp mRealImp;

    SubjectInternal(RealImp realImp) {
        mRealImp = realImp;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("Before");
        Object object = method.invoke(mRealImp, args);
        System.out.println("After");
        return object;
    }
}
