package my.code.repository.study.design.pattern.proxy.java.dynamic;

/**
 * @author djh on  2019/3/18 14:18
 * @E-Mail 1544579459@qq.com
 */
public class RealImp implements Subject {

    @Override
    public void someMethod() {
        System.out.println("我是委托类,即真正的业务实现类");
    }
}
