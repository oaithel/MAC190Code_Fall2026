package com.mac190.binding;

import java.util.Objects;

/*
Implement a class Dog, knowing that a Dog is an Animal and in addition has
- breed and name and Dogs are omnivors of the Canine species.
- defautl constructor
- constructor that accepts needed attributes
- setters/getters
-toString equals
- method speak here should display message "Waf Waf !"
 */
public class Dog extends Animal{
    private String breed;
    private String name;

    public Dog(){
        super("Canine", "Omnivore", "N/A", 0);
        breed = "N/A";
        name = "N/A";
    }
    public Dog(String br, String n, String c, int a){
        super("Canine", "Omnivore", c, a);
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
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Dog dog)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(breed, dog.breed) && Objects.equals(name, dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(breed, name);
    }
    public void speak(){
        System.out.println("Waf Waf !!");
    }
}
