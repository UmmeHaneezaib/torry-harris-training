package com.torryharris.driver;

public class StringDemo {
    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 =new String("abcdef");
        System.out.println(s1+" "+s2);
        String s3 = s1.concat("han");
        System.out.println(s3 + " "+s3.hashCode());
        s3 = s1.replace('a','x');
        System.out.println(s1 + " "+s1.hashCode());
        System.out.println(s2 + " "+s2.hashCode());
        System.out.println(s3 + " "+s3.hashCode());


    }

}
