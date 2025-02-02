package com.exception;

import java.util.Scanner;

class CustomException extends Exception
{
	public CustomException(String message)
	{
		super(message);
	}
}


public class custommException {

	public static void main(String[] args) {
						Scanner scan=new Scanner(System.in);
						try {
							System.out.println("Enter a number between 1 and 10: ");
							int number=scan.nextInt();
							if(number<1 || number>10){
								throw new CustomException("Invalid Number: "+number);
							}
							else{
								System.out.println("You entered a valid number: "+number);
							}
						}
						catch(CustomException e){
							System.out.println("CustomException caught: "+e.getMessage());
						}
						finally {
							System.out.println("This is the finally block");
						}
					}
	
	

}
