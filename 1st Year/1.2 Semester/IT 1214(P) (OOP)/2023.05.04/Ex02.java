import java.util.Scanner;

class Ex02
{
    public static void main (String args[])
    {
        //create a scanner object
        Scanner sc = new Scanner (System.in);

        //ask user for input
        System.out.println("Enter your age : ");
        int age = sc.nextInt();

        //ask user for double data;
        System.out.println("Enter your salary : ");
        double salary = sc.nextDouble();

        //ask user for float data;
        System.out.println("Enter your interest for saving : ");
        float interest = sc.nextFloat();

        //ask user for string data;
        System.out.println("Enter your city : ");
        String city = sc.next();

        //ask user for boolean data;
        System.out.println("Are you single : ");
        boolean sinlge = sc.nextBoolean();

        //ask user for char data;
        System.out.println("Enter your first initial : ");
        double initial = sc.next().charAt(0);

        //print
        System.out.println("Your age is : "+age);
        System.out.println("Your salary is : "+salary);
        System.out.println("You save interest is : "+interest);
        System.out.println("Your city : "+city);
        System.out.println("Are you single"+sinlge);
        System.out.println("Your initial : "+initial);

    }
}