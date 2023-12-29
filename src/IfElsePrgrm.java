
public class IfElsePrgrm {

	public static void main(String[] args) {
		
	//1.b : Find out the greatest number out of four different given numbers:
		/*int a=25;
		int b=78;
		int c=87;
		int d=100;
		
		if (a>b && a>c && a>d)
			System.out.println(a + " is the greatest among " + a + " " + b + " " + c + " "+ d);
		else if (b>a && b>c && b>d)
			System.out.println(b + " is the greatest among " + a + " " + b + " " + c + " "+ d);
		else if (c>a && c>b && c>d)
			System.out.println(c + " is the greatest among " + a + " " + b + " " + c + " "+ d);
		else 
			System.out.println(d + " is the greatest among " + a + " " + b + " " + c + " "+ d);
		*/
		
	//2. Write a Java program to test a number is positive or negative
int num1= 35;
int num2= 11;

if (num1>0)
	{
	if(num2>0) {
	System.out.println("Both num1 = "+num1+" and num2 = "+num2+" are positive");
	}
	else
	System.out.println("num1 = "+num1+" is positive and num2 ="+num2+" is negative");
	}
else 
	System.out.println("Both num1 = "+num1+" and num2 = "+num2+" are negative");

	}}
