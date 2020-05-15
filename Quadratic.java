// Java program to find roots 
//of a quadratic equation 

import static java.lang.Math.*;

import java.util.Scanner; 
class Quadratic 
{ 

	// Prints roots of quadratic 
	//equation ax * 2 + bx + x 
	void findRoots(int a, int b, int c) 
	{ 
	// If a is 0, then equation is not	 
	//quadratic, but linear 
	
	if (a == 0) 
	{ 
		System.out.println("Invalid"); 
		return; 
	} 

	int d = b*b - 4*a*c; //Finding Discriminant
	float sqrt_val = (float) sqrt(abs(d)); 
	if(d==0) {
		System.out.println((float)(-b + sqrt_val) / (2 * a) );
	}
	else if (d > 0) 
	{ 
		float one = (float)(-b + sqrt_val) / (2 * a);
		float two = (float)(-b - sqrt_val) / (2 * a);
		//System.out.println("Roots are real and different \n"); For Detailed Explanation
		if(one>two) {
			System.out.println(one);
			System.out.println(two);
		}
		else {
			System.out.println(two);
			System.out.println(one);
		}
		
	} 
	else // d < 0 
	{ 

		System.out.println("No Real Solutions"); 
	} 
	} 

public static void main(String args[]) 
	{ 
	Quadratic obj = new Quadratic(); 
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter Values : ");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c= sc.nextInt(); 
	obj.findRoots(a, b, c); 
	} 
} 

