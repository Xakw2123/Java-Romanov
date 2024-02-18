import java.util.Scanner;
public class First {
    public static void main(String[] args) {
        double num1;
        double num2;
        double ans;
        char op;
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        num1 = reader.nextDouble();
        num2 = reader.nextDouble();
        {
            if (num1 > num2) {
                System.out.println("a > b");
            } else if (num1 < num2) {
                System.out.println("b > a");
            } else {
                System.out.println("a = b ");
            }
            System.out.println("Сложение: " + (num1 + num2));
            System.out.println("Вычитание: " + (num1 - num2));
            System.out.println("Умножение: " + (num1 * num2));
            System.out.println("Деление: " + (num1 / num2));
        }
    }

}