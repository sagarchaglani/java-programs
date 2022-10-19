import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float Area,Length,Width;
        System.out.println("Enter the length of Rectangle: ");
        Length = input.nextFloat();
        System.out.println("Enter the Width of Rectangle");
        Width = input.nextFloat();
        Area = Length * Width;
        System.out.println("area 1 is: "+ Area);

        float area2,length2,width2;
        length2 = input.nextFloat();
        width2 = input.nextFloat();
        area2 = length2 * width2;
        System.out.println("area 2 is: "+area2);

        if (Area > area2)
            System.out.println("Rectangle one has greater area");
        else if (area2>Area)
            System.out.println("Rectangle two has greater area");
        else if (Area == area2)
            System.out.println("Both Ractangle have same area");


    }
}