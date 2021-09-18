package com.example.EmployeeWageCompute;

import java.util.Random;
class employee{
}

public class EmployeewageCompute {
    static final int IS_FULL_TIME = 1;
    static final int IS_PART_TIME = 2;
    static final int EMP_RATE_PerHr = 20;
    static final int NO_OF_WORKINGDAY = 20;
    static final int MAX_HRS_MONTH=100;
    /* employeeWage method to compute the employee wage
      * employee wage compute with the switch case and random to give the working day of employee
     */
    public static void employeeWage() {
        int empHrs = 0, empWage = 0, totalEmpWage = 0, totalEmpHr = 0, totalWorkingDays = 0;
        // random to compute the value of random number rang of 2 number
        while (totalEmpHr <= MAX_HRS_MONTH && totalWorkingDays < NO_OF_WORKINGDAY) {
            Random random = new Random();
            int empCheck = random.nextInt(3);
            switch (empCheck) {
                case IS_FULL_TIME:    //full time employee
                    empHrs = 8;
                    break;
                case IS_PART_TIME:    //part time employee
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
                    break;
            }
            // daily wage give the employee rate per hour 20 and the emp hour 8 of day compute
            empWage = EMP_RATE_PerHr * empHrs;
            totalEmpHr += empHrs;
            System.out.println("working day" + totalWorkingDays + "employee work" + empHrs + "hour employee wage" + empWage);
        }
        totalEmpWage = totalEmpHr * EMP_RATE_PerHr;
        System.out.println("Month employee wage"+totalEmpWage);
    }
    public static void main(String args[]) {
        System.out.println("Welcome to the employeewage compute");
        // call the employeeWage method
        employeeWage();
    }
}
