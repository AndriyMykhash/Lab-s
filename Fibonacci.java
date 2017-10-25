import java.util.Scanner;

 
public class Fibonacci {
 
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		
		int maxValue, limitation, a = 0;
		int numF = 0, firstF = 0, secondF = 1;
		
		System.out.print("Enter your value: ");
		maxValue = sc.nextInt();
		
		System.out.print("Enter your limitation: ");
		limitation = sc.nextInt();
		
		for(int i = 0; i < maxValue; i++){
			int tempF;
			
			tempF = numF;
			numF = firstF + secondF;  
			firstF = secondF;
			secondF = numF;
			
			if(numF >= limitation)
			{	
				a = i;
				numF = tempF;
				break;
			}
		
		}
		
		System.out.print(a + " number Fibonacci: " + numF);
        
    }   
}
