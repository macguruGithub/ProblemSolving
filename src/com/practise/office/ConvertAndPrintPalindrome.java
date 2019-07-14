package com.practise.office;

import java.util.Scanner;

public class ConvertAndPrintPalindrome {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		StringBuilder builder = new StringBuilder();
		String inputValue = input.nextLine();
		input.close();
		String sideValues = "";
		String midValues = "";
		String addedValues = "";
		int count = 0;
		if(isPalindrone(inputValue)) {
			System.out.println(inputValue+" is can be converted into palindrone");
			for(int i=0 ; i<inputValue.length() ; i++) {
				count = 0;
				
				for(int j=0 ; j<inputValue.length() ; j++) {
					if(inputValue.charAt(i) == inputValue.charAt(j))
					count++;
				}
				if(!addedValues.contains(Character.toString(inputValue.charAt(i))))
				if(count%2 == 0) {
					int rep = count/2;
					for(int l=0 ; l<rep ; l++) {
						sideValues = sideValues+inputValue.charAt(i);
					}
				}else {
					int rep = count;
					for(int l=0 ; l<rep ; l++) {
						midValues = midValues+inputValue.charAt(i);
					}
				}
				addedValues = addedValues+(inputValue.charAt(i));
			}
			System.out.println("converted string is "+sideValues+midValues+(builder.append(sideValues).reverse()));
		}else {
			System.out.println(inputValue+" is can't be converted into palindrone");
		}
	}
	private static boolean isPalindrone(String input) {
		String inputString = input;
		char oddValue = 0 ;
		int count = 0;
		boolean isPalidrome = true;
		isPalidrome = inputString.length() != 0 ? true : false;
		if(isPalidrome)
		for(int i=0 ; i<inputString.length() ; i++) {
			count = 0;
			for(int j=0 ; j<inputString.length() ; j++) {
				if(inputString.charAt(i) == inputString.charAt(j)) {
					count++;
				}
			}
			if(count%2 != 0) {
				if(oddValue == 0 || oddValue == inputString.charAt(i)) {
					oddValue = inputString.charAt(i);
				}else {
					isPalidrome = false;
					break;
				}
			}
		}
		return isPalidrome;
	}
}
