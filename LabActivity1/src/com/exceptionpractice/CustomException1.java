package com.exceptionpractice;
class InvalidAgeException extends Exception
{
	public InvalidAgeException(String string) {
		//super(string);
	}
}

public class CustomException1 {
	static void validate(int age) throws InvalidAgeException
	{
		if(age<18)
		{
			throw new InvalidAgeException("person is not eligible for voting");
		}
		else
		System.out.println("person eligible for voting");
	}

	public static void main(String[] args) {
		try
		{
			validate(17);
		}
		catch(InvalidAgeException i)
		{
			System.out.println(i);
		}
     
	}

}
