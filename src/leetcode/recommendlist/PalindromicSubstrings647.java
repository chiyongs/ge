package leetcode.recommendlist;

import java.util.*;

public class PalindromicSubstrings647 {
    public int countSubstrings(String s) {
        int sLen = s.length();
        List<String> result = new ArrayList<>();
        for(int i=0;i<sLen;i++) {
            result.addAll(getPalindromes(s, i, i));
            result.addAll(getPalindromes(s, i, i+1));
        }

        return result.size();
    }

    List<String> getPalindromes(String s, int start, int end) {
        List<String> palindromes = new ArrayList<>();
        while(0 <= start && end < s.length() && s.charAt(start) == s.charAt(end)) {
            start--;
            end++;
            palindromes.add(s.substring(start+1, end));
        }
        return palindromes;
    }
}
