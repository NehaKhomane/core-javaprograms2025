package com.sunbeam.program02;

public class StringTokenizer {
    public static void main(String[] args) {
        String str1="https://www.baidu.com/placemnts";
        java.util.StringTokenizer st=new java.util.StringTokenizer(str1,"/.://");
        while(st.hasMoreTokens()){
            String str2=st.nextToken();
            System.out.println(str2);
        }
    }
}
