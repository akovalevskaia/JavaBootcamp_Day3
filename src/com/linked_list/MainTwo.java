package com.linked_list;

import java.util.LinkedList;

public class MainTwo {

    public static void appendElement(LinkedList<String> animals) {
        animals.addLast("Snake");
        System.out.println("LinkedList: " + animals.toString().replaceAll("[\\[\\]]", ""));
    }

    public static void iterate(LinkedList<String> animals) {
        for(String value: animals) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void iterateFromSpecPos(LinkedList<String> animals) {
        for (int i = 4; i < animals.size(); i++) {
            System.out.print(animals.get(i) + " ");
        }
    }

    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<>();
        animals.add("Bear");
        animals.add("Leopard");
        animals.add("Gorilla");
        animals.add("Fox");
        animals.add("Lion");
        animals.add("Elephant");
        animals.add("Tiger");
        animals.add("Crocodile");
        System.out.println("LinkedList: " + animals.toString().replaceAll("[\\[\\]]", ""));

        //Task1 Write a Java program to append the specified element to the end of a linked list.
        System.out.println("After appending to the end: ");
        appendElement(animals);

        //Task2 Write a Java program to iterate through all elements in a linked list.
        System.out.println("Iteration over the Linked List:");
        iterate(animals);


        //Task4 Write a Java program to iterate through all elements in a linked list starting at the specified position.
        System.out.println("Iteration from specified element: ");
        iterateFromSpecPos(animals);

    }
}
