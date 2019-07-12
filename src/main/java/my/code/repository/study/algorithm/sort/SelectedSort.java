package my.code.repository.study.algorithm.sort;

import java.util.Random;

/**
 * @author djh on  2018/9/23 15:39
 * @E-Mail 1544579459@qq.com
 */
@SuppressWarnings("unchecked")
public class SelectedSort {

    private static <T extends Comparable<T>> boolean isLess(T a, T b) {
        return a.compareTo(b) < 0;
    }

    private static void exchange(Comparable[] a, int i, int j) {
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private static void show(Comparable[] a) {
        for (Comparable comparable : a) {
            System.out.print(comparable + " ");
        }
    }

    private static boolean isSortedSuccess(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            if (isLess(a[i], a[i - 1])) {
                return false;
            }
        }
        return true;
    }

    private static void sort(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            int min = i;
            // Compare.
            for (int j = i + 1; j < a.length; j++) {
                if (isLess(a[j], a[min])) {
                    min = j;
                }
            }
            // Change the min.
            exchange(a, i, min);
        }
    }


    public static void main(String[] args) {
        Integer[] ints = new Integer[20];
        for (int i = 0; i < 20; i++) {
            ints[i] = new Random().nextInt();
        }
        sort(ints);
        assert isSortedSuccess(ints);
        show(ints);
    }

}
