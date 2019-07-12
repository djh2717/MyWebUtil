package my.code.repository.study.design.pattern.observe.java;

import java.util.ArrayList;
import java.util.List;

/**
 * Observe pattern: key word "observe".
 * <p>
 * Observe design mode, when one object or date is be dependent on more than one object,
 * when the be dependent object or data is change, we can use this design mode to update
 * all object who is dependent on the data or object.
 *
 * @author Djh on 2018/7/27 15:14
 * E-Mail ：1544579459@qq.com
 */
public class UseDemo {

    public static class DataSet {
        public List<Integer> integerList;

        DataSet() {
            integerList = new ArrayList<>();
        }

        void updateData() {
            for (int i = 0; i < 5; i++) {
                integerList.add(i);
            }
        }
    }

    public static void main(String[] args) {
        SubjectImpl subject = new SubjectImpl();

        DataSet dataSet = new DataSet();

        ObserveImpl observe1 = new ObserveImpl(dataSet, "观察者1");
        ObserveImpl observe2 = new ObserveImpl(dataSet, "观察者2");

        subject.register(observe1);
        subject.register(observe2);

        dataSet.updateData();

        subject.notifyChange();
    }


}
