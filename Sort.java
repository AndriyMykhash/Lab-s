import java.util.Scanner;
import java.util.Arrays;
import java.io.*;


 
public class Sort {
 
    public static void main(String[] args) {
	 
        Scanner inData = new Scanner(System.in);
		
		
		System.out.print("Enter count of numbers: ");
		
		int size = inData.nextInt();;
		
		System.out.println("\nEnter your number");
		
		
		int[] eNums = new int[size];
		
		for(int i = 0; i < eNums.length; i++){
			
			System.out.print(i+1+"-th: ");
			eNums [i] = inData.nextInt(); 
			
		}	
			
		for (int i = 0; i < eNums.length; i++){
			
			for (int j = 0; j < eNums.length; j++){
				
				if (eNums[i] < eNums[j]){
					
					int temp = eNums[i];
					eNums[i] = eNums[j];
					eNums[j] = temp;
					
				}
			}
		}
				
		System.out.println("\nSort");
		
		for(int i = 0; i < eNums.length; i++){
		
		System.out.println(i+1+"-th: "+eNums[i]);
		
		}
		
		
		
		
		
    }   
	
}