package Murali;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {

		double r;
		double pi = 3.14;
		double h = 0;

		Scanner s = new Scanner(System.in);
		System.out.print("Enter radius:");
		
		r = s.nextInt();
		System.out.print("Enter height:");
		h=s.nextDouble();

		double volume = pi * r * r * h / 3;
		System.out.println("Area of circle:" + volume);

	}

}
