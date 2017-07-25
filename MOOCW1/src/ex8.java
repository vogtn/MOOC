import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;
public class ex8 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num1 = Integer.parseInt(reader.nextLine());

        System.out.println("Enter a second number: ");
        int num2 = Integer.parseInt(reader.nextLine());

        int sum = num1 + num2;

        System.out.println("Sum of the numbers: " + sum);
    }
}
