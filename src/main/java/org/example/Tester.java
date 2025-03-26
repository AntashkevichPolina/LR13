package org.example;

public class Tester {
    private String name;
    private String surname;
    private int experienceInYears;
    private String englishLevel;
    private double salary;

    public Tester(String name) {
        this(name, "Doe", 0, "A1", 0.0);
    }
    public Tester(String name, String surname) {
        this(name, surname, 0, "A1", 0.0);
    }
    public Tester(String name, String surname, int experienceInYears) {
        this(name, surname, experienceInYears, "A1", 0.0);
    }
    public Tester(String name, String surname, int experienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.experienceInYears = experienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }
    public void displayInfo() {
        System.out.println(name + " " + surname);
    }
    public void displayInfo(int years) {
        System.out.println(name + " " + surname + ", Experience: " + years + " years");
    }
    public void displayInfo(double salary) {
        System.out.println(name + " " + surname + ", Salary: " + salary);
    }
    public static void printGreeting() {
        System.out.println("Hello!");
    }
}