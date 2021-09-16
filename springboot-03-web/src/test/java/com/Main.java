package com;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if(a < c && b < c){
            if(a <= 0 && b <= 0){
                System.out.println(-1);
            }else{
                int num = 0;
                while (Math.max(a, b) < c){
                    int x = a + b;
                    if(a <= b){
                        a = x;
                    }else{
                        b = x;
                    }
                    num++;
                }
                System.out.println(num);
            }
        }else{
            System.out.println(1);
        }
    }
}