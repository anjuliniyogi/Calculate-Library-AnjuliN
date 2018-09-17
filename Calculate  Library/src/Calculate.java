//this class contains the method to do various math related tasks
//Anjuli Niyogi - CompSci 2nd period
//@version 0 September 6, 2018

public class Calculate {
	
	//returns the square of an integer, part 1 
	public static int square(int number) {
	return number*number;	
	}
	
	
	//returns the cube of an integer, part 1
	public static int cube(int numb) {
	return numb*numb*numb;
	}
	
	
	//returns the average of two numbers, part 1
	public static double  average(double a, double b) {
		return (a+b)/2;
	}
	
	
	//returns the average of three numbers, part 1
	public static double  average(double a, double b, double c) {
		double sum =  a + b + c;
		return sum/3.0;
	}
	
	
	// returns if a number is divisible by another number, part 2
	public static boolean isDivisibleBy(int a, int b) {
			boolean ok = true;
			boolean no = false;
		if(a % b == 0) {
			return ok; }
		else {
			return no; }
	}
	
	
	//returns the absolute value of a number, part 2
	public static double absValue(double a) {
		if( a < 0) {
			return (a * -1); }
		else { 
			return a; }
	}
	/*
	//returns the largest number of two doubles, part 2
	public static double max(double a, double b) {
		if(a > b) {
			return a; }
		if(b > a) {
			return b; }
		if(a == b) {
				System.out.println(a + "is equivalent to" + b);		}	
			}	
		*/
}



