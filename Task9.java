import java.util.Scanner;
public class Task9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double PENNY = .01;
        double NICKEL = .05;
        double DIME = .10;
        double QUARTER = .25;

        float pennies,nikle,dimes,quater;
        System.out.println("enter the Pennies");
        pennies = input.nextFloat();
        System.out.println("Enter the nikle");
        nikle = input.nextFloat();
        System.out.println("Enter he dimes");
        dimes = input.nextFloat();
        System.out.println("Enter the quater");
        quater = input.nextFloat();

        double total = pennies+nikle+dimes+quater;
        System.out.println("total"+total);
        if(total==1.00)
            System.out.println("you won amount = 1 dollar");
        else if (total>1.00)
            System.out.println("the amount is greater then 1 dollar");
        else if (total<1.00)
            System.out.println("the amount is lesser then 1 dollar");
        else
            System.out.println("you lost");

    }
}
