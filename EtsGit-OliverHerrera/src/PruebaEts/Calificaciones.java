package PruebaEts;

import java.util.Scanner;

public class Calificaciones {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce la nota: ");
		double nota = teclado.nextDouble();
		
		if (nota < 1 && nota > 10)
			System.out.println("Error en la nota, debe estar entre 1 y 10");
		else {
			if (nota < 5)
				System.out.println("Insuficiente");
			else
				if (nota < 6)
					System.out.println("Suficiente");
				else
					if (nota < 7)
						System.out.println("Bien");
					else
						if (nota < 9)
							System.out.println("Notable");
						else
							System.out.println("Sobresaliente");
		}
		teclado.close();
	}
}
