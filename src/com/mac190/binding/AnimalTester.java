package com.mac190.binding;

public class AnimalTester {
    public static void main(String[] args) {
        //create a defaut Animal A1
        Animal A1 = new Animal();
        //set color to gray, age to 3, species to Canine, diet to Omnivore
        //display it
        A1.setSpecies("Canine");
        A1.setDiet("Omnivore");
        A1.setColor("Gray");
        A1.setAge(3);
        System.out.println("A1: " + A1);
        //invoke speak on A1
        A1.speak();
        //Create a Dog D1 color to gray, age to 3, name "milou" breed chiwawa
       Dog D1 = new Dog("Shiwawa", "Milou", "Gray", 3);
        //display it.
        System.out.println("D1: " + D1);
        //invoke speak on D1
        D1.speak();
        //Create a Cat C1 brown, age 2, name "catcat" breed "siyamowa"
        //display it.
        Cat C1 = new Cat("Siyamowa", "catcat", "Brown", 2);
        System.out.println("C1: " + C1);
        //invoke speak on C1
        C1.speak();
        //make a reference refD1 to the Animal within the Dog D1
        Animal refD1 = (Animal) D1;
        System.out.println("refD1: " + refD1);
        //invoke speak on refD1.
        refD1.speak();
        //assigne C1 to refD1.
        refD1 = C1;
        //invoke speak on refD1.
        System.out.println("refD1: " + refD1);
        refD1.speak();
        //create a Cat reference refC1 from refD1
        Cat myCat = (Cat)refD1;//dynamic binding
        //display it
        System.out.println("Cat: " + myCat);
        //invoke speak on refC1
        myCat.speak();
        //create a Dog reference redD using the refD1. //What happened?
        /*
        //You cannot make an object Dog from a Cat, they are not
        related classes, even if they have the same data.
        Dog refD2 = (Dog) refD1;
        System.out.println("refD2: " + refD2);
        refD2.speak();
         */
        /*
        this will trigger a class cast exception as well.
        Because we cannot make a bigger object (derived object Dog)
        from a smaller object (base object, Animal)
        Cat C2 = (Cat) A1;
        System.out.println("C2: " + C2);

         */
    }
}
