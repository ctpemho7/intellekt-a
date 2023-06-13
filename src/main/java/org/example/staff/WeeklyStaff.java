package org.example.staff;

public class WeeklyStaff extends MonthlyStaff implements Staff {
    private static int workWeeks;
    private static int salary;

    public int getWorkWeeks() {
        return workWeeks;
    }

    public WeeklyStaff(int workWeeks, int workDays, int premium) {
        super(workDays, premium);
        if (workWeeks < 2 | workWeeks > 4) {
            this.workWeeks = 0;
        } else {
            this.workWeeks = workWeeks;
        }
    }

    @Override
    public int calculateSalary(int salary) {
        if (salary < 0) {
            return 0;
        }
        this.salary =  salary;
        return workWeeks * salary;
    }

    public void printYearSalary() {
        System.out.println(workWeeks * salary * 26);
    }
}
