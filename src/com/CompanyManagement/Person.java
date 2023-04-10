package com.CompanyManagement;

import java.util.Scanner;

public abstract class Person {
    private static int currentId=0;
    protected int id;
    protected String name;
    protected double bonus;
    protected double salary;

    public Person(){
        this.id = ++currentId;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public double getBonus(){
        return bonus;
    }


    public double getSalary() {
        return salary;
    }

    public double getTotalSalary() {
        return bonus * salary + salary;
    }


    public abstract void inputData();

    public abstract void displayData();

    public abstract void updatePerson();

    public void updateSalary() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cap nhat luong moi: ");
        salary = Double.parseDouble(scanner.nextLine());
        System.out.print("Cap nhat muc thuong moi: ");
        bonus = Double.parseDouble(scanner.nextLine());
        System.out.printf("Da cap nhat: Luong co ban moi = %f, Muc thuong moi = %f", salary, bonus);
    }
}

//Director
class Director extends Person {
    private String role;

    public Director() {
        super();
        bonus = 0.5 ;
    }


    @Override
    public void inputData() {
        System.out.println("Bat dau khoi tao vi tri giam doc........");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten: ");
        name = scanner.nextLine();
        System.out.print("Nhap luong co ban ($): ");
        salary = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhap chuc vu: ");
        role = scanner.nextLine();
        System.out.print("Da tao thanh cong: ");
        displayData();
    }

    @Override
    public void displayData() {
        System.out.printf("Giam doc [id = %d, ten = %s, chuc vu = %s, luong co ban = $%.2f, muc thuong = %.2f, tong luong = $%.2f]%n", getId(), getName(), role, getSalary(), getBonus(), getTotalSalary());
    }

    @Override
    public void updatePerson() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cap nhat ten: ");
        name = scanner.nextLine();
        System.out.print("Cap nhat chuc vu: ");
        role = scanner.nextLine();
        System.out.print("Da cap nhat thanh cong: ");
        displayData();
    }
}

//Manager
class Manager extends Person {
    private String department;

    public Manager() {
        super();
        bonus = 0.3;
    }


    @Override
    public void inputData() {
        System.out.println("Bat dau khoi tao vi tri truong phong........");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten: ");
        name = scanner.nextLine();
        System.out.print("Nhap luong co ban ($): ");
        salary = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhap phong ban: ");
        department = scanner.nextLine();
        System.out.print("Da tao thanh cong: ");
        displayData();
    }

    @Override
    public void displayData() {
        System.out.printf("Truong phong [id = %d, ten = %s, phong ban = %s, luong co ban = $%.2f, muc thuong = %.2f, tong luong = $%.2f]%n", getId(), getName(), department, getSalary(), getBonus(), getTotalSalary());
    }

    @Override
    public void updatePerson() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cap nhat ten: ");
        name = scanner.nextLine();
        System.out.print("Cap nhat phong ban: ");
        department = scanner.nextLine();
        System.out.print("Da cap nhat thanh cong: ");
        displayData();
    }
}


// Employee
class Employee extends Person {
    private String skill;

    public Employee() {
        super();
        bonus = 0.1;
    }




    @Override
    public void inputData() {
        System.out.println("Bat dau khoi tao vi tri nhan vien........");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten: ");
        name = scanner.nextLine();
        System.out.print("Nhap luong co ban ($): ");
        salary = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhap vi tri: ");
        skill = scanner.nextLine();
        System.out.print("Da tao thanh cong: ");
        displayData();
    }

    @Override
    public void displayData() {
        System.out.printf("Nhan vien [id = %d, ten = %s, vi tri = %s, luong co ban = $%.2f, muc thuong = %.2f, tong luong = $%.2f]%n", getId(), getName(), skill, getSalary(), getBonus(), getTotalSalary());
    }

    @Override
    public void updatePerson() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cap nhat ten: ");
        name = scanner.nextLine();
        System.out.print("Cap nhat vi tri: ");
        skill = scanner.nextLine();
        System.out.print("Da cap nhat thanh cong: ");
        displayData();
    }
}