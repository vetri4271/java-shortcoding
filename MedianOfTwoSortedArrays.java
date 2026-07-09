/*Question: Median of Two Sorted Arrays

Given two sorted arrays nums1 and nums2 of sizes m and n respectively, return the median of the two sorted arrays.

The overall runtime complexity should be O(log(m + n)).

Example 1

Input:

nums1 = [1,3]
nums2 = [2]

Output:

2.00000

Explanation:
Merged array = [1,2,3]
Median = 2

Example 2

Input:

nums1 = [1,2]
nums2 = [3,4]

Output:

2.50000

Explanation:
Merged array = [1,2,3,4]
Median = (2 + 3) / 2 = 2.5*/
public class MedianOfTwoSortedArrays {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int m = nums1.length;
        int n = nums2.length;

        int[] merged = new int[m + n];

        int i = 0, j = 0, k = 0;

   
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }


        while (i < m) {
            merged[k++] = nums1[i++];
        }

        while (j < n) {
            merged[k++] = nums2[j++];
        }

        int total = m + n;


        if (total % 2 == 1) {
            return merged[total / 2];
        }


        return (merged[total / 2] + merged[total / 2 - 1]) / 2.0;
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 3};
        int[] nums2 = {2};

        System.out.println(findMedianSortedArrays(nums1, nums2)); // 2.0

        int[] nums3 = {1, 2};
        int[] nums4 = {3, 4};

        System.out.println(findMedianSortedArrays(nums3, nums4)); // 2.5
    }
}