package com.mac190.binding;

import java.util.Objects;

/*
Implement a class Cat, knowing that a Cat is an Animal and in addition has
- breed and name and Cats are Carnivors of the Cats species.
- default constructor
- constructor that accepts needed attributes
- setters/getters
- toString equals
- method speak here should display message "Miaou Miaou !"
 */
public class Cat extends Animal{
    private String breed;
    private String name;

    public Cat(){
        super("Cats", "Carnivore", "N/A", 0);
        breed = "N/A";
        name = "N/A";
    }
    public Cat(String br, String n, String c, int a){
        super("Cats", "Carnivore", c, a);
        breed = br;
        name = n;
    }
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Cat cat)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(breed, cat.breed) && Objects.equals(name, cat.name);
    }

    public void speak(){
        System.out.println("Miaou Miaou !!");
    }
}
