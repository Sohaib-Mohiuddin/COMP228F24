package com.opsdevelop.comp228.week9;

import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) throws ArithmeticException {
        int a = 4/0;
        System.out.println(a);
//        try {
//            System.out.println("Access element three :" + a[3]);
//        } catch (ArrayIndexOutOfBoundsException aioobe) {
//            aioobe.printStackTrace();
//        } catch (Exception e) {
//            System.out.println("Exception thrown  :" + e);
//        } finally {
//            a[0] = 6;
//            System.out.println("First element value: " + a[0]);
//            System.out.println("The finally statement is executed");
//        }

    }
}
