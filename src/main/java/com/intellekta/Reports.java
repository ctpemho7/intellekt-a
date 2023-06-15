package com.intellekta;

import java.lang.annotation.*;


public class Reports {

    // применима к методам
    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.RUNTIME)
    @interface RepeatToRelease {
        ToRelease[] value();
    }

    @Target({ElementType.METHOD})
    @Retention(RetentionPolicy.RUNTIME)
    @Repeatable(RepeatToRelease.class)
    @interface ToRelease {
        String customerName();

        String version();
    }

    private static void DoReport(){
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        // 0 - это сам метод getStackTrace();
        // 1 - это вызываемый метод (DoReport);
        // 2 - это вызывающий (родительский) метод (Reports1).
        StackTraceElement stackTraceElement = stackTrace[2];
        System.out.println(stackTraceElement.getMethodName()); // Reports1
    }

    public static void Reports1() {
        DoReport();
    }

    @ToRelease(customerName = "Div_2", version = "4")
    public static void Reports2() {
        DoReport();
    }

    public static void Reports3() {
        DoReport();
    }

    @ToRelease(customerName = "Div_2", version = "4")
    public static void Reports4() {
        DoReport();
    }

    @ToRelease(customerName = "Div_5", version = "5")
    public static void Reports5() {
        DoReport();
    }

    @ToRelease(customerName = "Div_2", version = "4")
    public static void Reports6() {
        DoReport();
    }

    public static void Reports7() {
        DoReport();
    }

    @ToRelease(customerName = "Div_2", version = "4")
    public static void Reports8() {
        DoReport();
    }

    public static void Reports9() {
        DoReport();
    }

    @ToRelease(customerName = "Div_2", version = "4")
    @ToRelease(customerName = "Div_5", version = "5")
    public static void Reports10() {
        DoReport();
    }

    public static void main(String[] args) {
        Reports1(); Reports2(); Reports3(); Reports4(); Reports5();
        Reports6(); Reports7(); Reports8(); Reports9(); Reports10();
    }
}
