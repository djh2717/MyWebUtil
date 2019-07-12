package my.code.repository.study.algorithm.sort;

import java.util.Arrays;

/**
 * @author djh on  2019/7/1 21:32
 * @E-Mail 1544579459@qq.com
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 3, 4, 5, -5, 6, 7, 84, 1, 22, 3, 77, 442, 1, 99, 112, 0, 908, 56};
        shellSort(nums);
        System.out.println(Arrays.toString(nums));
    }


    private static void shellSort(int[] nums) {
        int length = nums.length;
        for (int gap = length / 2; gap >= 1; gap /= 2) {
            for (int i = 0; i < length; i++) {
                int j = i;
                while (j + gap < length) {
                    if (nums[j] > nums[j + gap]) {
                        int temp = nums[j];
                        nums[j] = nums[j + gap];
                        nums[j + gap] = temp;
                    }
                    j += gap;
                }
            }
        }
    }
}