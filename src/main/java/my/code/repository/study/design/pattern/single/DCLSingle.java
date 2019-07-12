package my.code.repository.study.design.pattern.single;

/**
 * @author djh on  2018/11/26 22:10
 * @E-Mail 1544579459@qq.com
 */
public class DCLSingle {
    private static DCLSingle sDCLSingle;

    private DCLSingle() {
    }

    public static DCLSingle getInstance() {
        if (sDCLSingle == null) {
            synchronized (DCLSingle.class) {
                if (sDCLSingle == null) {
                    sDCLSingle = new DCLSingle();
                }
            }
        }
        return sDCLSingle;
    }
}
