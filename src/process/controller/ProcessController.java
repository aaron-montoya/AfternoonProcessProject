package process.controller;

import process.model.PlayDohCircle;
import process.model.PlayDohNoodle;
import java.util.Scanner;

public class ProcessController
{
	public void start()
	{
		//Print Line
		System.out.println("This is a practice project");
		System.out.println("By practicing I develop muscle memory :D");
		
		//Make circles
		PlayDohCircle first_circle = new PlayDohCircle();
		PlayDohCircle second_circle;
		second_circle = new PlayDohCircle();
		
		//Show circles
		System.out.println("Look I made circles");
		System.out.println(first_circle);
		System.out.println(second_circle);
		
		//Use Scanner to get circle_size
		Scanner myScanner = new Scanner(System.in);
		System.out.println("How big of a circle do you want?");
		int circle_size = myScanner.nextInt();
		
		//Use circle_size to make a third circle
		PlayDohCircle third_circle = new PlayDohCircle(circle_size);
		System.out.println(third_circle);
		
		System.out.println("What size should we change it to?");
		int updated = myScanner.nextInt();
		third_circle.setSize(updated);
		System.out.println("The circle now is...");
		System.out.println(third_circle);
		
		//Make Noodles
		System.out.println("I made noodles!");
		PlayDohNoodle first_noodle = new PlayDohNoodle();
		PlayDohNoodle second_noodle = new PlayDohNoodle(50);
		
		//Show Noodles
		System.out.println(first_noodle);
		System.out.println(second_noodle);
	}
}
