package my.code.repository.study.design.pattern.proxy.java.nodynamic;

/**
 * @author djh on  2018/9/7 13:44
 * @E-Mail 1544579459@qq.com
 */
public class ProxyMen implements Subject {

    private RealImp mRealImp;

    ProxyMen(RealImp realImp) {
        mRealImp = realImp;
    }

    @Override
    public void someMethod() {
        mRealImp.someMethod();
    }
}
