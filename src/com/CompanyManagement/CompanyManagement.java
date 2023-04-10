package com.CompanyManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CompanyManagement {
    static List<Person> list = new ArrayList<Person>();


    public void addNewPerson(){
        System.out.println("1. Create a Director ");
        System.out.println("2. Create a Manager ");
        System.out.println("3. Create a Employee ");
        System.out.print("Vui long nhap vi tri nhan su:");

        Scanner input = new Scanner(System.in);
        int choose = input.nextInt();

        Person newPerson = null;

        switch (choose){
            case 1:{
                newPerson = new Director();
            }
            break;
            case 2:{
                newPerson = new Manager();
            }
            break;
            case 3:{
                newPerson = new Employee();
            }
            break;
        }
        newPerson.inputData();
        this.list.add( newPerson );
    }

    public void displayAll(){
        for ( Person item :list){
            item.displayData();
        }
    }

    Person findPersonById() {
        System.out.print("Enter id to find: ");
        Scanner input = new Scanner(System.in);
        int findId = input.nextInt();

        for (Person item : list) {
            if(findId == item.getId()) {
                item.displayData();
                //return item that has id
                return item;
            }
        }

        return null;
    }



    public void updatePerson() {
        Person findPerson = this.findPersonById();
        if(findPerson != null) {
            findPerson.updatePerson();
        } else {
            System.out.println("Not found");
        }
    }


    public static void getTotalBonusOfCompany() {
        double totalBonus = 0;
        for (Person person : list) {
            person.displayData();
            System.out.println("Bonus " + person.getBonus());
            totalBonus += person.bonus * person.salary ;
        }

        System.out.println("Total Bonus Of Company: " + totalBonus);

    }



    public void updateSalary() {
        Person findPerson = this.findPersonById();
        if(findPerson != null) {
            findPerson.updateSalary();
        } else {
            System.out.println("Not found");
        }
    }

}
