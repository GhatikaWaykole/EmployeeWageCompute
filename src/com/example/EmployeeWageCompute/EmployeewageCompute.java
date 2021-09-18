package com.example.EmployeeWageCompute;

import java.util.Random;

public class EmployeewageCompute {
    public static void main(String args[]){
        System.out.println("Welcome to the employeewage compute");
        // declare the constant in the program
        int IS_FULL_TIME=1;
        // random to compute the value of random number rang of 2 number
        Random random = new Random();
        int empCheck = random.nextInt(2);
        if(empCheck == IS_FULL_TIME) {
            System.out.println("Employee is present");
        }
        else{
            System.out.println("Employee is absent");
            }
    }
}
