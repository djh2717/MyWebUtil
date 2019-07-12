package my.code.repository.study.algorithm.sort;


import java.util.Arrays;

/**
 * @author djh on  2019/5/29 18:55
 * @E-Mail 1544579459@qq.com
 */
public class HeapSort {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 22, 33, 11, 234, 66, 3, 4, 6, 7, 5, 77, 89, 345, 123, 45, 342};
        heapSort(nums);
        System.out.println(Arrays.toString(nums));


    }

    private static void heapSort(int[] nums) {
        // 先自底向上构建一个大根堆
        buildMaxRootHeap(nums, nums.length - 1);


        int length = nums.length - 1;
        for (int i = length; i >= 0; ) {
            // 交换最后一个元素和第一个元素
            int temp = nums[0];
            nums[0] = nums[i];
            nums[i] = temp;
            // 让 i-- 从而禁止访问到最后一个元素.
            i--;
            // 自顶向下构建大根堆
            maxHeap(nums, i, 0);
        }
    }

    /**
     * @param nums   Build a large heap of elements
     * @param length The length of the array that can be accessed
     */
    private static void buildMaxRootHeap(int[] nums, int length) {
        // 获取最后一个叶子节点的父节点的索引, 然后从这个父节点开始自底向上构建大根堆.
        int parentIndex = parentIndex(nums.length - 1);

        // 自底向上构建大根堆.
        for (int i = parentIndex; i >= 0; i--) {
            maxHeap(nums, length, i);
        }
    }

    /**
     * @param nums   Build a large heap of elements
     * @param length Ability to access array length
     * @param index  Build a large root heap from this index
     */
    private static void maxHeap(int[] nums, int length, int index) {
        int leftChildIndex = leftChildIndex(index);
        int rightChildIndex = rightChildIndex(index);
        int currentPoint = index;

        if (leftChildIndex <= length && nums[leftChildIndex] > nums[currentPoint]) {
            currentPoint = leftChildIndex;
        }

        if (rightChildIndex <= length && nums[rightChildIndex] > nums[currentPoint]) {
            currentPoint = rightChildIndex;
        }

        if (currentPoint != index) {
            int temp = nums[index];
            nums[index] = nums[currentPoint];
            nums[currentPoint] = temp;
        } else {
            return;
        }

        // 递归构建大根堆主要用在 自顶向下 构建大根堆上.
        maxHeap(nums, length, currentPoint);
    }

    private static int parentIndex(int childIndex) {
        return (childIndex - 1) / 2;
    }

    private static int leftChildIndex(int parentIndex) {
        return parentIndex * 2 + 1;
    }

    private static int rightChildIndex(int parentIndex) {
        return parentIndex * 2 + 2;
    }
}