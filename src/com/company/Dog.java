package com.company;

public class Dog {
    private String nameOfAnimal;
    private int ageOfAnimal;
    private String funFact;

    public Dog (String nameOfAnimal, int ageOfAnimal, String funFact) {
        this.nameOfAnimal = nameOfAnimal;
        this.ageOfAnimal = ageOfAnimal;
        this.funFact= funFact;
    }

    //set name
    public void setNameOfAnimal(String name) {
        nameOfAnimal = name;
    }
    //get name
    public String getNameOfAnimal() {
        return nameOfAnimal;
    }


    //set age
    public void setAgeOfAnimal(int age) {
        ageOfAnimal = age;
    }
    //get age
    public int getAgeOfAnimal() {
        return ageOfAnimal;
    }


    //set fun fact
    public void setFunFact(String fact) {
        funFact = fact;
    }
    //get fun fact
    public String getFunFact() {
        return funFact;
    }

    public void describeAnimal() {
        System.out.println(getNameOfAnimal() + ", who is " + getAgeOfAnimal() + " and loves to " + getFunFact() + ".");
    }
}
