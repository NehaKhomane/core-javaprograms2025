package com.sunbeam.program02;

import java.util.StringTokenizer;

//-----String tokanizer example-----//
public class String03 {
    public static void main(String[] args) {
       String str1="www.google.com";
        StringTokenizer st=new StringTokenizer(str1,".");
        while(st.hasMoreTokens()){
            String str2=st.nextToken();
            System.out.println(str2);
        }
    }
}
