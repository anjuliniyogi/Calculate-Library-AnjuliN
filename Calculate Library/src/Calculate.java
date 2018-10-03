import java.text.DecimalFormat;

public class Calculate {

	//returns the square of an integer, part 1 
	public static int square(int number) {
		return number*number;	
	}

	//returns the square of an integer, part 1 
	public static int cube(int number) {
		return number*number*number;	
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

	//converts an angle measure in radians into degrees, part 1
		public static double toDegrees(double r) {
			double deg = round2(r/3.14159)*180;
			return deg;	
		}
		
	//converts an angle measure in degrees to radians, part 1 
		public static double toRadians(double d) {
			double rad = round2(d/180);
			return rad;
		}
		
	//returns the discriminant after being provided a, b, c, part 1 
		public static double discriminant(double a, double b, double c) {
			double dis = ((b*b)-(4*a*c));
			return dis;
		}
		
	//returns an Improper fraction after being provided a mixed number, part 1  
		public static String toImproperFraction(int a, int b, int c) {
			String frac = a*c + b + "/" + c ;
			return frac;
		}
		
	//returns a mixed number after being provided an improper fraction, part 1 
		public static String toMixedNum(int a, int b) {
			String ans = (a/b) + "_" + (a%b) + "/" + b;
			return ans;
		}
	
	//foil method - returns a quadratic equation, part 1 
		public static String foil(int a, int b, int c, int d, String x) {
			String ans = (a*c) + x + "^2" + "+" + ((a*d)+(b*c)) + x + (b*d);
			return ans;
		}
		
		
	// returns if a number is divisible by another number, part 2
		public static boolean isDivisibleBy(int a, int b) {
			if(a<0|| b<0 ) {
				throw new IllegalArgumentException("no solution");
			}
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
	//returns the largest number of two doubles, part 2
		public static double max(double a, double b) {
	
			if(a > b) {
				return a; 
			} 
			else {
				return b; 
			}
		}
	//returns the largest number of three doubles, part 2
		public static double max(double a, double b, double c) {
					if(a > b && a > c) {
						return a; 
						} 
					else if (b > a && b > c) {
						return b; 
					}	
					else
						return c;
				}
				
	//returns the smaller value of 2 integers, part 2
		public static int maxi(int a, int b) {
					if(a > b) {
						return a; 
					} else  {
						return b; 
					}	
				}	
		
	//returns the smaller value of 2 integers, part 2
		public static int min(int a, int b) {
					if(a < b) {
						return a; 
					} else  {
						return b; 
					}	
				}	

	//returns a double rounded to two decimal places, part 2
		public static double round2(double d) {
		if (d < 0) {
			double d2 = absValue(d)*1000;
			int i = (int) d2;
			double d4 = i;
				if(i % 10 >= 5) {	
					d4 = (d4 + 10)/10; 
					int d5 = (int) d4;
					return (d5/100.0)*-1;
				}
				else {	
					d4 = d4/10; 
					int d5 = (int) d4;
					return (d5/100.0)*-1;
					}
			}
		
		else {
			double d2 = d*1000;
			int i = (int) d2;
			double d4 = i;
				if(i % 10 >= 5) {	
					d4 = (d4 + 10)/10; 
					int d5 = (int) d4;
					return d5/100.0;
				}
				else {	
					d4 = d4/10; 
					int d5 = (int) d4;
					return d5/100.0;
					}
			}
		

		}
	
	//returns the number of a number raised to the power of another number, part 3
		public static double exponent(double a, int b) {
			if(b==0) {
				throw new IllegalArgumentException("your exponent is a negative number");
			}
		double answer = a;
		for(int i = 0; i<b-1; i++)	{
			answer*=a;
			}
		return answer;
		}
	
	//returns the factorial of the number 
		public static int factorial(int n) {
			if (n < 0) {
				throw new IllegalArgumentException("the value of your input is negative");
			}
			if (n == 0)
		          return 1; 
			else 
		        return n * factorial(n-1);
		}
		
	//returns if a number is prime of not
		public static boolean isPrime(int num) {
					boolean x = true;
					boolean y = false;
						if (num <= 0) {
					throw new IllegalArgumentException ("the number is not prime" );
					}
						
				for(int i = 2; i <= num - 1; i++) {
						if (Calculate.isDivisibleBy(num, i) == true) {
							return y;
						}
					}
						return x;	
				}
		
	//returns the greatest common factor of two integers
		public static int gcf(int a, int b) {
			int done = 0;
			while ( done == 0 ) {
				int num1 = maxi(a, b);
				int num2 = min(a, b);
				a = num1 - num2;
				b = num2;
				if (a == 0) {
					return b;
				} else if (b == 0) {
					return a;
				}

			}
			return 1;
		}
		
	//returns the square root of a number to two decimal places
		public static double sqrt(double num) {
			if (num < 0 ) {
				throw new IllegalArgumentException ("the value of the input is negative"); 
			}
				
			double guess = num; 
				while ((guess*guess)-num >0.01) {
					guess = 0.5*(num/guess + guess);
				}
			return round2(guess);
			
		}
	// returns the roots of a quadratic equation
	 public static String quadForm(int x, int y, int z) {
			String result;
		 	double answer = discriminant(x, y, z);
		 if(answer < 0) {
			 throw new IllegalArgumentException("no real roots");
		 }
		 else if(answer == 0) {
			double answerNext = (answer - y)/(2*x);
			result = answerNext + " ";
			return result;
		 }
		 else  {
			 double answer1 = (-y + (sqrt(discriminant(x,y,z))))/2*x;
			 double answer2 = (-y - (sqrt(discriminant(x,y,z))))/2*x;;
				if(answer1 < answer2) {
					result = round2(answer2) + " and " + round2(answer1);
				}else {
					result = round2(answer1) + " and " + round2(answer2);
				}
			}
			return result;
		 
	 }
	
}
