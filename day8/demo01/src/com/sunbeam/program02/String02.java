package com.sunbeam.program02;
//----------String buffer anf string builder----//
public class String02 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = new String("abc");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

         StringBuffer str3 = new StringBuffer("abc");
         StringBuffer str4 = new StringBuffer("abc");
         System.out.println(str3 == str4);
         System.out.println(str3.equals(str4));


         StringBuilder str5 = new StringBuilder("abc");
         StringBuilder str6 = new StringBuilder("abc");
         System.out.println(str5 == str6);
         System.out.println(str5.equals(str6));
    }
}
