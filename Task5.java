import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A,B,C;
        System.out.println("Enter the number for A: ");
        A = input.nextInt();
        System.out.println("Enter the number for B: ");
        B = input.nextInt();
        System.out.println("Enter the number for C: ");
        C = input.nextInt();
        if (A==B && A==C)
        {
            System.out.println("numbers are equal: "+" "+ 3);

        }
        else if(A==B || B==C)
        {
            System.out.println("numbers are equal: "+" "+ 2);
        }
        else
        {
            System.out.println("numbers are equal"+" "+ 0);
        }

    }
}
