package com.example.managmentproj;
public abstract class Employee {
    private String name;
    private String type; // Добавляем поле type

    public Employee(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() { // Геттер для type
        return type;
    }

    // Метод для расчета зарплаты (абстрактный)
    public abstract double calculateSalary();
}
