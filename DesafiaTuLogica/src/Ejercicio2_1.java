import java.util.Scanner;
public class Ejercicio2_1 {

	public static void main(String[] args) {
		/*2. Escribe un programa en Java que pida un número por teclado hasta que éste sea positivo.
		 *  A continuación, muestra los primeros 20 números sucesivos a dicho número.
		 */
		int numero;
		Scanner sc = new Scanner (System.in);
		
		do {
			System.out.print("Escribe un número: ");
		    numero = sc.nextInt ();
		    
		  //Si el número es menor nos vuelve a preguntar.
		    if (numero<0) { 
		    	System.out.println("Por favor, introduzca un número positivo.");
		    }
		    }while (numero<0);
		     System.out.println("Los 20 números sucesivos a " + numero + " son: ");
		     
		     for (int i= numero + 1; i < numero + 20; i++) {
		    	 System.out.println(i+"");
		     }
		     
		     sc.close();	
		

		

	}

}
