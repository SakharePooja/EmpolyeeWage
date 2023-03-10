package com.bridgelabz;

public class EmployeeWage {
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;
    static final int PART_TIME_HOUR = 4;
    static final int WORKING_DAYS_PER_MONTH = 20;
    static final int FULL_TIME = 2;
    static final int PART_TIME = 1;
   


    public static void main(String[] args) {
        System.out.println("Welcome to employee wage");
        int dayCount=1;
        int totalWage = 0;

        while (dayCount<=WORKING_DAYS_PER_MONTH) {
            int dailyWage = 0;
            int employeeCheck = (int) Math.floor(Math.random() * 10) % 3;
            System.out.println(employeeCheck);

            switch (employeeCheck) {
                case FULL_TIME:
                    dailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
                    System.out.println("Employee is Full Time");
                    break;
                case PART_TIME:
                    dailyWage = WAGE_PER_HOUR * PART_TIME_HOUR;
                    System.out.println("Employee is Part Time");
                    break;
                default:
                    System.out.println("Employee is Absent");
                    break;
            }
            totalWage = totalWage + dailyWage;
            System.out.println("Daily wage for day = " + dayCount + "  is " +dailyWage);
            dayCount++;

        }
        System.out.println(totalWage);

    }
}
