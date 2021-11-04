package com.company;

public class Main {

    public static void main(String[] args) {
        FacadePhone facadePhone = new FacadePhone();

        System.out.println("=====Samsung=====");
        System.out.println(facadePhone.buildAndroidPhone());

        System.out.println("=====IPhone=====");
        System.out.println(facadePhone.buildApplePhone());

        System.out.println("=====Huawei=====");
        System.out.println(facadePhone.buildMicrosoftPhone());

    }
}
