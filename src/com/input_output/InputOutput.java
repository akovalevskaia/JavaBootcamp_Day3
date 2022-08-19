package com.input_output;

import java.io.File;
import java.util.Arrays;
import java.util.Date;


public class InputOutput {
    public static void main(String[] args) {

        //Task1 Write a Java program to get a list of all file/directory names from the given.
        System.out.println("Printing content of directory: ");
        File file = new File("src/com/input_output/data");
        System.out.println(Arrays.toString(file.list()).replaceAll("[\\[\\]]", ""));
        //Task2 Write a Java program to get specific files by extensions from a specified folder.
        System.out.println("Printing files with specific extensions: ");
        String[] setOfFiles = file.list();
        if (setOfFiles != null) {
            for(String extension: setOfFiles) {
                if (extension.endsWith(".txt")) {
                    System.out.print(extension + " ");
                }
            }
        }
        System.out.println();
        //Task3 Write a Java program to check if a file of directory specified by pathname exists or not.
        System.out.println("Exists: " + file.exists());
        //Task4 Write a Java program to check if a file or directory has read and write permission.
        assert file.isFile() && file.exists();
        System.out.println("Permission of writing: " + file.canWrite());
        System.out.println("Permission of reading: " + file.canRead());
        //Task5 Write a Java program to check if given pathname is a directory or a file.
        System.out.println("File path: " + file.getParent());
        //Task6 Write a Java program to compare two files lexicographically.
        System.out.println("Comparison of ");
        File file1 = new File("src/com/input_output/data/blink182_i_miss_you.txt");
        File file2 = new File("src/com/input_output/data/Funny_story");
        if (file1.compareTo(file2) == 0) {
            System.out.println("Equal.");
        } else {
            System.out.println("Not equal: " + file1.compareTo(file2));
        }
        //Task7 Write a Java program to get last modified time of a file.
        Date date = new Date(file2.lastModified());
        System.out.println("Last modified time: " + date);

    }
}

