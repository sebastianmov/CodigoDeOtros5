/*
 * El programa realiza lo siguiente:
 * - Solicita al usuario un numero
 * - El numero ingresa como un string y se convierte a un numero entero
 * - Se determina si el numero es afortunado dependiendo de que los numeros que componen al numero introducido sean mas numeros 3, 7, 8 y 9
 * - Si hay mayor cantidad de numeros que no sean 3, 7, 8 y/o 9, entonces es un numero no afortunado
 * - Al final se imprime un mensaje donde se determina si el numero es afortunado o no
 */

import java.util.Scanner; // se importo scanner de la libreria java.util

public class Codigo5 {
	
	public static void main(String[] args) { // Hacia falta colocar todo dentro del metodo main
		Scanner s = new Scanner(System.in); // Se coloco System.in como argumento
		System.out.print("Introduzca un número: ");
		String ni = s.nextLine();
		int c = Integer.parseInt(ni); // Se debe convertir el String a int usando Integer.parseInt() 

		int afo = 0;
		int noAfo = 0;
		int num = c; // Se debe usar una variable aparte para las operaciones
    
		while (num > 0) { // Asi se logra utilizar la variable num en lugar de ni
			int digito = num % 10; // se cambia num en lugar de ni
			if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
				afo++;
			} else {
				noAfo++;
			} // faltaba esta llave de cierre	
			num /= 10; // se utiliza la variable num en lugar de ni
		}

		if (afo > noAfo) {
			System.out.println("El " + c + " es un número afortunado."); // se puso una t faltante en println
		} else {
			System.out.println("El " + c + " no es un número afortunado.");
		}
		s.close(); // cierra el scanner
	}
}