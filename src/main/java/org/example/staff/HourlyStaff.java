package org.example.staff;

public class HourlyStaff implements Staff {
    private static int workTime;

    public int getWorkTime() {
        return workTime;
    }


    public HourlyStaff(int workTime) {
        if (workTime < 4 | workTime > 10) {
            this.workTime = 0;
        } else {
            this.workTime = workTime;
        }
    }

    @Override
    public int calculateSalary(int salary) {
        if (salary < 0) {
            return 0;
        }
        int salaryHourly = salary * workTime;
        return salaryHourly;
    }
}
