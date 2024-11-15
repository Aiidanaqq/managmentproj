package com.example.managmentproj;
public class FullTimeEmployee extends Employee {
    private double salary;

    public FullTimeEmployee(String name, double salary) {
        super(name, "Full-time"); // Передаем тип в базовый класс
        this.salary = salary;
    }

    @Override
    public double calculateSalary() {
        return salary;
    }
}
