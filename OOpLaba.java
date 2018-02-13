package ooplaba;

public class OOpLaba {

    public static void main(String[] args) {
        Wallet poket = new Wallet(500);
        
        poket.addMoney(50);
        poket.getBalance();
        poket.spendMoney("Sport", 30);
        poket.spendMoney("Game", 60);
        poket.showInfo();
        
    }
}

class Wallet{

    private double money;
    private double startedMoney = 0;
    private final String [] funsName = new String [] {"Sport","Game","Move","Meal"};
    private double [] spendForFuns = new double []{1,1,1,1,1};
    private double rate [] = new double [5];
    
    Wallet(double money){
        startedMoney = money;
        this.money = money;
    }
    double addMoney(double money){
        startedMoney += money;
        return this.money +=money;
    }
    String getBalance(){
        return this.money+"₴";
    }
    String showInfo(){
        rateMoney();
        for(int i = 0; i < funsName.length; i++){
            System.out.print(funsName[i]+" ");
            System.out.print(rate[i]+"₴\n");

        }
        return "";
    }
    void spendMoney(String funsName, double money){
        
        switch(funsName){
            case "Sport": spendForFuns[1] = money;
                break;
            case "Game": spendForFuns[2] = money;
                break;
            case "Move": spendForFuns[3] = money;
                break;
            case "Meal": spendForFuns[4] = money;
                break;
        }
    }
    private void rateMoney(){
        for(int i = 0; i < rate.length; i++){
            double vidsotok = (startedMoney/spendForFuns[i])*100;
            rate[i] = vidsotok;
        }
    }
}