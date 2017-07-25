import java.util.Scanner;

public class ex9 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num1 = Integer.parseInt(reader.nextLine());
        System.out.println("Enter another number: ");
        int num2 = Integer.parseInt(reader.nextLine());

        double quotent = num1/num2;

        System.out.println("Division: " + num1 + " / " + num2 + " = " + quotent);


    }
}
