package com.syntax.class05;

import java.util.Scanner;

public class LogicalOr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input=new Scanner (System.in);
	System.out.println("Do you have a credit card ? ");
	String answer=input.next();
	
	if(answer.equals("yes") || answer.equals("yep")||answer.equals("yeah")) {
		System.out.println("Please tell me the balance");
	}else {
		System.out.println(" Would you like to get one");
	}
	System.out.println(" end of the code");
	}
	

}
