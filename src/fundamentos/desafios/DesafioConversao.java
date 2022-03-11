package fundamentos.desafios;

import java.util.Scanner;

public class DesafioConversao {

	
	public static void main(String[] args) {
		
		//criar um scanner, pegar 3 strings usando nextline podem receber salarios os 3 ultimos de uma pessoa 
		// o salario tem ponto e virgula soma os 3 divide por 3 e da a media
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o Primeiro Salario: ");
		String valor1 = entrada.next().replace(",", ".");
		
		System.out.print("\nInforme o Segundo Salario: ");
		String valor2= entrada.next().replace(",", ".");
		
		System.out.print("\nInforme o Terceiro Salario: ");
		String valor3 = entrada.next().replace(",", ".");
		
		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
		
		double media = (salario1 + salario2 + salario3) / 3;
		System.out.println("A Media dos salarios é: R$" + media);

		
		
		
		
		entrada.close();
	}
}
