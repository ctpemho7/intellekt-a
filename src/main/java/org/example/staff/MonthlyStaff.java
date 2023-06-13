package org.example.staff;

public class MonthlyStaff implements Staff {
    static int workDays;
    static int premium;

    public int getWorkDays() {
        return workDays;
    }

    public int getPremium() {
        return premium;
    }


    public MonthlyStaff(int workDays, int premium) {
        if (workDays <= 0 | workDays > 30) {
            this.workDays = 0;
        } else
            this.workDays = workDays;

        if (premium < 0 | premium > 10000) {
            this.premium = 0;
        } else {
            this.premium = premium;
        }
    }

    @Override
    public int calculateSalary(int salary) {
        if (salary < 0) {
            return premium;
        }
        int salaryMonth = salary * workDays + premium;
        return salaryMonth;
    }
}
