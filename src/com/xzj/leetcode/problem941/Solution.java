package com.xzj.leetcode.problem941;

class Solution {
    public boolean validMountainArray(int[] A) {
        if(A == null || A.length < 3) {
            return false;
        }
        int startIndex = 0;
        int endIndex = A.length-1;
        while(startIndex < A.length-1 && A[startIndex] < A[startIndex +1]) {
        	startIndex += 1;
        }
        while(endIndex > 1 && A[endIndex] < A[endIndex -1]) {
        	endIndex -= 1;
        }
        return startIndex != 0 && endIndex !=A.length-1 && startIndex == endIndex;
    }
}