package fundamentos.ExerciciosFixacao;

import java.util.Scanner;

public class CalcularTriangulo {
	
	public static void main(String[] args) {
		// Criar um programa que leia o valor da base e da altura de um triangulo e calcule a area
		// area = b*a/2
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o valor da base do Triangulo: ");
		double base = entrada.nextFloat();
		
		System.out.print("Digite o valor da altura do Triangulo: ");
		double altura = entrada.nextFloat();
	
		double area = (base * altura) / 2;
		
		System.out.println("\nResultado da area do Triangulo é: " + area);
					
		entrada.close();
		
	}
}
