package com.zoo;

import com.zoo.animal.*;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Horse horse = new Horse("Vapel");
        Antelope antelope = new Antelope("Oppa");
        Dragon dragon = new Dragon("Ellion");
        Griffin griffin = new Griffin("Griff");
        Pegasus pegasus = new Pegasus("Peg");
        Tiger tiger = new Tiger("Leo");
        Lion lion = new Lion("Daddy");
        System.out.println("Hi! Welcome to our zoo!");
        int answer;
        do {
            System.out.println("Please, choose who you want to see:");
            chooseAction();
            answer = in.nextInt();
            switch (answer) {
                case 1:
                    antelopeAction(antelope);
                    break;
                case 2:
                    dragonAction(dragon);
                    break;
                case 3:
                    griffinAction(griffin);
                    break;
                case 4:
                    horseAction(horse);
                    break;
                case 5:
                    lionAction(lion);
                    break;
                case 6:
                    pegasusAction(pegasus);
                    break;
                case 7:
                    tigerAction(tiger);
                    break;
            }
            System.out.println("Continue? 1 - yes, 0 - no");
            answer = in.nextInt();
        } while (answer == 1);
        System.out.println("Goodbye!");
    }

    private static void chooseAction() {
        System.out.println("1. Antelope");
        System.out.println("2. Dragon");
        System.out.println("3. Griffin");
        System.out.println("4. Horse");
        System.out.println("5. Lion");
        System.out.println("6. Pegasus");
        System.out.println("7. Tiger");
    }

    private static void animalAction(Animal animal) {
        System.out.println("eat:");
        animal.eat();
        System.out.println("eat different food:");
        animal.eat("carrot");
        System.out.println("say:");
        animal.say();
        System.out.println("sleep:");
        animal.sleep();
    }

    private static void antelopeAction(Antelope antelope) {
        System.out.println("Good choice! Our antelope can: ");
        animalAction(antelope);
        System.out.println("shoe:");
        antelope.shoe();
        System.out.println("gallop:");
        antelope.gallop();
    }

    private static void dragonAction(Dragon dragon) {
        System.out.println("Good choice! Our dragon can: ");
        animalAction(dragon);
        System.out.println("wash up:");
        dragon.washUp();
        System.out.println("attack:");
        dragon.attack();
    }

    private static void griffinAction(Griffin griffin) {
        System.out.println("Good choice! Our griffin can: ");
        animalAction(griffin);
        System.out.println("fly:");
        griffin.fly();
        System.out.println("gallop:");
        griffin.gallop();
    }

    private static void horseAction(Horse horse) {
        System.out.println("Good choice! Our horse can: ");
        animalAction(horse);
        System.out.println("shoe:");
        horse.shoe();
        System.out.println("gallop:");
        horse.gallop();
    }

    private static void lionAction(Lion lion) {
        System.out.println("Good choice! Our lion can: ");
        animalAction(lion);
        System.out.println("attack:");
        lion.attack();
        System.out.println("wash up:");
        lion.washUp();
    }

    private static void pegasusAction(Pegasus pegasus) {
        System.out.println("Good choice! Our pegasus can: ");
        animalAction(pegasus);
        System.out.println("fly:");
        pegasus.fly();
        System.out.println("shoe:");
        pegasus.shoe();
    }

    private static void tigerAction(Tiger tiger) {
        System.out.println("Good choice! Our tiger can: ");
        animalAction(tiger);
        System.out.println("attack:");
        tiger.attack();
        System.out.println("wash up:");
        tiger.washUp();
    }
}
