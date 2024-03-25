package org.example;

public class Main {
    public static void main(String[] args) {
        Tester tester = new Tester("Илья", "Володьков", 5, "C1", 1000.0);

        System.out.println("Hello, " +tester.getName());


       Tester.printTesterDetails(tester);
    }

}
class Tester {
    private String name;
    private String surname;
    private int expirienceInYears;
    private String englishLevel;
    private double salary;

    public String getName() {
        return name;
    }
    public String getName(int a){
        return name+name;
    }
    public String getName(int a, int b){
        return name+name+name;
    }

    public Tester(String name) {
        this(name, "Unknown");
    }

    public Tester(String name, String surname) {
        this(name, surname, 0);
    }

    public Tester(String name, String surname, int expirienceInYears) {
        this(name, surname, expirienceInYears, "Unknown", 0.0);
    }

    public Tester(String name, String surname, int expirienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.expirienceInYears = expirienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }
    public void printName() {
        System.out.println("Name: " + this.name);
    }

    public void printNameAndSurname() {
        System.out.println("Name: " + this.name + ", Surname: " + this.surname);
    }

    public void printInfo() {
        System.out.println("Name: " + this.name + ", Surname: " + this.surname + ", Experience: " + this.expirienceInYears + " years");
    }

    public static void printTesterDetails(Tester tester) {
        tester.printInfo();
    }
}
