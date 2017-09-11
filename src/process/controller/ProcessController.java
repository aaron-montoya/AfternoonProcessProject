package process.controller;

import process.model.PlayDohCircle;

public class ProcessController
{
	public void start()
	{
		System.out.println("This is a practice project");
		System.out.println("By practicing I develop muscle memory :D");
		
		PlayDohCircle firstCircle = new PlayDohCircle();
		PlayDohCircle secondCircle;
		secondCircle = new PlayDohCircle();
		
		System.out.println("Look I made a circle");
		System.out.println(firstCircle);
		System.out.println(secondCircle);
	}
}
