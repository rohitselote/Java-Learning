import java.util.Scanner;

public class Temperature {

    public static void main(String[] args) {
        System.out.print("Enter temp in degree Celsius : ");
        Scanner sc =new Scanner(System.in);
        float tempc = sc.nextFloat();
        sc.close();
        float tempf = (tempc*9/5) + 32;

        System.out.println("Temperature in degree Farheneit : " + tempf);
    }
}