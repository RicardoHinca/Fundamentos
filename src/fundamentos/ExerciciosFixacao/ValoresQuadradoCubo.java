package fundamentos.ExerciciosFixacao;

import java.util.Scanner;

public class ValoresQuadradoCubo {

	public static void main(String[] args) {
		//Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um Valor: ");
		float valor = entrada.nextFloat();
	
		float resultadoQuadrado = valor * valor;
		float resultadoCubo = valor * valor * valor;
	
		System.out.println("\nResultado ao Quadrado é: " + resultadoQuadrado);
		System.out.println("\nResultado ao Cubo é: " + resultadoCubo);
			
		entrada.close();
	}
}
