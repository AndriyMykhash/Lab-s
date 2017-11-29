import java.util.Scanner;
import java.io.*;

public class Main {
 
    public static void main(String[] args) {
		
			
		String moveTo;
		
		try(FileReader reader = new FileReader("text.txt"))
        {
			Scanner sc = new Scanner(reader);	
            moveTo = sc.hasNextLine("text.txt");
			
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        }   
		
		
		File crtFile = new File("SortedText.txt","*.txt");
		
		
		String parentFile = crtFile.getParent();
		try(FileWriter writer = new FileWriter(parentFile, false))
        {
          writer.write(moveTo);
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        } 
		
		}
}