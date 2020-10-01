package edu.ben.cmsc2200.lab3;

import java.util.Scanner;

public class SingleCharacter {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a single character: ");
		System.out.println("Ex: 'A', '2', 'f' ");
		String entry = input.next();

		/*
		 * If user enters anything more than 1 character program will tell user that it
		 * is an invalid input
		 */
		if (entry.length() > 1) {
			System.out.println(entry + " " + "is an invalid input");
		} else {
			// All the cases for the Vowels in Upper case and Lower Case

			switch (entry) {

			case "A":
			case "E":
			case "I":
			case "O":
			case "U":
			case "a":
			case "e":
			case "i":
			case "o":
			case "u":
				System.out.println(entry + " " + "is a Vowel");
				break;

			// All the case for the numbers

			case "0":
			case "1":
			case "2":
			case "3":
			case "4":
			case "5":
			case "6":
			case "7":
			case "8":
			case "9":
				System.out.println(entry + " " + "is a Number");
				break;

			/*
			 * If the users input is not a vowel or a number default case will be in play
			 */

			default:
				System.out.println(entry + " " + "is a Consonant");
			}
		}
	}
}