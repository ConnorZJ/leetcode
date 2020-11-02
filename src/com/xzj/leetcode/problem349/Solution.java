package com.xzj.leetcode.problem349;

import jdk.nashorn.internal.objects.annotations.Setter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for(int i : nums1) {
            set.add(i);
        }
        for(int i : nums2) {
            if(set.contains(i) && !list.contains(i)) {
                list.add(i);
            }
        }
        int[] nums = new int[list.size()];
        for(int i=0; i<list.size();i++) {
            nums[i] = list.get(i);
        }
        return nums;
    }
}