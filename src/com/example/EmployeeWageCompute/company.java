package com.example.EmployeeWageCompute;

public class company {
    private String companyName;
    private int empratePerHr, noOfworkingday,maxHrPerMonth, totalEmpwage;

    public company(String companyName, int empratePerHr, int noOfworkingday, int maxHrPerMonth){
        this.companyName = companyName;
        this.empratePerHr = empratePerHr;
        this.noOfworkingday = noOfworkingday;
        this.maxHrPerMonth = maxHrPerMonth;
    }
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getEmpratePerHr() {
        return empratePerHr;
    }

    public void setEmpratePerHr(int empratePerHr) {
        this.empratePerHr = empratePerHr;
    }

    public int getNoOfworkingday() {
        return noOfworkingday;
    }

    public void setNoOfworkingday(int noOfworkingday) {
        this.noOfworkingday = noOfworkingday;
    }

    public int getMaxHrPerMonth() {
        return maxHrPerMonth;
    }

    public void setMaxHrPerMonth(int maxHrPerMonth) {
        this.maxHrPerMonth = maxHrPerMonth;
    }

    public int getTotalEmpwage() {
        return totalEmpwage;
    }

    public void setTotalEmpwage(int totalEmpwage) {
        this.totalEmpwage = totalEmpwage;
    }

    /* tostring override method
     * toString method use to proper display the employee data
     */
    public String toString(){
        return "compnayname"+companyName+
                "employeerate"+empratePerHr+
                "noofworkingday"+noOfworkingday+
                "maxhrpermonth"+maxHrPerMonth;
    }
}
