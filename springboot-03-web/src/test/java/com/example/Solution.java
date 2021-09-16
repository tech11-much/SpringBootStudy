package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        char a = 'a';
        char b = (char) (a - 32);
        System.out.println(b);
    }
    private int num = 0;
    public int bestFit(int V, int[] item) {
        // write code here
        num = V;
        dfs(item, 0, V);
        return num;
    }
    public void dfs(int[] item, int index, int left){
        if(index == item.length){
            num = Math.min(num, left);
        }
        dfs(item, index + 1, left);
        if(item[index] <= left){
            dfs(item, index + 1, left - item[index]);
        }
    }
    long ans = 0;
    public long GetNumOfExpress(String express, boolean desired) {
        // write code here
        int length = express.length();
        int num = (length - 1) / 2;
        dfs(num, 0, new StringBuilder(express), desired);
        return ans;
    }
    public void dfs(int num, int index, StringBuilder sb, boolean desired){
        if(index == num){
            boolean result = false;
            if(sb.charAt(0) - '0' == 0){
                result = false;
            }else{
                result = true;
            }
            if(result == desired){
                ans++;
            }
            return;
        }
        int length = sb.length();
        int n = (length - 1) / 2;
        for (int i = 0; i < n; i++) {
            int cur = 0;
            StringBuilder sss = new StringBuilder();
            while (cur < 2 * i){
                sss.append(sb.charAt(cur));
                cur++;
            }
            int num1 = sb.charAt(2 * i) - '0';
            int num2 = sb.charAt(2 * i + 2) - '0';
            if(sb.charAt(2 * i + 1) == '&'){
                int num3 = num1 & num2;
                sss.append(num3);
            }else if(sb.charAt(2 * i + 1) == '|'){
                sss.append(num1 | num2);
            }else{
                sss.append(num1 ^ num2);
            }
            cur = 2 * i + 3;
            while (cur < length){
                sss.append(sb.charAt(cur));
                cur++;
            }
            dfs(num, index + 1, sss, desired);
        }
    }
    public String[] permutation(String s) {
        // write code here
        int n = s.length();
        boolean[] used = new boolean[n];
        List<String> list = new ArrayList<String>();
        dfs(s, used, list, new StringBuilder(), 0);
        int num = list.size();
        String[] ss = new String[num];
        for (int i = 0; i < num; i++) {
            ss[i] = list.get(i);
        }
        return ss;
    }
    public void dfs(String s, boolean[] used, List<String> list, StringBuilder sb, int num){
        if(num == s.length()){
            list.add(new String(sb));
        }
        for (int i = 0; i < s.length(); i++) {
            if (!used[i]){
                used[i] = true;
                sb.append(s.charAt(i));
                dfs(s, used, list, sb, num + 1);
                sb.deleteCharAt(sb.length() - 1);
                used[i] = false;
            }
        }
    }
}
