
public class DataTypes {

	public static void main(String[] args) {
		//1. Write a Java program to add two strings: String a = “Hello”; String b = “Naveen K”
				String a = "Hello";
		String b = "Sangita P";
		String c = a+" "+b;
		System.out.println("1. Add 2 strings a and b = " + c);
		System.out.println("************************************************************");
		
		//2. Write a Java program to print the sum of two numbers. Test Data: 74 + 36 Expected Output: 110
		int x=74;
		int y=36;
		int z=x+y;
		System.out.println("2. sum of two numbers x and y = " + z);
		System.out.println("************************************************************");
		
		//3. Write a Java program to print the division of two numbers. k = 50/3
		int k=50/3;
		System.out.println("3. division of two numbers=" + k);
		System.out.println("************************************************************");
		
		//4. Write a Java program to compute the specified expressions and print the output. Go to the editor. Test Data:((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) 
		
		double num = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
		System.out.println("4. Expression output = " + num);
		System.out.println("************************************************************");
		
		//5. Try to concat "Hello Selenium" with a character 't'.
		String s1 ="Hello Selenium";
		System.out.println("5." + s1 +" "+ "t" );
		System.out.println("************************************************************");
		
		/*6. Create three int variables having values like : 100, 200, 3400. 
		Add them and concatenate and generate this output String : 
		"Your Total  amount is: 3700".*/
		int p=100;
		int q=200;
		int r=3400;
		System.out.println("6. Your Total  amount is:"+ (p+q+r));
		System.out.println("************************************************************");
		
		// 7. Print the ASCII value of the character 'h'.
		int h = 'h';
		System.out.println(" 7. ASCII value of char h is - "+ (byte)h );
		System.out.println("************************************************************");
		
		//8. Write a program to add 3 to the ASCII value of the character 'd' and print the equivalent character.
		char ch ='d';
		int res = ch+3;
		System.out.println("ASCII value of char d is - "+ ((byte)ch) );
		System.out.println("Adding 3 to ASCII value of d = " + res);
		System.out.println("8. Character with ASCII value of "+ res + " is "+ (char)res);
		System.out.println("************************************************************");
		
		//9. Write a program to find the square of the number 3.9.
		float f= 3.9f;
		float square = f*f;
		System.out.println("9. square of the number 3.9=" + square);
		System.out.println("************************************************************");
				
		
		
		
		
		
		
	}

}
