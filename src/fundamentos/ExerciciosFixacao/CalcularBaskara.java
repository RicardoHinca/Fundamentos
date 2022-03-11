package fundamentos.ExerciciosFixacao;

import java.util.Scanner;

public class CalcularBaskara {

	public static void main(String[] args) {
		//Criar um programa que resolva equacoes do segundo grau utilizando a forma de baskara.
		//Use como exemplo a =1, b = 12 e c = 13. Encontre o Delta
		//Formula 2 grau: ax2 + bx + c = 0
		// baskara x = -b +-raiz quadrada de delta (b ao quadrado -4ac) dividido por 2a
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Equação: ax² + bx + c = 0");
		
		System.out.println("\nDigite o valor de A: ");
		int a = scanner.nextInt();

		System.out.println("\nDigite o valor de B: ");
		int b = scanner.nextInt();

		System.out.println("\nDigite o valor de C: ");
		int c = scanner.nextInt();

		int delta = (b * b) - (4 * a * c);

		System.out.printf("\nSua equação é: %dx² + %dx + %d = 0", a, b, c);
		
		System.out.println("\nO delta é: " + delta);

		double x1 = (-b + Math.sqrt(delta)) / (2 * a);

		System.out.printf("O x1 da equação é: %.2f", x1);

		double x2 = (-b - Math.sqrt(delta)) / (2 * a);

		System.out.printf("\nO x2 da equação é: %.2f" ,x2);
		
		scanner.close();
		
		
		//double a = 1; 
		//double b = 12; 
		//double c = 13;
		
		//double delta = (b * b) - 4 * a * c; 
		
		//System.out.println(delta);
		
	}
}
