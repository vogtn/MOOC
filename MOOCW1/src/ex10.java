import java.util.Scanner;
import static java.lang.Math.PI;
public class ex10 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        System.out.println("Type the radius: ");
        int radius = Integer.parseInt(reader.nextLine());

        System.out.println("Circumference of the circle: " + (radius * PI * 2));
    }
}
