
public class Ejercicio3 {

	public static void main(String[] args) {
		/*3. Escribe un programa en Java que muestre 
		 * y cuente los números que son múltiplos de 
		 * 2 o de 3 que hay entre 1 y 100.
		 */
		        int contador = 0;

		        System.out.println("Números que son múltiplos de 2 entre 1 y 100:");

		        for (int i = 1; i <= 100; i++) {
		            if (i % 2 == 0) { //Para utilizar el modulo de una división, que sea 0.
		                System.out.println(i);
		                contador++;
		            }
		        }

		        System.out.println("En total hay: " + contador + " números.");
		    }


	}

