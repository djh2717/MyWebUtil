package my.code.repository.study.algorithm.sort;

import java.util.Arrays;

/**
 * @author djh on  2019/7/1 16:41
 * @E-Mail 1544579459@qq.com
 */
public class InsertSort {

    public static void main(String[] args) {
        int[] nums = {51, 46, 20, 18, 65, 0, 97, 82, 30, 77, 50, 909, 66, 66, 66, 77, 88, 33, 44, 12, 34, 43, 34};
        insertSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void insertSort(int[] nums) {
        int length = nums.length;
        for (int i = 1; i < length; i++) {
            for (int j = i; j > 0; j--) {
                if (nums[j] < nums[j - 1]) {
                    int temp = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = temp;
                } else {
                    break;
                }
            }
        }
    }
}
