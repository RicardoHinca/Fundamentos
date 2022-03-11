package fundamentos.ExerciciosFixacao;

import java.util.Scanner;

public class CalculoIMC {

	public static void main(String[] args) {
		//Criar um programa que leia o peso e a altura do usuario e imprima no console o IMC
		//Pensar em algo mais aprofundado ja que gostamos de musculação
		// IMC = Peso ÷ (Altura × Altura)
		
			Scanner entrada = new Scanner(System.in);
		
			System.out.print("Digite a seu Peso: ");
			float peso = entrada.nextFloat();
		
			System.out.print("Digite a sua Altura em CM: ");
			float altura = entrada.nextFloat();
				
			double imc = peso / (altura * altura);
		
			System.out.printf("\nSeu IMC é: %.2f", imc);
		
			entrada.close();
		
	}
}
