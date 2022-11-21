package io.zipcoder.polymorphism;

import java.util.Scanner;

public class MainApplication {

    public static void main(String[] args) {
        int numOfPets;

        System.out.println("Hello, how many pets do you have?");
        Scanner scan = new Scanner(System.in);
        numOfPets = scan.nextInt();

        Pet[] ownedPets = new Pet[numOfPets];

        for (int i = 0; i < numOfPets; i++) {
            System.out.println("what type of pet is " + (i + 1) + " ? Is it a dog, cat or lizard?");
            String petType = scan.next();
            String petName = "";

            if (petType.equals("dog")) {
                System.out.println("What is your dogs name?");
                petName = scan.next();
                ownedPets[i] = new Dog(petName);
            }
            if (petType.equals("cat")) {
                System.out.println("What is your cats name?");
                petName = scan.next();
                ownedPets[i] = new Cat(petName);
            }
            if (petType.equals("lizard")) {
                System.out.println("What is your lizards name?");
                petName = scan.next();
                ownedPets[i] = new Lizard(petName);
            }
        }
        for (Pet pet : ownedPets) System.out.println(pet.toString());
    }
}
