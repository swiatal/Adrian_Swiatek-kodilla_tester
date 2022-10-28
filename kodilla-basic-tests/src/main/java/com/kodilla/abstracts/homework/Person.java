package com.kodilla.abstracts.homework;

public class Person {
    private String firstName;
    private int age;
    private Job job;

    public Person(String firstName, int age, Job job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public void showResponsibilities() {
       System.out.println(firstName + " " + age + " " + job.getResponsibilities());

        }
        public static void main (String[]args){

            Job teacher = new Teacher(3000, "giving homeworks");

            Person osoba1 = new Person("Piotr", 23, teacher);
            osoba1.showResponsibilities();

            Job accountant = new Accountant(3000, "giving homeworks");

            Person osoba2 = new Person("Anna", 32,accountant );
            osoba2.showResponsibilities();

           /* Job accountant = new Accountant(5000, "preparation of the profit and loss account"
            );
            accountant.responsibilitiesInWork();*/
        }
    }





