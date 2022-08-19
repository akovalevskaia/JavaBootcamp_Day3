package com.array_list;

import java.util.ArrayList;

public class Main {

    public static void completeFirstTsk() {
        ArrayList<String> rainbow = new ArrayList<>();
        rainbow.add("Red");
        rainbow.add("Orange");
        rainbow.add("Yellow");
        rainbow.add("Green");
        rainbow.add("Blue");
        rainbow.add("Indigo");
        rainbow.add("Violet");

        System.out.println("The order of colors of the rainbow: ");
        System.out.println(rainbow.toString().replaceAll("[\\[\\]]", ""));
    }

    public static void iterateAndReverse() {
        ArrayList<Integer> yearsOfOrbitalLaunches = new ArrayList<>();
        yearsOfOrbitalLaunches.add(1957);
        yearsOfOrbitalLaunches.add(1958);
        yearsOfOrbitalLaunches.add(1965);
        yearsOfOrbitalLaunches.add(1970);
        yearsOfOrbitalLaunches.add(1970);
        yearsOfOrbitalLaunches.add(1971);
        yearsOfOrbitalLaunches.add(1979);
        yearsOfOrbitalLaunches.add(1980);
        yearsOfOrbitalLaunches.add(1988);
        yearsOfOrbitalLaunches.add(1991);
        yearsOfOrbitalLaunches.add(1992);
        yearsOfOrbitalLaunches.add(2009);
        yearsOfOrbitalLaunches.add(2012);
        yearsOfOrbitalLaunches.add(2022);

        //Iterating through the Array list
        System.out.println("Years of orbital launches:");
        for(Integer value: yearsOfOrbitalLaunches) {
            System.out.print(value + ", ");
        }
        System.out.println();
        //Reversing the ArrayList
        System.out.println("Print years of orbital launches from today to the past:");
        ArrayList<Integer> reversedArrLst = new ArrayList<>();
        for (int i = yearsOfOrbitalLaunches.size() - 1; i >= 0; i--) {
            reversedArrLst.add(yearsOfOrbitalLaunches.get(i));
        }
        System.out.println(reversedArrLst.toString().replaceAll("[\\[\\]]", ""));
    }

    public static void insertElement() {
        ArrayList<String> myTopListOfAnime = new ArrayList<>();
        myTopListOfAnime.add("Beck");
        myTopListOfAnime.add("Code Geass");
        myTopListOfAnime.add("Great Teacher Onizuka");
        myTopListOfAnime.add("Initial D");
        System.out.println("My top anime list:");
        System.out.println(myTopListOfAnime.toString().replaceAll("[\\[\\]]", ""));
        System.out.println("Oops, I forgot to mention the favorite one");
        myTopListOfAnime.add(0, "Fullmetal Alhemist");
        System.out.println("Now it's perfect anime list:");
        System.out.println(myTopListOfAnime.toString().replaceAll("[\\[\\]]", ""));

    }

    public static void main(String[] args) {

        //Task1 Write a Java program to create a new array list, add some colors (string) and print out the collection.
        completeFirstTsk();

        //Task2 Write a Java program to iterate through all elements in an array list.
        //Task11 Write a program to reverse elements in a array list.
        iterateAndReverse();

        //Task3 White a Java program to insert an element into the array list at the first position.
        insertElement();

    }
}
