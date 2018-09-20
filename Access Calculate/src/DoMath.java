
public class DoMath {

	public static void main(String[] args) {
		
		
		//returns the square of an integer, part 1 
		System.out.println(Calculate.square(3));
		
		//returns the square of an integer, part 1 		
		System.out.println(Calculate.cube(4));
		
		//returns the average of two numbers, part 1		
		System.out.println(Calculate.average(3,5));
		
		//returns the average of three numbers, part 1		
		System.out.println(Calculate.average(6,7,8));

		//converts an angle measure in radians into degrees
		System.out.println(Calculate.toDegrees(6.28318));
		
		//converts an angle measure in degrees to radians
		System.out.println(Calculate.toRadians(240) + " * pi");
		
		//returns the discriminant after being provided a, b, c
		System.out.println(Calculate.discriminant(1,5,6));
		
		//returns an Improper fraction after being provided a mixed number 
		System.out.println(Calculate.toImproperFraction(3, 1, 2));
		
		//returns a mixed number after being provided an improper fraction
		System.out.println(Calculate.toMixedNum(7, 2));
		
		//foil method - returns a quadratic equation, part 1 
		System.out.println(Calculate.foil(2, 3, 6, -7, "x"));
		
		// returns if a number is divisible by another number, part 2
		System.out.println(Calculate.isDivisibleBy(21, 7));
		
		//returns the absolute value of a number, part 2
		System.out.println(Calculate.absValue(-5));
		
		//returns the largest number of two doubles, part 2
		System.out.println(Calculate.max(4,21));
		
		//returns the largest number of three doubles, part 2
		System.out.println(Calculate.max(4, 5, 3));
		
		//returns the smaller value of 2 integers
		System.out.println(Calculate.min(3, 7));
		
		//returns a double rounded to two decimal places
		System.out.println(Calculate.round2(4.233));
		//returns the number of a number raised to the power of another number 
		System.out.println(Calculate.exponent(2, 4));
		
		//returns the factorial of the number 
		System.out.println(Calculate.factorial(4));
		
		//returns if a number is prime of not
			System.out.println(Calculate.isPrime(6));
			
		//returns the greatest common factor of two integers
			System.out.println(Calculate.gcf(64,32));

		//returns the square root of a number rounded to two decimal places
			System.out.println(Calculate.sqrt(64));
		
		
		
		
	
	}

}
