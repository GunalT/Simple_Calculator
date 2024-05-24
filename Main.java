import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner= new Scanner(System.in);
	
		while(true) {
			
			System.out.println("Simple Calculator");
			System.out.println("Choose an Operation");
			System.out.println("1.ADDITION");
			System.out.println("2.SUBTRACTION");
			System.out.println("3.MULTIPLICATION");
			System.out.println("4.DIVISION");
			System.out.println("5.EXIT");
			
			
			int choice= scanner.nextInt();
			
			if(choice==5) {
				System.out.println("Exiting.......");
				
				break;
			}
		
		
		
		System.out.println("Enter num1: ");
		double num1= scanner.nextInt();
		
		System.out.println("Enter num2: ");
		double num2= scanner.nextInt();
		
		double result;
		
		
		switch(choice) {
		
		case 1:
			result=num1+num2;
			System.out.println("Result: "+ result);
			break;
		
		
		case 2:
			result=num1-num2;
			System.out.println("Result: "+result);
			break;
		
		case 3:
			
			result=num1*num2;
			System.out.println("Result: "+result);
			break;
		
		case 4:
			if(num2!=0) {
				result=num1/num2;
				System.out.println("Result: "+result);
			}
			else {
				System.err.println("Division by zero error");
			}
			break;
			
			default:
				
				System.out.println("Invalid choice, select a valid choice!");
				break;
			}
		
		
			
	
	
		System.out.println();
	}
	
	scanner.close();
	}
	
}



