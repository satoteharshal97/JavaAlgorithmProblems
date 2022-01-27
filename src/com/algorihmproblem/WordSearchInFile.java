package com.algorihmproblem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordSearchInFile {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:\\Users\\satot\\eclipse-workspace\\JavaProject\\" +
                                        "JavaAlgorithmProblems\\src\\com\\algorithmproblem\\New.txt");
        Scanner scanner = new Scanner(file);
        String fileWord = scanner.nextLine();
        System.out.println("Enter the word you want to find in list:");
        Scanner scannerOne = new Scanner(System.in);
        String userWord = scannerOne.nextLine();
        if(fileWord.contains(userWord)){
            System.out.println("Word is Found is " + fileWord);
        }
        else{
            System.out.println("Sorry!Word is not in the list");
        }
    }
}
