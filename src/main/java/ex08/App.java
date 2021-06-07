package ex08;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Naomi Palm
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
