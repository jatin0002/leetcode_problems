package org.jatin.arrays;


public class KthLargestElement {
    // 3, 2, 1, 5, 6, 4
    // p  i           j
    // 3, 4, 1, 5, 6, 2
    // p     i     j
    // 3, 4, 6, 5, 1, 2
    // p        ij
    // 5, 4, 6, 3, 1, 2
    public static int partitionAlgo(int[] arr, int L, int R) {
        int i = L + 1;
        int j = R;
        int p = arr[L];

        while (i <= j) {
            if (arr[i] <= p && arr[j] > p) {
                swap(arr, i, j);
                i++;
                j--;
            }

            if (arr[i] >= p) {
                i++;
            }

            if (arr[j] <= p) {
                j--;
            }
        }
        swap(arr, L, j);

        return j;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 1, 5, 6, 4};
        int k = 2;

        System.out.println(findKthLargest(arr, k));
    }

//    public static int findKthLargest(int[] arr, int k) {
//        int n = arr.length; // 6
//        int L = 0;
//        int R = n - 1; // 5
//
//        int pivot_idx;
//
//        // kth largest pivot element -> nums[k-1] (when desc. order mai partition karege)
//        while (true) {
//            pivot_idx = partitionAlgo(arr, L, R);
//
//            if (pivot_idx == k - 1) {
//                break;
//            } else if (pivot_idx > k - 1) {
//                R = pivot_idx - 1;
//            } else if (pivot_idx < k - 1) {
//                L = pivot_idx + 1;
//            }
//        }
//
//        return arr[pivot_idx];
//    }

    public static int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        int L = 0;
        int R = n - 1;

        int pivotIdx;
        while (true) {
            pivotIdx = getPivot(nums, L, R);

            if (pivotIdx == k - 1) {
                break;
            } else if (pivotIdx > k - 1) {
                R = pivotIdx - 1;
            } else if (pivotIdx < k - 1) {
                L = pivotIdx + 1;
            }
        }

        return nums[pivotIdx];
    }

    public static int getPivot(int[] arr, int L, int R) {
        int i = L + 1;
        int j = R;
        int p = arr[L];

        while (i <= j) {
            if (arr[i] <= p && arr[j] > p) {
                swap(arr, i, j);
                i++;
                j--;
            }

            if (arr[i] >= p) {
                i++;
            }
            if (arr[j] <= p) {
                j--;
            }
        }
        swap(arr, L, j);
        return j;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
