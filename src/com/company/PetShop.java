package com.company;

import java.util.Scanner;

public class PetShop {

    public static void main(String[] args) {
        Dog dog1 = new Dog("Millie", 4, "play catch");
        Dog dog2 = new Dog("Luna", 1, "chew everything");

        Cat cat1 = new Cat("Midnight", 10, "cuddles");
        Cat cat2 = new Cat("Sven", 2, "knead dough");

/* old code:
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

*/
        System.out.println("Thank you for looking for your forever family pet. \n" +
                "Here are the following dogs and cats we have available: \n");
        System.out.println("DOGS: \n" );
        dog1.describeAnimal();
        dog2.describeAnimal();
        System.out.println("\n" + "CATS: ");
        cat1.describeAnimal();
        cat2.describeAnimal();
        System.out.println("\n" + "Please enter the name of the animal you would like to take home");


        // input for user to enter animal name
        Scanner userInput = new Scanner(System.in);
        String input = userInput.nextLine();
        boolean isNotFound = true;

        while (isNotFound) {
            if (input.equals(dog1.getNameOfAnimal()) || input.equals(dog2.getNameOfAnimal()) || input.equals(cat1.getNameOfAnimal()) || input.equals(cat2.getNameOfAnimal())) {
                System.out.println("That pet is available! Please take good care of your new Family Member.");
                isNotFound = false;
            } else {
                System.out.println("That pet is not available. Please ask for another animal:");
                input = userInput.nextLine();
            }
        }
    }
}
