import java.util.Scanner;
public class Task10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the no of Books: ");
        int no_of_books = input.nextInt();
        System.out.println(no_of_books);

        if (no_of_books<0)
            System.out.println("error number is negaive");
        else
            System.out.println("awarded");

        if(no_of_books>=0 && no_of_books <=1)
            System.out.println("0");
        else if (no_of_books>2 && no_of_books<=3)
            System.out.println("5");
        else if (no_of_books>=4&&no_of_books<=5)
            System.out.println("15");
        else if (no_of_books>=6 && no_of_books<=7)
            System.out.println("30");
        else if (no_of_books>=8)
            System.out.println("60");
        System.out.println("points awarded");


    }
}
