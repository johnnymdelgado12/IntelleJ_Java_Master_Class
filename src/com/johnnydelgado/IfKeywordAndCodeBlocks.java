package com.johnnydelgado;
import java.util.Scanner;


public class IfKeywordAndCodeBlocks {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Would you like to code?");
        String userInput = scanner.next();

        if(userInput.equals("y")){
            System.out.println("Let's get to coding!");
        } else if (userInput.equals("n")){
            System.out.println("Well that sucks :(");
        } else{
            System.out.println("I'm sorry, that is an unacceptable answer");
            System.out.println("Would you like to code?");
            userInput = scanner.next();
        }
    }
}
