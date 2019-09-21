import java.util.*;

public class Faerman_p2 {

	public static void main(String[] args) {
		double pounds;
		double inches;
		double kilograms;
		double meters;
		double bmi = 0;
		
		Scanner scnr =new Scanner(System.in);
		
		System.out.println("Choose option (1 or 2) for inputs height and weight:");
		System.out.println("1. Pounds and Inches");
		System.out.println("2. Kilograms and Meters");
		
		int dec = scnr.nextInt();
		
		switch(dec){
		
		case 1:
		System.out.println("Enter weight in pounds :");
		pounds = scnr.nextDouble();
		System.out.println("Enter height in inches :");
		inches = scnr.nextDouble();
		bmi = 703*pounds / (inches*inches);
		break;
		case 2:
		System.out.println("Enter weight in kilograms:");
		kilograms = scnr.nextDouble();
		System.out.println("Enter height in meters:");
		meters = scnr.nextDouble();
		bmi = kilograms / (meters*meters);
		break;
		  
		default:
		System.out.println("invalid choice");
		break;
		}
		
		if( bmi <= 18.5)
		System.out.println("BMI is less than 18.5 means: UnderWeight");
		else if(bmi <= 24.9)
		System.out.println("BMI between 18.5 and 24.9 means: Healthy");
		else if(bmi <= 29.9)
		System.out.println("BMI between 25 TO 29.9 means: Overweight");
		else
		System.out.println("BMI greater than or equal to 30.0 means: obese");
		scnr.close();	
	}	

}
