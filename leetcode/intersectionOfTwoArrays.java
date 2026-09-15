package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class intersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = { 2, 3, 1, 5 };
        int[] nums2 = { 4, 6, 7, 5 };

        System.out.println(Arrays.toString(intersection(nums1, nums2))); // this will print the proper result(array)
        // System.out.println(intersection(nums1, nums2)); // this will print the array Objects reference "[I@5acf9800"
    }

    public static int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set = new HashSet<>();

        for (int num : nums1) {
            set.add(num);
        }

        Set<Integer> result = new HashSet<>();

        for (int num : nums2) {
            if (set.contains(num)) {
                result.add(num);
            }
        }

        int[] answer = new int[result.size()];
        int i = 0;

        for (int num : result) {
            answer[i] = num;
            i++;
        }
        return answer;
    }
}
