package com.mac190.binding;
/*
Implement a class Animal that has the following properties:
- diet, species, color, age(int)
- default constructor
- constructor that accepts all attributes.
- toString, equals.
- method speak() to display message: "Don't know how to speak yet!"
 */
public class Animal {
    private String diet;
    private String color;
    private String species;
    private int age;

    public Animal(){
        diet = "N/A";
        color = "N/A";
        species = "N/A";
        age = 0;
    }
    public Animal(String s,String d, String c, int a){
        species = s;
        diet = d;
        color = c;
        age = a;
    }

    public String getDiet() {
        return diet;
    }
    public void setDiet(String diet) {
        this.diet = diet;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getSpecies() {
        return species;
    }
    public void setSpecies(String species) {
        this.species = species;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Animal{" +
                "diet='" + diet + '\'' +
                ", color='" + color + '\'' +
                ", species='" + species + '\'' +
                ", age=" + age +
                '}';
    }

    public boolean equals(Object object) {
        if (!(object instanceof Animal animal)) return false;
        if (!super.equals(object)) return false;
        return age == animal.age && java.util.Objects.equals(diet, animal.diet) && java.util.Objects.equals(color, animal.color) && java.util.Objects.equals(species, animal.species);
    }

    public void speak(){
        System.out.println("Don't know how to speak yet!");
    }
}
