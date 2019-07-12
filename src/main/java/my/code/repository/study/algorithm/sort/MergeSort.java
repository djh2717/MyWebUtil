package my.code.repository.study.algorithm.sort;

import java.util.Arrays;

/**
 * @author djh on  2019/5/29 11:17
 * @E-Mail 1544579459@qq.com
 */
@SuppressWarnings("ManualArrayCopy")
public class MergeSort {

    public static void main(String[] args) {
        int[] nums = {51, 46, 20, 18, 65, 97, 82, 30, 77, 50, 909, 66, 66, 66, 77, 88, 33, 44, 12, 34, 43, 34};
        mergeSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    private static void merge(int[] nums, int low, int middle, int high) {

        // 临时数组
        int[] tempNums = new int[high - low + 1];

        int l = low;
        int h = middle + 1;
        int i = 0;

        // 把左右两部分有序的合并到临时数组中
        while (l <= middle && h <= high) {
            if (nums[l] <= nums[h]) {
                tempNums[i] = nums[l];
                l++;
            } else {
                tempNums[i] = nums[h];
                h++;
            }
            i++;
        }

        // 合并左部剩余的元素
        while (l <= middle) {
            tempNums[i] = nums[l];
            l++;
            i++;
        }

        // 合并右部剩余的元素
        while (h <= high) {
            tempNums[i] = nums[h];
            h++;
            i++;
        }

        // 把合并后的有序元素重新复制到原数组中
        for (int j = 0; j < tempNums.length; j++) {
            nums[low + j] = tempNums[j];
        }
    }

    private static void mergeSort(int[] nums, int low, int high) {
        int middle = (low + high) / 2;
        if (low < high) {
            // 对左部递归拆分
            mergeSort(nums, low, middle);

            // 对右部递归拆分
            mergeSort(nums, middle + 1, high);

            // 合并两个较小的数组
            merge(nums, low, middle, high);
        }
    }
}