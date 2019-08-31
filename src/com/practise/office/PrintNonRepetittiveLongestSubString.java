package com.practise.office;

public class PrintNonRepetittiveLongestSubString {
	public static void main(String[] args) {
		String input = "abcd";
		//System.out.println(input.substring(1,2));
		String output = "";
		for(int i=0 ; i<input.length() ; i++){
			for(int j=i+1 ; j<=input.length() ; j++){
				String value = input.substring(i,j);
				if(value.length() < input.length() && !hasDuplicates(value) && value.length() > output.length()){
					output = value;
				}
			}
		}
		System.out.println(output);
	}
	
	
	public static boolean hasDuplicates(String input){
		boolean hasDuplicate = false;
		for(int i=0 ; i<input.length() ; i++){
			for(int j=i+1 ; j<input.length() ; j++){
				if(input.charAt(i) == input.charAt(j)){
					hasDuplicate = true;
					break;
				}
			}
			if(hasDuplicate){
				break;
			}
		}
		return hasDuplicate;
	}
}
