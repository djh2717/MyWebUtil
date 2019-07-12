package my.code.repository.study.algorithm.sort;

import java.util.Arrays;

/**
 * @author djh on  2019/5/28 17:34
 * @E-Mail 1544579459@qq.com
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] nums = new int[]{2, 3, 4, 5, 6, 7, 84, 1, 22, 3, 77, 442, 1, 99, 112, 908, 56};
        quickSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    public static void quickSort(int[] nums, int left, int right) {

        if (left > right) {
            return;
        }

        int l = left;
        int r = right;
        // 选取最左边的为基数.
        int base = nums[left];

        while (l != r) {
            // 从右边开始找, 一直找到一个比基数小的数便停下来
            while (r > l && nums[r] >= base) {
                r--;
            }

            // 然后从左边开始找, 一直找到一个比基数大的数便停下来
            while (l < r && nums[l] <= base) {
                l++;
            }

            // 交换这两个变量
            if (l < r) {

                // 使用异或交换两个变量, 需要注意这两个变量不能相等, 不然异或后结果为 0
                nums[l] ^= nums[r];
                nums[r] ^= nums[l];
                nums[l] ^= nums[r];
            }

            // 如果 left 还不等于 right, 说明还未遍历完, 进行下一次循环.
        }


        // 最后把基数和 l 与 r 指针相碰撞的位置的数相互交换.
        // 比较迷的是为什么能确定此时 l 位置的数一定比基数小?
        // 想想上面的循环过程就明白了, 我们每次在进行交换后, 此时 l 所指向的这个数一定小于等于基数,
        // 然后进行下一次循环, 又不断的从右边开始找, 假设右边的数都比基数大, 那么 r 会一直走到和 l 相
        // 碰撞才会停下来, 然后退出循环, 交换基数和 l 所指向的数, 所以此时 l 指向的数必定小于等于基数.
        int temp = nums[left];
        nums[left] = nums[l];
        nums[l] = temp;



        quickSort(nums, left, l - 1);
        quickSort(nums, l + 1, right);
    }
}
