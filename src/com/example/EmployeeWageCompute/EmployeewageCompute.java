package com.example.EmployeeWageCompute;

import java.util.Random;

public class EmployeewageCompute {
    public static void main(String args[]){
        System.out.println("Welcome to the employeewage compute");
        // declare the constant in the program
        int IS_FULL_TIME=1;
        int EMP_RATE_PerHr=20;
        //declare a variable to compute
        int empHrs=0, empWage=0;
        // random to compute the value of random number rang of 2 number
        Random random = new Random();
        int empCheck = random.nextInt(2);
        if(empCheck == IS_FULL_TIME) {
            empHrs = 8;
        }
        else{
            empHrs = 4;
            }
        // daily wage give the employee rate per hour 20 and the emp hour 8 of day compute
        empWage = EMP_RATE_PerHr * empHrs;
        System.out.println("Daily wage of the employee"+empWage);
    }
}
