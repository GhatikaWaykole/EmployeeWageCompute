package com.example.EmployeeWageCompute;

import java.util.Random;
class employee{
}

public class EmployeewageCompute {
    static final int IS_FULL_TIME = 1;
    static final int IS_PART_TIME = 2;

    String companyName;
    private final int empRatePerHr;
    private final int noOfWorkingDay;
    private final int maxHrPerMonth;
    private int totalEmpWage;

    /* EmployeeWage parametrise constructor
    * parameter refer to the static final wih the use this operator to assign the value
    */
    public EmployeewageCompute(String companyName, int empratePerHr, int noOfWorkingday, int maxHrPerMonth){
        int noOfWorkingDay1;
        this.companyName = companyName;
        this.empRatePerHr = empratePerHr;
        this.maxHrPerMonth = maxHrPerMonth;
        this.noOfWorkingDay = noOfWorkingday;
    }
    public void employeeWage() {
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
        this.totalEmpWage = totalEmpHr * noOfWorkingDay;
        }
        /* toString method to return the totalEmpWage
         * employee wage return is not proper format toStrin emthod used to the proper employeewage
         */
    public String toString() {
        return "Month employee wage" + totalEmpWage;
    }
    public static void main(String args[]) {
        System.out.println("Welcome to the employeewage compute");
        // call the employeeWage
        EmployeewageCompute mphasis = new EmployeewageCompute("Mphasis",40,10,60);
        mphasis.employeeWage();
        System.out.println("mphasis employee month wage"+mphasis);
        EmployeewageCompute mindtree = new EmployeewageCompute("MindTree",60,5,40);
        mindtree.employeeWage();
        System.out.println("mindtree employee month wage"+mindtree);
        EmployeewageCompute philip = new EmployeewageCompute("Philip",20,40,80);
        philip.employeeWage();
        System.out.println("philip employee month wage"+philip);
    }
}
