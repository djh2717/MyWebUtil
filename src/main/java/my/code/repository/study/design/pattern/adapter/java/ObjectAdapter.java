package my.code.repository.study.design.pattern.adapter.java;

/**
 * @author djh on  2018/8/10 00:00
 * @E-Mail 1544579459@qq.com
 */
public class ObjectAdapter implements Dst {
    private Src mSrc;

    ObjectAdapter(Src src) {
        mSrc = src;
    }


    @Override
    public int mobileCharge() {
        if (mSrc != null) {
            System.out.println("适配器开始适配电压!");
            int adapterVoltage = mSrc.originalVoltage() / 44;
            System.out.println("适配后的电压:" + adapterVoltage);
            return adapterVoltage;
        }
        return 0;
    }
}
