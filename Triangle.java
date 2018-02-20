package ooplaba;



public class OOpLaba {
    
    public static void main(String[] args) {
        
        Triangle trial = new Triangle(6,8,10); 
        System.out.println("Trial^ "+trial.square());
        Tetraeder tetra = new Tetraeder(6,8,10,5); 
        System.out.println("Tetra^ "+tetra.square());

    }
}


class Triangle{
    
    protected float firstSide;
    protected float secondSide;
    protected float thirdSide;
    protected float squares;

    Triangle(float firstSide, float secondSide, float thirdSide){
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide; 
        }
    
    protected float square(){
        
        float p = (firstSide + secondSide + thirdSide )/2;
        squares = (float)(Math.sqrt((p*(p-firstSide)*(p-secondSide)*(p-thirdSide))));
        return squares;
    }  
}

 class Tetraeder extends Triangle{

    protected float heigth;
    
    Tetraeder(float firstSide, float secondSide, float thirdSide, float heigth) {
        super(firstSide, secondSide, thirdSide);
        this.heigth = heigth;        
    }
    
    @Override  
    protected float square(){
        float sum = 0;
        float p = (firstSide + secondSide + thirdSide )/2;
        squares = (float)(Math.sqrt((p*(p-firstSide)*(p-secondSide)*(p-thirdSide))));
        sum += squares;
        
        
        /**
        float p1 = (firstSide + secondSide + heigth )/2;
        squares = (float)(Math.sqrt((p*(p-firstSide)*(p-secondSide)*(p-heigth))));
        sum += squares;
        float p2 = (firstSide + heigth + thirdSide )/2;
        squares = (float)(Math.sqrt((p*(p-firstSide)*(p-heigth)*(p-thirdSide))));
        sum += squares;
        float p3 = (heigth + secondSide + thirdSide )/2;
        squares = (float)(Math.sqrt((p*(p-heigth)*(p-secondSide)*(p-thirdSide))));
        sum += squares;*/
       return sum; 
    }
}
