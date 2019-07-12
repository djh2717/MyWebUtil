package my.code.repository.study.design.pattern.proxy.java.nodynamic;

/**
 * @author djh on  2018/9/7 13:43
 * @E-Mail 1544579459@qq.com
 */
public class RealImp implements Subject {
    @Override
    public void someMethod() {
        System.out.println("我是实际实现类,即被代理类,这是业务方法!");
    }
}
