import Excepcions.customException;
import Excepcions.numberCheck;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Integer num = new Random().nextInt(500);
        System.out.println(num);

        // Solicitar el primer número hasta que sea adivinado correctamente
        while (true) {
            try {
                System.out.println("Ingrese un número:");
                Integer num1 = numberCheck.scanNumber(teclado);  // Llama al método que captura números
                numberCheck.verifyNumber(num1);  // Verifica que el número no sea negativo y menor que 500, pasa al catch

                if (num1.equals(num)) {
                    System.out.println("¡Felicidades! El número ingresado es correcto.");
                    break;  // Sale del bucle
                } else if (num1 < num) {
                    System.out.println("El número ingresado es menor al número generado.");
                } else {
                    System.out.println("El número ingresado es mayor al número generado.");
                }

            } catch (customException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
