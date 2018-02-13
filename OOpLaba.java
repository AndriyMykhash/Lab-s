public class Main {

    public static void main(String[] args) {

        Wallet poket = new Wallet(500);

        poket.addMoney(50);
        poket.spendMoney("Sport", 10);
        poket.getBalance();
        poket.spendMoney("Game", 30);
        poket.addMoney(500);
        poket.spendMoney("Meal", 60);
        poket.showInfo();
    }
}


class Wallet{

    private float money;
    private float startedMoney = 0;
    private final String [] funsName = new String [] {"Sport","Game","Move","Meal"};
    private float [] spendForFuns = new float []{0,0,0,0,0};
    private float addedMoney;
    private static int count = 1;
    private float spendedMoney = 0;
    private float rate [] = new float [5];

    Wallet(float money){
        startedMoney = money;
        this.money = money;
    }

    float addMoney(float money){
        count++;
        addedMoney += money;
        startedMoney += money;
        return this.money +=money;
    }

    void getBalance(){
        System.out.println("Balance: "+this.money+"₴");
    }

    void showInfo(){

        rateMoney();
        System.out.println("Added money: " + addedMoney + "₴, How much: "+count +"\nSpend:" + spendedMoney + "₴, Change: " + (startedMoney-spendedMoney));
        System.out.println("Spend for / Rate:");

        for(int i = 0; i < funsName.length; i++){

            System.out.print(funsName[i]+" ");
            System.out.print(spendForFuns[i]+"₴   ");
            System.out.print(rate[i]+"%\n");

        }
    }

    void spendMoney(String funsName, float money){

        switch(funsName){

            case "Sport":
                spendedMoney += money;
                spendForFuns[0] = money;
                break;
            case "Game":
                spendedMoney += money;
                spendForFuns[1] = money;
                break;
            case "Move":
                spendedMoney += money;
                spendForFuns[2] = money;
                break;
            case "Meal":
                spendedMoney += money;
                spendForFuns[3] = money;
                break;
        }
    }

    private void rateMoney(){

        for(int i = 0; i < rate.length; i++){
            float vidsotok = 0;

            if (spendForFuns[i] < startedMoney || spendForFuns[i] > startedMoney)
                vidsotok = (spendForFuns[i] / startedMoney) * 100;
            else
                continue;
            rate[i] = vidsotok;
        }
    }
}
