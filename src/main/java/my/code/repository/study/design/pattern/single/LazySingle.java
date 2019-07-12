package my.code.repository.study.design.pattern.single;

/**
 * @author djh on  2018/11/26 22:08
 * @E-Mail 1544579459@qq.com
 */
public class LazySingle {
    private static LazySingle sLazySingle;

    private LazySingle() {
    }

    public synchronized static LazySingle getInstance() {
        if (sLazySingle == null) {
            sLazySingle = new LazySingle();
        }
        return sLazySingle;
    }

}
