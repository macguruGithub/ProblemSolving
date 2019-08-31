package com.practise.office;

public class VersionCheck {

	public static void main(String[] args) {
		String v1 = "4.0.0.0.0.0.0";
		String v2 = "0";
		String[] v1Arr = v1.split("\\.");
		String[] v2Arr = v2.split("\\.");
		int i=0, j=0;
		boolean flag = true;
		
		while(i < v1Arr.length && j < v2Arr.length){
			if(Integer.parseInt(v1Arr[i]) < Integer.parseInt(v2Arr[j])){
				System.out.println("U");
				flag = false;
				break;
			}else if(Integer.parseInt(v1Arr[i]) > Integer.parseInt(v2Arr[j])){
				System.out.println("D");
				flag = false;
				break;
			}
			i++;
			j++;
		}
		if (flag)
			while (i < v1Arr.length) {
				if (Integer.parseInt(v1Arr[i]) > 0) {
					System.out.println("D");
					flag = false;
					break;
				}
				i++;
			}
		if (flag)
		while (j < v2Arr.length) {
			if (Integer.parseInt(v1Arr[i]) > 0) {
				System.out.println("U");
				flag = false;
				break;
			}
			j++;
		}
		if(flag){
			System.out.println("E");
		}
	}

}
