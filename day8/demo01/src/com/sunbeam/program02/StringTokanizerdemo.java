package com.sunbeam.program02;

import java.util.StringTokenizer;

public class StringTokanizerdemo {
    public static void main(String[] args) {
        String str1="www.google.com/about";
        StringTokenizer st=new StringTokenizer(str1,"/.",true);
        while(st.hasMoreTokens()){
            String str2=st.nextToken();
            System.out.println(str2);
        }
    }
}
