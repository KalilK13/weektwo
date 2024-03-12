package weektwo;

public class Main {
    public static void main(String[] args) {

        String product = "Rice";
        int qty = 20;
        float price = 5.0f;
        float miles = 10f;
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

        System.out.println("Your total cost is " + total);

    }
}
