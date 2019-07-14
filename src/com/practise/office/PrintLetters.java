package com.practise.office;

public class PrintLetters {
	public static void main(String[] args) {
		String inputValue = "abc10Z2**1";
		String repCount = "";
		String repValue = "";
		boolean isdigit = false;
		boolean isFirstQueue = true;
		for (int i = 0; i < inputValue.length(); i++) {
			isdigit = Character.isDigit(inputValue.charAt(i));
			if (isdigit && !isFirstQueue) {
				repCount = repCount + inputValue.charAt(i);
				if (!(inputValue.length() == i + 1))
					continue;
			} else if (!isdigit) {
				if (repCount.equalsIgnoreCase("")) {
					repValue = repValue + inputValue.charAt(i);
					isFirstQueue = false;
				}
			}
			if (!repValue.equalsIgnoreCase("") && !repCount.equalsIgnoreCase("")) {
				for (int l = 0; l < Integer.parseInt(repCount); l++) {
					System.out.print(repValue);
				}
				repValue = Character.toString(inputValue.charAt(i));
				repCount = "";
			}
		}
	}
}
