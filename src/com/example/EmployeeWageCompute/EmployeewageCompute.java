package com.example.EmployeeWageCompute;

import java.util.Random;

public class EmployeewageCompute {
    static final int IS_FULL_TIME=1;
    static final int IS_PART_TIME=2;
    static final int EMP_RATE_PerHr=20;
    public static void main(String args[]){
        System.out.println("Welcome to the employeewage compute");
        //declare a variable to compute
        int empHrs=0, empWage=0;
        // random to compute the value of random number rang of 2 number
        Random random = new Random();
        int empCheck = random.nextInt(3);
        switch(empCheck) {
            case IS_FULL_TIME:
                empHrs = 8;
                break;
            case IS_PART_TIME:
                empHrs = 4;
                break;
            default:
                empHrs = 0;
                break;
        }
        // daily wage give the employee rate per hour 20 and the emp hour 8 of day compute
        empWage = EMP_RATE_PerHr * empHrs;
        System.out.println("Daily wage of the employee"+empWage);
    }
}
