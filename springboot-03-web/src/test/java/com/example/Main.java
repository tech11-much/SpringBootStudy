package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        boolean has = false;
        if (s.charAt(0) >= 'a' && s.charAt(0) <= 'z'){
            sb.append(s.charAt(0));
            has = true;
        }
        if (s.charAt(0) >= 'A' && s.charAt(0) <= 'Z'){
            char a = (char) (s.charAt(0) + 32);
            sb.append(a);
            has = true;
        }
        if (s.charAt(0) >= '0' && s.charAt(0) <= '9'){
            sb.append(s.charAt(0));
            has = true;
        }

        for (int i = 1; i < n; i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                sb.append(s.charAt(i));
            }else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                if ((s.charAt(i - 1) >= 'A' && s.charAt(i - 1) <= 'Z') || (s.charAt(i - 1) >= 'a' && s.charAt(i - 1) <= 'z') || (s.charAt(i - 1) >= '0' && s.charAt(i - 1) <= '9')){
                    sb.append(s.charAt(i));
                    has = true;
                }else{
                    if(!has){
                        sb.append(s.charAt(i));
                        has = true;
                    }else{
                        char b = (char) (s.charAt(i) - 32);
                        sb.append(b);
                        has = true;
                    }

                }
            }else if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                if ((s.charAt(i - 1) >= 'A' && s.charAt(i - 1) <= 'Z') || (s.charAt(i - 1) >= 'a' && s.charAt(i - 1) <= 'z') || (s.charAt(i - 1) >= '0' && s.charAt(i - 1) <= '9')){
                    sb.append((char)(s.charAt(i) + 32));
                }else{
                    if(!has){
                        sb.append((char)(s.charAt(i) + 32));
                    }else {
                        sb.append(s.charAt(i));
                        has = true;
                    }

                }
            }else {

            }
        }
        System.out.println(sb.toString());
    }
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String s1 = in.nextLine();
    in.nextLine();
    String s2 = in.nextLine();
    int i = 0;
    int n1 = s1.length();
    int n2 = s2.length();
    for (int k = 0; k < n2; k++) {
        if(s2.charAt(k) == s1.charAt(i)){
            i++;
        }else {
            if(s1.charAt(i) == '?'){
                i++;
            }else if(s1.charAt(i) == '#'){
                if()
            }
        }
    }
}
}
