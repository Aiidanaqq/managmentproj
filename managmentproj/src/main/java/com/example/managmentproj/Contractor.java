package com.example.managmentproj;
public class Contractor extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public Contractor(String name, double hourlyRate, int hoursWorked) {
        super(name, "Contractor"); // Передаем тип в базовый класс
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}
