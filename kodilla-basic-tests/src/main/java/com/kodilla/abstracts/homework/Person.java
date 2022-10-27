package com.kodilla.abstracts.homework;

public class Person {
    private String firstName;
    private int age;
    private Job job;

    public Person(String firstName,int age, Job job){
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }
   public static void main(String[]args) {

   Job teacher = new Teacher (3000,"giving homeworks");
   teacher.responsibilitiesInWork();

   Job accountant = new Accountant(5000, "preparation of the profit and loss account"
   );
   accountant.responsibilitiesInWork();
    }
}
