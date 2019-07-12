package my.code.repository.study.design.pattern.proxy.java.nodynamic;

/**
 * Proxy pattern: key word "proxy".
 * <p>
 * This patter use to when the sub class implement the base operate, but it do not
 * implement the detail, so we can use the proxy implement the same base operate, and
 * also implement the detail.
 *
 * @author djh on  2018/9/7 13:43
 * @E-Mail 1544579459@qq.com
 */
public class UseDemo {
    public static void main(String[] args) {
        RealImp realImp = new RealImp();
        ProxyMen proxyMen = new ProxyMen(realImp);
        // Use the proxy men to visit the realImp someMethod.
        proxyMen.someMethod();
    }
}
