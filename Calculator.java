import java.util.Scanner;

 
public class Calculator {
 
    public static void main(String[] args) {
       
	   int rep;
	   do{
        Scanner inData = new Scanner(System.in);
		
		int firstNum, secondNum, resolt;
		String chsOperation;
		
		
		System.out.print("Enter your first number: ");
		firstNum = inData.nextInt();
		
		
		System.out.print("\nEnter your second number: ");
		secondNum = inData.nextInt();
		
		
		System.out.print("\nOperation \n+ \n- \n* \n/ \nChoose: ");
		chsOperation = inData.next();
		
		
		switch (chsOperation){
			
			case "+":
				resolt = firstNum + secondNum;
				System.out.println("\nYor resolt: " + resolt);
				break;
				
			case "*":
				resolt = firstNum * secondNum;
				System.out.println("\nYor resolt: " + resolt);
			
				break;
				
			case "/":
			
				if(secondNum != 0){
				resolt = firstNum / secondNum;
				System.out.println("\nYor resolt: " + resolt);
				}
				
				else{
					
				System.out.println("\nUnknown operation");}
		
			
				break;
			
			case "-":
			
				resolt = firstNum - secondNum;
				System.out.println("\nYor resolt: " + resolt);
				break;
				
			default: System.out.println("\nUnknown operation");
		}
		
		System.out.print("\nRepeat \n1 - yes\n2 - no \n");
		rep	= inData.nextInt();
        
	   }while(rep == 1);
		
		
		
    }   
	
}