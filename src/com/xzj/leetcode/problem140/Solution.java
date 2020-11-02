package com.xzj.leetcode.problem140;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public static List<String> wordBreak(String s, List<String> wordDict) {
        List<String> list = new ArrayList<>();
        for(int i=1;i<s.length();i++) {
            Set<Integer> indexSet = new HashSet<>();
            StringBuilder sb = new StringBuilder();
            int index = wordDict.indexOf(s.substring(0,i));
            if( index == -1) {
                continue;
            }
            indexSet.add(index);
            sb.append(s.substring(0,i));
            int sIndex = i, eIndex = i+1;
            while(sIndex < s.length()) {
                sIndex+=1;
                int si = wordDict.indexOf(s.substring(sIndex,eIndex));
                if(si > -1) {
                    indexSet.add(si);
                    sb.append(" ").append(s.substring(sIndex,eIndex));
                    sIndex = eIndex;
                } else {
                    eIndex+=1;
                }
            }
            if(indexSet.size() == wordDict.size()) {
                list.add(sb.toString());
            }
        }
        return list;
    }

}