package com.interfacelearning;
interface Vehicle
{
	int speed=100;
	void speedUp();
}
class Bicycle implements Vehicle
{
	public void speedUp()
	{
		//speed=speed+100; final in nature(constant)
		System.out.println("bicycle speed is turningup");
	}
}

public class Example1 {

	public static void main(String[] args) {
		Vehicle v=new Bicycle();
		v.speedUp();
		

		}

}
