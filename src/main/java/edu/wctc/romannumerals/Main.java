package edu.wctc.romannumerals;
import java.util.Scanner;
import static edu.wctc.romannumerals.romanNumerals.intToRoman;

public class Main {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter a number to convert");
        int number = Integer.parseInt(myObj.nextLine());

        System.out.println(intToRoman(number));


    }
}
