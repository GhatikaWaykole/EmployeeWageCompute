package com.example.EmployeeWageCompute;

import java.util.Random;
public class EmployeewageCompute {
    static final int IS_FULL_TIME = 1;
    static final int IS_PART_TIME = 2;

    String companyName;
    private int totalEmpWage;
    private int noOfCompany=0;
    private company[] company;

    /* EmployeeWage parametrise constructor
    * parameter refer to the static final wih the use this operator to assign the value
    */
    public EmployeewageCompute(){
        company = new company[6];
    }
    public void employeWageCompute(String companyName, int empratePerHr, int noOfWorkingday, int maxHrPerMonth){
        company[noOfCompany] = new company(companyName,empratePerHr,noOfWorkingday,maxHrPerMonth);
        noOfCompany++;
    }
    private void employeeWage() {
        for (int i = 0; i < noOfCompany; i++) {
            company[i].setTotalEmpwage(this.employee(company[i]));
            System.out.println(company[i]);
        }
    }
    public static int employee(company company){
        int empHrs = 0, empWage = 0, totalEmpWage = 0, totalEmpHr = 0, totalWorkingDays = 0;
        // random to compute the value of random number range of 2 number
        while(totalEmpHr <= company.getMaxHrPerMonth() && totalWorkingDays < company.getNoOfworkingday()) {
            totalWorkingDays++;
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
            empWage = company.getEmpratePerHr() * empHrs;
            totalEmpHr += empHrs;
        }
        totalEmpWage = totalEmpHr * company.getEmpratePerHr();
        return totalEmpWage;
        }

    public static void main(String args[]) {
        System.out.println("Welcome to the employeewage compute");
        // call the employeeWage
        EmployeewageCompute employeewageCompute = new EmployeewageCompute();
        employeewageCompute.employeWageCompute("Mphasis",40,10,60);
        employeewageCompute.employeWageCompute("MindTree",60,5,40);
        employeewageCompute.employeWageCompute("Philip",20,40,60);
        employeewageCompute.employeeWage();
    }
}
