package com.example.texnologiesdiadiktiou.InputClasses;

import java.util.ArrayList;

public class Company extends Employee extends WorkDays{

    private String companyName;
    private ArrayList<WorkDay> workDays = new ArrayList<WorkDay>;
    private ArrayList<Employee> employeeList = new ArrayList<Employee>();
    private int numberOfEmployees;


    public Company(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public ArrayList<WorkDay> getWorkDays() {
        return workDays;
    }

    public WorkDay getDayOpen(int i) {
        return workDays.get(i);
    }

    public int getNumberOfWorkDays(){
        return workDays.size();
    }

    public void setWorkDays(ArrayList<WorkDay> workDays) {
        this.workDays = workDays;
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    public Employee getEmployee(int i) {
        return employeeList.get(i);
    }

    public void setEmployeeList(ArrayList<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }
}
