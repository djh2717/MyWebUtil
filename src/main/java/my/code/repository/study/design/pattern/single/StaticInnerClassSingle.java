package my.code.repository.study.design.pattern.single;

/**
 * @author djh on  2018/11/26 22:13
 * @E-Mail 1544579459@qq.com
 */
public class StaticInnerClassSingle {

    private StaticInnerClassSingle() {
    }

    public static StaticInnerClassSingle getInstance() {
        return InnerClass.STATIC_INNER_CLASS_SINGLE;
    }

    private static class InnerClass {
        private static final StaticInnerClassSingle STATIC_INNER_CLASS_SINGLE
                = new StaticInnerClassSingle();
    }

}
