import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how much author...\n>: ");
        int howMany = sc.nextInt();

        Data myData [] = new Data[howMany];
        int counter[] = new int[howMany];

        System.out.println("Vvedit");

        for (int i = 0; i < howMany; i++){
            Data temp = new Data();

            System.out.print("Author: ");
            temp.author = sc.next();

            System.out.print("Book name: ");
            temp.name = sc.next();

            System.out.print("Year: ");
            temp.data = sc.nextInt();

            System.out.print("About: ");
            temp.aboout = sc.next();

            System.out.println();
            myData[i] = temp;
        }

        for(int p = 0; p < howMany; p++) {
            for (int j = 0; j < howMany - 1; j++) {
                Data temp1 = new Data();

                if (myData[j].author.compareToIgnoreCase(myData[j + 1].aboout) > 0) {

                    temp1 = myData[j];
                    myData[j] = myData[j + 1];
                    myData[j + 1] = temp1;

                }
            }
        }

        System.out.println();

		System.out.println("Sorted data: ");
        for (int f = 0; f < howMany; f++){

            System.out.println((f + 1) + " ->: ");

            System.out.print(myData[f].aboout + "  ");
            System.out.print(myData[f].name + "  ");
            System.out.print(myData[f].data + "  ");
            System.out.println(myData[f].aboout);

            if(myData[f].data < 1970){
                counter[f] = 1;

            }
        }

        System.out.println(" Vupyshchena do 1970: ");

        for (int f = 0; f < howMany; f++){
          System.out.println();
            if(counter[f] == 1) {
				
				System.out.println((f + 1) + " ->: ");
				System.out.print(myData[f].aboout + "  ");
                System.out.print(myData[f].name + "  ");
                System.out.print(myData[f].data + "  ");
                System.out.print(myData[f].aboout + "  ");
            }
        }


    }
}
class Data {

    int data;
    String author;
    String name;
    String aboout;

}
1 Comment
