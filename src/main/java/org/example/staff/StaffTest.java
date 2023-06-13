package org.example.staff;

import java.util.Random;

public class StaffTest {
    public static void main(String[] args) {
        Random random = new Random();
        HourlyStaff hs = new HourlyStaff(random.nextInt(4, 10));
        MonthlyStaff ms = new MonthlyStaff(15, 9400);
        WeeklyStaff ws = new WeeklyStaff(2, 15, 9400);


        System.out.println(hs.calculateSalary(6));
        System.out.println(ms.calculateSalary(11111));
    }
}
