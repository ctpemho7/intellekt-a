package org.example.solved;

public class SmallTasks {
    public static void compareStrings(){
        final String HELLO = "Hello";
        String hello1 = HELLO;
        String hello2 = "Hello";
        String hello3 = "Hell"+"o";
        String hello4 = "Hell";
        hello4+="o";

        System.out.println(hello1.equals(HELLO));
        System.out.println(hello2.equals(HELLO));
        System.out.println(hello3.equals(HELLO));
        System.out.println(hello4.equals(HELLO));
    }

//    public static void maxAboveAverage(int[] data) {
//        if (data.length > 0) {
//            int max = data[0], sum = 0, average;
//            for (int i = 0; i < data.length; i++) {
//                if (data[i] >= max)
//                    max = data[i];
//                sum += data[i];
//            }
//            average = sum / data.length;
////            System.out.println(max / average);
//            System.out.println(average == 0? 0 : max / average);
//        } else
//            System.out.println("Data Error");
//
//    }


}
