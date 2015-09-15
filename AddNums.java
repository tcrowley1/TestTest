// Basic Test Class used for GitHub -- Will eventually lead to fully functioning programs

/*@Author Terrence Crowley
		  09-15-2015
*/

public class AddNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNumber = 6;
		int secondNumber = 7;
		int thirdNumber = 10;
		
		int number = addThem(firstNumber,secondNumber);
		int mult = multThem(firstNumber,secondNumber);
		double div = divThem(firstNumber,secondNumber);
		double both = doStuff(firstNumber,secondNumber,thirdNumber);
		
		
		System.out.println("This is a test for the addThem method");
		System.out.println (" 6 + 7 = " + number);
		
		System.out.println("\n");
		
		System.out.println("This is a test for the multThem method");
		System.out.println (" 6 * 7 = " + mult);
		
		System.out.println("\n");
		
		System.out.println("This is a test for the divThem method");
		System.out.println(" 6 / 7 = " + div);
		
		
		System.out.println("\n");
		
		System.out.println("This is a test for the divThem method");
		System.out.println(" 6 / 7 = " + both);
		
		
	}



public static int addThem (int firstNumber,int secondNumber)
{
	int x = firstNumber;
	int y = secondNumber;
	
	int total = x + y;
	
	return total;
	
}


public static int multThem (int firstNumber,int secondNumber)
{
	int x1 = firstNumber;
	int y1 = secondNumber;
	
	int total1 = x1 * y1;
	
	return total1;
	
}

public static double divThem (int firstNumber, int secondNumber)
{
	double x3 = firstNumber;
	double y3 = secondNumber;
	
	double div = x3/y3;
	
	return div;
}

public static double doStuff (int firstNumber, int secondNumber, int thirdNumber)
{
	double x4 = firstNumber;
	double y4 = secondNumber;
	double z = thirdNumber;
	
	double thing = (x4 + y4 )/z;
	
	return thing;
	
}

}