package org.practice.utility;

import java.util.ArrayList;
import java.util.List;

/**
 * @Desc https://leetcode-cn.com/
 * @Author
 * @Date 2019年7月8日14:41:19
 * @Version 1.0
 */
public class LeetCodeApp {

    public static void main(String[] args) {
        try {
//            int[] nums = new int[]{2, 7, 11, 15};
//            int target = 9;
//            twoSum(nums, target);
//
//            ListNode a = new ListNode(5);
//            a.next = new ListNode(4);
//            a.next.next = new ListNode(3);
//            ListNode b = new ListNode(5);
//            b.next = new ListNode(6);
//            b.next.next = new ListNode(4);
//            ListNode c = addTwoNumbers(a, b);
//
//            lengthOfLongestSubstring("pwwkew");
//
//            int[] nums1 = new int[]{};
//            int[] nums2 = new int[]{2, 4};
//            findMedianSortedArrays(nums1, nums2);
//
//            longestPalindrome("cbbd");

            convert("LEETCODEISHIRING", 4);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * 两数之和
     * https://leetcode-cn.com/problems/two-sum/
     */
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; i < nums.length && i != j; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    /**
     * 两数相加
     * https://leetcode-cn.com/problems/add-two-numbers/
     */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode iterator = head;
        Integer mode = 0;
        while (l1 != null || l2 != null || mode > 0) {
            iterator.next = new ListNode(0);
            Integer sum = mode;
            if (l1 != null && l2 != null) {
                sum += l1.val + l2.val;
                l1 = l1.next;
                l2 = l2.next;
            } else if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            } else if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            mode = sum / 10;
            iterator.next.val = sum % 10;
            iterator = iterator.next;
        }
        head = head.next;
        return head;
    }

    /**
     * 无重复字符的最长子串
     * https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/
     * abcabcbb，返回3
     */
    public static int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
//        List<String> parts = new ArrayList<>();
        int maxLength = 0;
        for (int i = 0; i < chars.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = i; j < chars.length; j++) {
                if (sb.toString().contains(String.valueOf(chars[j]))) {
                    break;
                }
                sb.append(String.valueOf(chars[j]));
            }
            if (sb.toString().length() > maxLength) {
                maxLength = sb.toString().length();
            }
//            parts.add(sb.toString());
        }
        System.out.println(maxLength);
//        System.out.println(parts.size());
        return maxLength;
    }

    /**
     * 寻找两个有序数组的中位数
     * https://leetcode-cn.com/problems/median-of-two-sorted-arrays/
     */
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int[] result = new int[nums1.length + nums2.length];
        //排序
        while (i < nums1.length || j < nums2.length) {
            if (i < nums1.length && j < nums2.length) {
                if (nums1[i] < nums2[j]) {
                    result[i + j] = nums1[i];
                    i++;
                } else if (nums1[i] > nums2[j]) {
                    result[i + j] = nums2[j];
                    j++;
                } else if (nums1[i] == nums2[j]) {
                    result[i + j] = nums1[i];
                    result[i + j + 1] = nums2[j];
                    i++;
                    j++;
                }
            } else if (i < nums1.length) {
                result[i + j] = nums1[i];
                i++;
            } else if (j < nums2.length) {
                result[i + j] = nums2[j];
                j++;
            }
        }
        double mid = 0;
        if (result.length <= 0) {
            return mid;
        }
        if (result.length % 2 == 0) {
            int midIndex = result.length / 2;
            mid = (result[midIndex - 1] + result[midIndex]) / 2.0;
        } else {
            int midIndex = result.length / 2;
            mid = result[midIndex];
        }
        return mid;
    }

    /**
     * 最长回文子串
     * https://leetcode-cn.com/problems/longest-palindromic-substring/
     */
    public static String longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        List<String> huiwen = new ArrayList<>();
        String longest = "";
        if (s.length() > 0) {
            longest = s.substring(0, 1);
        }
        for (int i = 0; i < chars.length; i++) {
            for (int j = chars.length - 1; j > i; j--) {
                if (chars[i] == chars[j]) {
                    boolean isHuiwen = isPalindrome(chars, i, j);
                    if (isHuiwen && longest.length() < j - i + 1) {
                        longest = s.substring(i, j + 1);
                        huiwen.add(s.substring(i, j + 1));
                    }
                }
            }
        }
        System.out.println(huiwen.size());
        return longest;
    }

    private static boolean isPalindrome(char[] chars, int i, int j) {
        for (; i <= j; i++, j--) {
            if (chars[i] != chars[j]) {
                return false;
            }
        }
        return true;
    }

    /**
     * Z 字形变换
     * https://leetcode-cn.com/problems/zigzag-conversion/
     */
    public static String convert(String s, int numRows) {
        if (s.length() <= 2 || numRows <= 1) {
            return s;
        }
        int increment = 2 * (numRows - 1);//10
        List<StringBuilder> sbList = new ArrayList<>(numRows);
        String result = "";
        for (int i = 0; i < numRows; i++) {
            int multi = 0;
            StringBuilder sb = new StringBuilder();
            while (true) {
                int index1 = i + multi * increment;
                if (index1 >= s.length()) {
                    break;
                }
                String s1 = s.substring(index1, index1 + 1);
                sb.append(s1);
                if (i > 0 && i < numRows - 1) {
                    int index2 = increment - i + multi * increment;
                    if (index2 >= s.length()) {
                        break;
                    }
                    String s2 = s.substring(index2, index2 + 1);
                    sb.append(s2);
                }
                multi++;
            }
            result += sb.toString();
            sbList.add(sb);
        }
        return result;
    }
}

/**
 * Definition for singly-linked list.
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 */
class ListNode {
    int val;

    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
