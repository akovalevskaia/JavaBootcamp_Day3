package com.input_output;

import java.io.File;
import java.util.Arrays;


public class InputOutput {
    public static void main(String[] args) {

        //Task1 Write a Java program to get a list of all file/directory names from the given.
        System.out.println("Printing content of directory: ");
        File file = new File("src/com/input_output/data");
        System.out.println(Arrays.toString(file.list()).replaceAll("[\\[\\]]", ""));
        //Task2 Write a Java program to get specific files by extensions from a specified folder
        System.out.println("Printing files with specific extensions: ");
        String[] setOfFiles = file.list();
        if (setOfFiles != null) {
            for(String extension: setOfFiles) {
                if (extension.endsWith(".txt")) {
                    System.out.print(extension + " ");
                }
            }
        }

        
    }
}

