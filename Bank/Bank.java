public class Banks{
    
    public static void main(String[] args) {
        Bank banks [] = new Bank[3];
        banks [0] = new PrivatBank();
        banks [1] = new AlphaBank();
        banks [2] = new DichinaBank();

        for(int i = 0;i < banks.length; i++){
            banks[i].deposit(200);
            banks[i].withDraw(200);
            banks[i].deposit(20);
            System.out.println(banks[i].account());
        }      
    }
}


abstract class Bank{
    protected String name;
    protected float depositPerc;
    protected float withDrawPerc;
    protected double depositAmoun;

    protected double vidsotokAdd(double add, double vids){
        double res;
        res = Math.pow((double)(1+(vids/100)),3)*add;        
        return res;
    }
    protected double vidsotokTake(double take, double vids){
        double res;
        res = Math.pow((double)(1-(vids/100)),3)*take;        
        return res;
    }
    abstract void deposit(double add/*покладення грошей з відсотком*/); //сума 
    abstract void withDraw(double add/*знімання грошей з відсотоком*/);
    abstract String account(/*показує суму грошей що залишилися*/);
    
}


class PrivatBank extends Bank{
    
    void deposit(double add){      //Кладе суму і за 3 роки відсоток рахує;
        super.depositAmoun += super.vidsotokAdd(add,10);
    }
    void withDraw(double add){     //Забирає суму за 3 роки з відсотком;
        super.depositAmoun -= super.vidsotokTake(add,9);
    }
    String account(){
        super.name = "Balance in PrivatBank: ";
        return super.name + super.depositAmoun + "₴";
    }  
}

class AlphaBank extends Bank{
    
    void deposit(double add){      //Кладе суму і за 3 роки відсоток рахує;
        super.depositAmoun += super.vidsotokAdd(add,12);
    }
    void withDraw(double add){     //Забирає суму за 3 роки з відсотком;
        super.depositAmoun -= super.vidsotokTake(add,7);
    }
    String account(){
        super.name = "Balance in AlphaBank: ";
        return super.name + super.depositAmoun + "₴";
    }  
}

class DichinaBank extends Bank{
    
    void deposit(double add){      //Кладе суму і за 3 роки відсоток рахує;
        super.depositAmoun += super.vidsotokAdd(add,0.00001);
    }
    void withDraw(double add){     //Забирає суму за 3 роки з відсотком;
        super.depositAmoun -= super.vidsotokTake(add,6);
    }
    String account(){
        super.name = "Balance in DichinaBank: ";
        return super.name + super.depositAmoun + "₴";
    }  
}
