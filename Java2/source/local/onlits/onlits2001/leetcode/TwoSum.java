package local.onlits.onlits2001.leetcode;

import java.util.ArrayList;
import java.util.List;

public class TwoSum {
    List<Integer> twoSum(ArrayList<Integer> nums, int target) {
        var result = new ArrayList<Integer>();
        // outer: for (int i = 0; i < nums.size() - 1; i++) {
            for (int j = 0; j < nums.size()-1; j++) {
                if (nums.get(j) + nums.get(j+1) == target) {
                    result.add(j);
                    result.add(j+1);
                    break;
                }
            }
        // }
        return result;
    }

    public static void main(String[] args) {
        // test case 1
        var testCase1 = new ArrayList<Integer>();
        testCase1.add(2);
        testCase1.add(7);
        testCase1.add(11);
        testCase1.add(15);
        int target1 = 9;
        var result = new TwoSum().twoSum(testCase1, target1);
        for (Integer i : result) {
            System.out.println(i);
        }

        System.out.println("------------------");

        // test case 2
        var testCase2 = new ArrayList<Integer>();
        testCase2.add(3);
        testCase2.add(2);
        testCase2.add(4);
        int target2 = 6;
        result = new TwoSum().twoSum(testCase2, target2);
        for (Integer i : result) {
            System.out.println(i);
        }

        System.out.println("------------------");

        // test case 3
        var testCase3 = new ArrayList<Integer>();
        testCase3.add(3);
        testCase3.add(3);
        int target3 = 6;
        result = new TwoSum().twoSum(testCase3, target3);
        for (Integer i : result) {
            System.out.println(i);
        }
    }
}
