import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите первое число и нажмите <Enter>: ");
        int firstNumber = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число и нажмите <Enter>: ");
        int secondNumber = new Scanner(System.in).nextInt();

        int sum = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        double division = (double)firstNumber / secondNumber;

        System.out.println("Сумма чисел " + firstNumber + " и " + secondNumber + " = " + sum);
        System.out.println("Разность чисел " + firstNumber + " и " + secondNumber + " = " + subtraction);
        System.out.println("Произведение чисел " + firstNumber + " и " + secondNumber + " = " + multiplication);
        System.out.println("Частное чисел " + firstNumber + " и " + secondNumber + " = " + division);

    }
}
