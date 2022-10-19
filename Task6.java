import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 1 to 10");
        int A;

        A = input.nextInt();
        if(A<1 && A>10)
        {
            System.out.println("Not between 1 t0 10");
        }
        else
        {
            System.out.println("The roman number is: ");
        }
        if(A==1)
            System.out.println("I");
        else if (A==2)
            System.out.println("II");
        else if (A==3)
            System.out.println("III");
        else if (A==4)
            System.out.println("IV");
        else if (A==5)
            System.out.println("V");
        else if (A==6)
            System.out.println("VI");
        else if (A==7)
            System.out.println("VII");
        else if (A==8)
            System.out.println("IX");
        else if (A==9)
            System.out.println("X");
        else if (A==10)
            System.out.println("X");


    }
}
