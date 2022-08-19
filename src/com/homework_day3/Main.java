package com.homework_day3;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //Task1 Write a Java program to create a new array list, add some colors (string) and print out the collection.
        ArrayList<String> rainbow = new ArrayList<>();
        rainbow.add("Red");
        rainbow.add("Orange");
        rainbow.add("Yellow");
        rainbow.add("Green");
        rainbow.add("Blue");
        rainbow.add("Indigo");
        rainbow.add("Violet");

        System.out.println("The order of colors of the rainbow: ");
        System.out.println(rainbow.toString().replaceAll("\\[", "").replaceAll("\\]", ""));
    }
}
