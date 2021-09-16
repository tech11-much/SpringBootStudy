package com.example.demo;// 本题为考试单行多行输入输出规范示例，无需提交，不计分。
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n > 0){
            long x = in.nextLong();
            long l = 0;
            long r = 250000000;
            long a = 0;
            while (l < r){
                long mid = (l + r) / 2;
                if((mid + 1) * mid * 2 < x){
                    l = mid + 1;
                }else{
                    r = mid;
                }
            }
            if((l + 1) * l * 2 > x){
                l--;
            }
            long b = l * l;
            long c = x - (l + 1) * l * 2;
            if(c < 3){
                System.out.println(l * l);
            }else{
                if((c - 1) / 2 <= l){
                    long num = l * l + (c - 1) / 2;
                    System.out.println(num);
                }else{
                    long num1 = l * l + (c - 2) / 2;
                    System.out.println(num1);
                }
            }
            n--;
        }
    }
}