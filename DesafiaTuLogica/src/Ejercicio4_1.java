import java.util.Scanner;

public class Ejercicio4_1 {
    public static void main(String[] args) {
    	/*4. Escribe un programa en Java que pida al usuario 3 números y un orden de ordenamiento,
    	 *  que puede ser ascendente o descendente, a continuación, según el orden indicado se mostrarán 
    	 *  en pantalla dichos números.
    	 */
        Scanner sc = new Scanner(System.in);

        System.out.print("Escriba el primer número: ");
        int numero1 = sc.nextInt();

        System.out.print("Escriba el segundo número: ");
        int numero2 = sc.nextInt();

        System.out.print("Escriba el tercer número: ");
        int numero3 = sc.nextInt();

        System.out.print("Seleccione el orden (ascendente o descendente): ");
        String orden = sc.next().toLowerCase();

        // Realizar el ordenamiento según la elección.
        if (orden.equals("ascendente")) {
            if (numero1 < numero2 && numero1 < numero3) {
                System.out.print(numero1 + ", ");
                if (numero2 < numero3) {
                    System.out.print(numero2 + ", " + numero3);
                } else {
                    System.out.print(numero3 + ", " + numero2);
                }
            } else if (numero2 < numero1 && numero2 < numero3) {
                System.out.print(numero2 + ", ");
                if (numero1 < numero3) {
                    System.out.print(numero1 + ", " + numero3);
                } else {
                    System.out.print(numero3 + ", " + numero1);
                }
            } else {
                System.out.print(numero3 + ", ");
                if (numero1 < numero2) {
                    System.out.print(numero1 + ", " + numero2);
                } else {
                    System.out.print(numero2 + ", " + numero1);
                }
            }
        } else if (orden.equals("descendente")) {
            if (numero1 > numero2 && numero1 > numero3) {
                System.out.print(numero1 + ", ");
                if (numero2 > numero3) {
                    System.out.print(numero2 + ", " + numero3);
                } else {
                    System.out.print(numero3 + ", " + numero2);
                }
            } else if (numero2 > numero1 && numero2 > numero3) {
                System.out.print(numero2 + ", ");
                if (numero1 > numero3) {
                    System.out.print(numero1 + ", " + numero3);
                } else {
                    System.out.print(numero3 + ", " + numero1);
                }
            } else {
                System.out.print(numero3 + ", ");
                if (numero1 > numero2) {
                    System.out.print(numero1 + ", " + numero2);
                } else {
                    System.out.print(numero2 + ", " + numero1);
                }
            }
        }  sc.close();
    }
}
