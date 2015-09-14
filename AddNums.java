
public class AddNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNumber = 6;
		int secondNumber = 7;
		
		int number = addThem(firstNumber,secondNumber);
		
		System.out.println (" 6 + 7 = " + number);
		
	}



public static int addThem (int firstNumber,int secondNumber)
{
	int x = firstNumber;
	int y = secondNumber;
	
	int total = x + y;
	
	return total;
	
}
}