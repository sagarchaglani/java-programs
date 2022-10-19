import java.util.Scanner;
public class Task8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month,day,year;
        System.out.println("Enter the month that is exactly given: ");
        month = input.nextInt();
        System.out.println("Enter the day that is exactly given: ");
        day = input.nextInt();
        System.out.println("Enter the year that is exactly given: ");

        year = input.nextInt();

        if ((month * day)==year)
            System.out.println("magic");
        else
            System.out.println("no magic");

    }
}
