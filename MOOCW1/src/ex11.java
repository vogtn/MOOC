import java.util.Scanner;

public class ex11 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("type a number: ");
        int num1 = Integer.parseInt(reader.nextLine());

        System.out.println("Type another number");
        int num2 = Integer.parseInt(reader.nextLine());

        int bigger = Math.max(num1, num2);
        System.out.println("The bigger number is: " + bigger);
    }
}
