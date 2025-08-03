import java.util.Scanner;
public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        double temp = sc.nextDouble();
        System.out.print("Convert to (C/F): ");
        char unit = sc.next().toUpperCase().charAt(0);
        if (unit == 'C') {
            System.out.println("In Celsius: " + (temp - 32) * 5/9);
        } else if (unit == 'F') {
            System.out.println("In Fahrenheit: " + (temp * 9/5) + 32);
        } else {
            System.out.println("Invalid unit.");
        }
        sc.close();
    }
}
