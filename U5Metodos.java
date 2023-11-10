package u5.metodos;
import java.util.Scanner;
public class U5Metodos {

    // Método para sumar
    public static double sumar(double num1, double num2) {
        return num1 + num2;
    }

    // Método para restar
    public static double restar(double num1, double num2) {
        return num1 - num2;
    }

    // Método para multiplicar
    public static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    // Método para dividir
    public static double dividir(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return num1 / num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer nu10mero: ");
        double num1 = scanner.nextDouble();
        System.out.println("Ingrese el segundo numero: ");
        double num2 = scanner.nextDouble();

        System.out.println("La suma es: " + sumar(num1, num2));
        System.out.println("La resta es: " + restar(num1, num2));
        System.out.println("La multiplicacion es: " + multiplicar(num1, num2));
        System.out.println("La division es: " + dividir(num1, num2));

        scanner.close();
    }
}
