package weektwo;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What Item would you like? ");
        String product = input.nextLine();

        System.out.println("How many items? ");
        int qty = input.nextInt();

        System.out.println("What is the price? ");
        float price = input.nextFloat();

        System.out.println("How many miles? ");
        float miles = input.nextFloat();

        int fee = 0;

        if(miles <= 4){
            fee = 2;
        }
        if(miles <= 15 && miles > 4 ){
            fee = 5;
        }
        if(miles <= 25 && miles > 15 ){
            fee = 10;
        }
        if(miles <= 50 && miles > 25 ){
            fee = 15;
        }
        else if(miles > 50 ){
            fee = 20;
        }

        double total = (price * qty) + fee;

        System.out.println("How many miles? ");

        System.out.println("Your total cost is for " +qty+ " " + product + " is " + "$"+ total);

    }
}
