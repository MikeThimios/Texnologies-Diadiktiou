package com.example.texnologiesdiadiktiou.InputClasses;

public class Employee {

    private  String firstName;
    private String lastName;
    private Enum specialty;
    private Enum workingHours;
    private Enum gravityOfChoise;
    private  float salary;


    public Employee(String firstName, String lastName, Enum specialty, Enum workingHours, Enum gravityOfChoise) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialty = specialty;
        this.workingHours = workingHours;
        this.gravityOfChoise = gravityOfChoise;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Enum getSpecialty() {
        return specialty;
    }

    public void setSpecialty(Enum specialty) {
        this.specialty = specialty;
    }

    public Enum getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(Enum workingHours) {
        this.workingHours = workingHours;
    }

    public Enum getGravityOfChoise() {
        return gravityOfChoise;
    }

    public void setGravityOfChoise(Enum gravityOfChoise) {
        this.gravityOfChoise = gravityOfChoise;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
