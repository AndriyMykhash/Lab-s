import java.util.Scanner;

 
public class Fibonacci {
 
    public static void main(String[] args) {
		
		int maxValue = 0;
		
		int numF = 0, firstF = 0, secondF = 1;
		
		System.out.print("Enter your value: ");
		
		Scanner inData = new Scanner(System.in);
		
		maxValue = inData.nextInt();
		
		
		for(int i = 0; i < maxValue; i++){
			
			numF = firstF + secondF;  
			firstF = secondF;	
			secondF = numF;
		
		}
		
		System.out.print("Number Fibonacci: " + numF);
        
    }   
}