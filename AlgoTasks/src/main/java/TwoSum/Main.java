package TwoSum;

import java.util.Arrays;

public class Main {


    // как сделать сложность не равную О(n^2)? C помощью двух указателей
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && (i != j)) {
                    int[] newArr = new int[2];
                    newArr[0] = i;
                    newArr[1] = j;
                    return newArr;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] array = {3, 2, 4};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(array, target)));
    }
}
