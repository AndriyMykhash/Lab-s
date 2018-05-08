package laba;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class PieceOfTest {

    protected String name;
    protected List<String> askingQ = new ArrayList(); // Запитаня -> ?
    protected List<String> pieceQest;  // відповідь на запитання
    protected List<List> question = new ArrayList(); // куча, де є відповіді 
    
    protected String pieceAns[]; 
    protected List<List> rightAns = new ArrayList();

    
    PieceOfTest(String name){
        this.name = name;
    }
    
    void addQuestion(){   
        
        Scanner sc = new Scanner(System.in); 
        boolean stopList = true;
        boolean stopBloc = true;
        String quest = "";
        int qCount = 1;
        int aCount = 1;

        while(stopBloc){
         
            System.out.print("Enter question "+(qCount++)+" : ");
            askingQ.add(sc.next());
            
            while(stopList){
                
                System.out.print("Enter answer "+(aCount++)+" : ");
                if((quest = sc.next()).compareToIgnoreCase("exit") == 0)
                    stopList = false;
                
                else if(quest.compareToIgnoreCase("exitBloc") == 0){
                    stopBloc = false;
                    stopList = false;
                }
                    
                else{
                    pieceQest = new ArrayList();
                    pieceQest.add(quest);
                }
            }
            aCount = 1;
            question.add(pieceQest);
            stopList = true;        
        }
        System.out.println("Done!");
    }
    
    void addAnswer(){
    
    
    
    
    }
    
}


