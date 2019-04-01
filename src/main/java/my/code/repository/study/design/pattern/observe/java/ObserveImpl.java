package my.code.repository.study.design.pattern.observe.java;

/**
 * @author Djh on 2018/7/27 14:50
 * E-Mail ：1544579459@qq.com
 */
public class ObserveImpl implements Observe {
    private UseDemo.DataSet mDataSet;
    private String mObserveName;

    ObserveImpl(UseDemo.DataSet dataSet, String observeName) {
        mObserveName = observeName;
        mDataSet = dataSet;
    }

    @Override
    public void update() {
        System.out.print(mObserveName + "更新了数据: ");
        for (Integer integer : mDataSet.integerList) {
            System.out.print(integer + " ");
        }
        System.out.println(" ");
    }
}
