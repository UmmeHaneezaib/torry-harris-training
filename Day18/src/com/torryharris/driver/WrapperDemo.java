package com.torryharris.driver;

public class WrapperDemo {
    public static void main(String[] args) {
        int a = 10;
        Integer iObj=a;
        int b = iObj;
        System.out.println(iObj);

        Integer o1= iObj + 10;


        String str = "12345";
        System.out.println(str+10);
        int number = Integer.parseInt(str);
        System.out.println(number+10);
    }
}
