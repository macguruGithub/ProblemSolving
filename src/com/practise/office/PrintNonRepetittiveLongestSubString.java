package com.practise.office;

public class PrintNonRepetittiveLongestSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputValue = "abbccabcdefghaa";
		int index = -1;
		boolean isFirstQueue = true;
		int l = inputValue.length();
		for (int i = 0; i < l - 1; i++) {
			index = -1;
			for (int j = i + 1; j < l; j++) {
				if (inputValue.charAt(i) == inputValue.charAt(j)) {
					index = j;
					break;
				}
			}
			if(index == -1 && isFirstQueue) {
				System.out.println(inputValue.substring(1, l));
				break;
			}else if(index == -1){
				System.out.println(inputValue);
				break;
			}
			if(inputValue.substring(0, index).length() < inputValue.substring(index, l).length()) {
				inputValue = inputValue.substring(index, l);
				l = inputValue.length();
				i = -1;
				isFirstQueue = false;
			}else {
				System.out.println(inputValue.substring(0, index));
				break;
			}
		}
	}
	

}
