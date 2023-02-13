package com.userid.available;

import java.util.ArrayList;
import java.util.Scanner;

public class USerEmailID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the email ID to search");
		String s=sc.next();
		searchemailId(s);
		sc.close();

	}

	private static void searchemailId(String s) {
		ArrayList<String> s1=availableEmailids();
		boolean exist=false;
		for(String arraystring:s1)
		{
			if(arraystring.equalsIgnoreCase(s))
			{
				exist=true;
				System.out.println("email id is available in the list");
			}
			
			
		}
		if(!exist)
			System.out.println("email id is not available in the list");
		
	}

	private static ArrayList<String> availableEmailids() {
		ArrayList<String> ids=new ArrayList<>();
		ids.add("soujanyakrishna18@gmail.com");
		ids.add("krishnamohanpatnam@gmail.com");
		ids.add("krishnasowjanyag@gmail.com");
		ids.add("krishna.sowjanya2gmail.com");
		return ids;
	}

}
