package application;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("word: ");
        String word = scanner.next();

        StringBuilder stringBuilder = new StringBuilder(word);
        String reversedString = stringBuilder.reverse().toString();

        if (word.equals(reversedString)){
            System.out.print("THE WORD " +  "'" + word + "'" +" IS A PALINDROME!");
        }
        else {
            System.out.print("THE WORD " +  "'" + word + "'" + " IS NOT A PALINDROME!");
        }

    }
}
