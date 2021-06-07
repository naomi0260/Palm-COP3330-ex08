package ex08;

import java.util.Scanner;

/*
Write a program to evenly divide pizzas. Prompt for the number of people, the number of pizzas, and the number of slices per pizza. Ensure that the number of pieces comes out even. Display the number of pieces of pizza each person should get. If there are leftovers, show the number of leftover pieces.

Example Output
How many people? 8
How many pizzas do you have? 2
How many slices per pizza? 8
8 people with 2 pizzas (16 slices)
Each person gets 2 pieces of pizza.
There are 0 leftover pieces.
 */

public class App {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        System.out.print("How many people? ");
        int peopleNum = input.nextInt();
        System.out.print("How many pizzas do you have? ");
        int pizzaNum = input.nextInt();
        System.out.print("How many slices per pizza? ");
        int slicesNum = input.nextInt();

        int totalSlices = pizzaNum * slicesNum;
        int slicesLeft = totalSlices % peopleNum;
        int slicePerPerson = (totalSlices-slicesLeft)/ peopleNum;


        System.out.printf("%d people with %d pizzas (%d Slices)\n", peopleNum, pizzaNum, totalSlices);
        System.out.printf("Each person gets %d pieces of pizza.\n", slicePerPerson);
        System.out.printf("There are %d leftover pieces.", slicesLeft);
    }
}
