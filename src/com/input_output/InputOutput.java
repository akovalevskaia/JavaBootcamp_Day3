package com.input_output;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Date;


public class InputOutput {
    public static void main(String[] args) throws IOException {

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
        System.out.println("Permission for writing: " + file.canWrite());
        System.out.println("Permission for reading: " + file.canRead());
        //Task5 Write a Java program to check if given pathname is a directory or a file.
        System.out.println("File path: " + file.getPath());
        //Task6 Write a Java program to compare two files lexicographically.
        System.out.println("Comparison of files:");
        File file1 = new File("src/com/input_output/data/blink182_i_miss_you.txt");
        File file2 = new File("src/com/input_output/data/Funny_story");
        if (file1.compareTo(file2) == 0) {
            System.out.println("Equal.");
        } else {
            System.out.println("Not equal: " + file1.compareTo(file2));
        }
        //Task7 Write a Java program to get last modified time of a file.
        Date date = new Date(file1.lastModified());
        System.out.println("Last modified time: " + date);
        //Task8  Write Java program to read input from java console.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter something: ");
        System.out.println(reader.readLine());
        //Task9 Write a Java program to get file size in bytes, kb, mb.
        long bytes = file.length();
        System.out.println("Size in bytes: " + bytes);
        long kb = bytes / 1024;
        System.out.println("Size in kb: " + kb);
        long mb = kb / 1024;
        System.out.println("Size in mb: " + mb);
        //Task10 Write a Java program to read contents from a file into byte array.
        
    }
}

