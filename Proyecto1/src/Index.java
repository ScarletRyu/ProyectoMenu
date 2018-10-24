import java.util.Scanner;

public class Index {

	public static void main(String[] args) {
		// Hacer que funsione por la jrasia di yisucristo porfaplis

		Scanner scan = new Scanner(System.in);
		int opcion;

		do {
			System.out.println("Introduce un numero de menu");
			System.out.println("-------MENU-------");
			System.out.println("1 - Numero de digitos de un numero positivo");
			System.out.println(
					"2 - Leer un numero positivo y un digito y decir si el digito aparece y cuantas veces lo hace.");
			System.out.println("3 - Leer un numero y mostrarlo al reves");
			System.out.println("4 - Factorial de un numero");
			System.out.println("5 - Piramide con asteriscos");
			System.out.println("6 - Leer un numero en binario y pasarlo a decimal");
			System.out.println("7 - Leer una frase y contar cuantas vocales aparecen");
			System.out.println("8 - Tabla de multiplicar del 1 al 10");
			System.out.println("9 - Salir");
			opcion = scan.nextInt();

			switch (opcion) {

			case 1:
				int numero;
				do {
					System.out.println("Ingresa un numero");
					numero = scan.nextInt();
					int digitos = (int) (Math.log10(numero) + 1);
					if (numero > 0) {
						System.out.println("El numero " + numero + " es positivo y tiene: " + digitos + " digito/s");
					}

				} while (numero < 0); {

			}

				break;

			case 2:
				// pedir datos
				System.out.println("Introduce un numero Por Favor");
				Long numero2 = scan.nextLong();
				System.out.println("Ahora debes introducir el numero que quieres que comprobemos cuanto se repite");
				int numeroRepite = scan.nextInt();

				// contador para ver las veces que se repite
				int repeticiones = 0;

				// conversion de long a string para poder comparar los caracteres del numero con
				// el que le decimos insertamos
				String num = String.valueOf(numero2);

				for (int i = 0; i < num.length(); i++) {
					if (Integer.valueOf(String.valueOf(num.charAt(i))) == numeroRepite) {
						repeticiones++;
					}
				}
				System.out.println("el numero se repite " + repeticiones + " veces");

				break;
				
			
				
				
				
			case 3:
				int num3, r;
				System.out.println("Ingrese un numero: ");
				num3 = scan.nextInt();

				while (num3 != 0) {
					r = num3 % 10;
					System.out.print(r);
					num3 = num3 / 10;
				}
				System.out.println("\n");
				break;
				
				
				
				
				
				
			case 4:
				long factorial = 1;
				int numero4;
				System.out.print("Introduce un número: ");
				numero4 = scan.nextInt();
				for (int i = numero4; i > 0; i--) {
					factorial = factorial * i;
				}
				System.out.println("El factorial de " + numero4 + " es: " + factorial);

				break;

			case 5:

				int numero5 = 0;
				for (int i = 0; i <= 10; i++) {
					int num5 = 0;
					while (num5 <= numero5) {
						System.out.print("*");
						num5++;
					}
					numero5++;
					System.out.println("");
				}

				break;

			case 6:

				//Pasar de binario a decimal
				
				Scanner input = new Scanner( System.in );
			       System.out.print("Introduce un numero binario: ");
			       String binaryString =input.nextLine();
			       System.out.println("El numero en decimal es: "+Integer.parseInt(binaryString,2));
	
				
				break;

			case 7:
				// Leer una frase y contar cuantas vocales aparecen

				String palabra;

				System.out.println("Introduce una palabra.");
				palabra = scan.next();
				char[] wordc = palabra.toCharArray();

				int vocales = 0;

				for (char w : wordc) {
					if (w == 'a' || w == 'e' || w == 'i' || w == 'o' || w == 'u') {
						vocales++;
					}
				}

				System.out.println("El numero de vocales que hay en " + palabra + " es: " + vocales);
				System.out
						.println("El numero de consonantes que hay en " + palabra + " es: " + (wordc.length - vocales));

				break;

			case 8:
				int i = 1, r2;
				System.out.println("Ingrese el numero de la tabla de multiplicar");
				int n = scan.nextInt();
				while (i <= 10) {

					r2 = n * i;
					System.out.println(n + "*" + i + "=" + r2 + "");
					i = i + 1;
				}
			}

		} while (opcion != 9);
		System.out.println("Fin del programa");
	}
}



