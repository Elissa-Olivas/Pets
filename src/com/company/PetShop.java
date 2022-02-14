package com.company;

import java.util.Scanner;

public class PetShop {

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        Cat cat1 = new Cat();
        Cat cat2 = new Cat();


        dog1.setNameOfAnimal("Millie");
        dog1.setAgeOfAnimal(4);
        dog1.setFunFact("play catch");

        dog2.setNameOfAnimal("Luna");
        dog2.setAgeOfAnimal(1);
        dog2.setFunFact("chew everything");

        cat1.setNameOfAnimal("Midnight");
        cat1.setAgeOfAnimal(10);
        cat1.setFunFact("cuddles");

        cat2.setNameOfAnimal("Sven");
        cat2.setAgeOfAnimal(2);
        cat2.setFunFact("knead dough");


        System.out.println("Thank you for looking for your forever family pet. \n" +
                "Here are the following dogs and cats we have available: \n");
        System.out.println("DOGS: \n" + dog1.getNameOfAnimal() + " is " + dog1.getAgeOfAnimal() + " years old and loves to " + dog1.getFunFact() +
                "\n" + dog2.getNameOfAnimal() + " is " + dog2.getAgeOfAnimal() + "years old and loves to " + dog2.getFunFact());
        System.out.println("\n" + "CATS: " + "\n" + cat1.getNameOfAnimal() + " is " + cat1.getAgeOfAnimal() + " years old and loves " + cat1.getFunFact() + ". \n" +
                cat2.getNameOfAnimal() + " is " + cat2.getAgeOfAnimal() + " years old and loves to " + cat2.getFunFact());

        System.out.println("\n" + "Please enter the name of the animal you would like to take home");


        // input for user to enter animal name
        Scanner userInput = new Scanner(System.in);
        String input = userInput.nextLine();
        boolean isNotFound = true;

        while (isNotFound) {
            if (input.equals(dog1.getNameOfAnimal()) || input.equals(dog2.getNameOfAnimal()) || input.equals(cat1.getNameOfAnimal()) || input.equals(cat2.getNameOfAnimal())) {
                System.out.println("That pet is available!");
                isNotFound = false;
            } else {
                System.out.println("That pet is not available. Please ask for another animal:");
                input = userInput.nextLine();
            }
        }
    }
}
