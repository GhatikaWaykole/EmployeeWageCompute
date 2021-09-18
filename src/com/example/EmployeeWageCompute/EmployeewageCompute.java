package com.example.EmployeeWageCompute;

import java.util.Random;
class employee{
}

public class EmployeewageCompute {
    static final int IS_FULL_TIME = 1;
    static final int IS_PART_TIME = 2;
    /* employeeWage method to compute the employee wage
      * employee wage compute with the switch case and random to give the working day of employee
     */
    public static void employeeWage(String companyName, int empRatePerHr, int noOfWorkingDay, int maxHrPerMonth) {
        int empHrs = 0, empWage = 0, totalEmpWage = 0, totalEmpHr = 0, totalWorkingDays = 0;
        // random to compute the value of random number rang of 2 number
        while(totalEmpHr <= maxHrPerMonth && totalWorkingDays < noOfWorkingDay) {
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
            empWage = empRatePerHr * empHrs;
            totalEmpHr += empHrs;
            System.out.println("working day" + totalWorkingDays + "employee work" + empHrs + "hour employee wage" + empWage);
        }
        totalEmpWage = totalEmpHr * noOfWorkingDay;
        System.out.println("Month employee wage"+totalEmpWage);
    }
    public static void main(String args[]) {
        System.out.println("Welcome to the employeewage compute");
        // call the employeeWage method
        employeeWage("Mphasis",40,10,60);
        employeeWage("MindTree",60,5,40);
        employeeWage("Philip",20,40,80);
    }
}
