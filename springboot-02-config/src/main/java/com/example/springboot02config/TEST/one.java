package com.example.springboot02config.TEST;

import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int weight = in.nextInt();
        in.nextLine();
        String[] s1 = in.nextLine().split(",");
        String[] s2 = in.nextLine().split(",");
        int n = s1.length;
        int[][] dp = new int[weight + 1][n + 1];
        for (int i = 0; i <= weight; i++) {
            dp[i][0] = 0;
        }
        for (int i = 0; i <= n; i++) {
            dp[0][i] = 0;
        }
        int max = 0;
        for (int i = 1; i <= weight; i++) {
            for (int j = 1; j <= n; j++) {
                if(Integer.parseInt(s1[j - 1]) <= i){
                    dp[i][j] = Math.max(dp[i - Integer.parseInt(s1[j - 1])][j - 1] + Integer.parseInt(s2[j - 1]), dp[i][j - 1]);
                }else {
                    dp[i][j] = dp[i][j - 1];
                }
                max = Math.max(max, dp[i][j]);
            }
        }
        System.out.println(max);
    }
}