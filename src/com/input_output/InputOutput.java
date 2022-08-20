package com.input_output;

import java.io.*;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;


public class InputOutput {
    public static void main(String[] args) throws IOException {

        //Task1 Write a Java program to get a list of all file/directory names from the given.
        System.out.println("Printing content of directory: ");
        File file = new File("src/com/input_output/data");
        System.out.println(Arrays.toString(file.list()).replaceAll("[\\[\\]]", ""));
        //Task2 Write a Java program to get specific files by extensions from a specified folder.
        getSpecificFile(file);
        //Task3 Write a Java program to check if a file of directory specified by pathname exists or not.
        System.out.println("Exists: " + file.exists());
        //Task4 Write a Java program to check if a file or directory has read and write permission.
        System.out.println("Permission for writing: " + file.canWrite());
        System.out.println("Permission for reading: " + file.canRead());
        //Task5 Write a Java program to check if given pathname is a directory or a file.
        System.out.println("File path: " + file.getPath());
        //Task6 Write a Java program to compare two files lexicographically.
        System.out.println("Comparison of files:");
        File file1 = new File("src/com/input_output/data/blink182_i_miss_you.txt");
        File file2 = new File("src/com/input_output/data/Funny_story");
        compareTwoFiles(file1, file2);
        //Task7 Write a Java program to get last modified time of a file.
        Date date = new Date(file1.lastModified());
        System.out.println("Last modified time: " + date);
        //Task8  Write Java program to read input from java console.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter something: ");
        System.out.println(reader.readLine());
        //Task9 Write a Java program to get file size in bytes, kb, mb.
        getSize(file);
        //Task10 Write a Java program to read contents from a file into byte array.
        readFromByte(file1);
        //Task11 Write a Java program to read a file content line by line.
        File file3 = new File("src/com/input_output/data/Simple_Man_LynyrdSkynyrd");
        FileReader fileReader = new FileReader(file3); //reads the file
        BufferedReader bufferedReader = new BufferedReader(fileReader);// creates a buffering character input stream
        StringBuffer stringBuffer = new StringBuffer(); // constructs a string buffer with no characters
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            stringBuffer.append(line);
            stringBuffer.append("\n");
        }
        fileReader.close(); // close the stream to avoid memory leakage
        System.out.printf("Contents of file:%n %s", stringBuffer);

        //Task12 Write a Java program to read a plain text file.
        File file4 = new File("src/com/input_output/data/Coldplay_Scientist.txt");
        System.out.println("Reading text file: ");
        System.out.println(new String(Files.readAllBytes(file4.toPath())));
        //Task13 13. Write a java program to read a file line by line and store it into a variable.
        //Task14 Write a Java program to store file content line by line into an array.
        FileReader fileReader2 = new FileReader(file2); //reads the file
        BufferedReader bufferedReader2 = new BufferedReader(fileReader2);// creates a buffering character input stream
        StringBuffer stringBuffer2 = new StringBuffer(); // constructs a string buffer with no characters
        String line2;
        while ((line2 = bufferedReader2.readLine()) != null) {
            stringBuffer2.append(line2);
            stringBuffer2.append("\n");
        }
        bufferedReader2.close(); // close the stream to avoid memory leakage
        line2 = stringBuffer2.toString();
        String[] arrayOfLines = line2.split("\n");
        System.out.println("Print from array: ");
        System.out.println(Arrays.toString(arrayOfLines).replaceAll("[\\[\\]]", ""));

        //Task17 Write a Java program to read first 3 lines from a file.
        FileReader fr = new FileReader(file3);
        BufferedReader br = new BufferedReader(fr);
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < 3; i++) {
            String textOfLine = br.readLine();
            stringBuilder.append(textOfLine);
            stringBuilder.append("\n");
        }
        br.close();
        System.out.println("Print three first line: ");
        System.out.println(stringBuilder);

        //Task16 write a Java program to append text to an existing file
        appendText(file3);
        //Task18 Write a Java program to find the longest word in a text file.
        findTheLongestWord(file3);
    }

    public static void appendText(File file3) throws IOException {
        FileWriter fileWriter = new FileWriter(file3, true);
        String sequenceOfWords = "I like apple\n";
        fileWriter.write(sequenceOfWords);
        fileWriter.close();

    }

    public static void readFromByte(File file1) throws IOException {
        FileInputStream justFile = new FileInputStream(file1);
        byte[] arr = new byte[(int) file1.length()];
        justFile.read(arr); // reading file content to byte array
        System.out.println(Arrays.toString(arr)); // content of file in bytes
        System.out.println(new String(arr)); // content of file
        justFile.close(); // to avoid memory leakage
    }

    public static void getSize(File file) {
        long bytes = file.length();
        System.out.println("Size in bytes: " + bytes);
        long kb = bytes / 1024;
        System.out.println("Size in kb: " + kb);
        long mb = kb / 1024;
        System.out.println("Size in mb: " + mb);
    }

    public static void compareTwoFiles(File file1, File file2) {
        if (file1.compareTo(file2) == 0) {
            System.out.println("Equal.");
        } else {
            System.out.println("Not equal: " + file1.compareTo(file2));
        }
    }

    public static void getSpecificFile(File file) {
        System.out.println("Printing files with specific extensions: ");
        String[] setOfFiles = file.list();
        if (setOfFiles != null) {
            for (String extension : setOfFiles) {
                if (extension.endsWith(".txt")) {
                    System.out.print(extension + " ");
                }
            }
        }
        System.out.println();
    }

    public static void findTheLongestWord(File file3) throws IOException {
        Scanner scanner = new Scanner(file3);
        String longestWord = "";
        while(scanner.hasNext()) {
            String tempo = scanner.next();
            if(tempo.length() >= longestWord.length()) {
                longestWord = tempo;
            }
        }
        System.out.printf("The longest word of %s: %s", file3.getName(), longestWord);

    }
}

