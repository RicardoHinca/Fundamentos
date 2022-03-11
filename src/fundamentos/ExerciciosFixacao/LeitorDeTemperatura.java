package fundamentos.ExerciciosFixacao;

import java.util.Scanner;

public class LeitorDeTemperatura {

	public static void main(String[] args) {
		// Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius e ao contrario tambem.
		//Formula conversao C -> F ... (10 �C � 9/5) + 32 = 50 �F
		//Formula conversao F -> C ... (�F - 32) x 5/9 = �C

		/*  Forma 1 
		 
		 	Scanner entrada = new Scanner(System.in);
		
			System.out.print("Digite a Temperatura em Fahrenheit: ");
			String valorFahrenheit = entrada.next();
		
			double fahrenheit = Double.parseDouble(valorFahrenheit);
		
			double celsius = (fahrenheit - 32) * 5 / 9;
		
			System.out.println("\n" + valorFahrenheit + "� Fahrenheit equivalem a: " + celsius + "� Celsius");
		*/
		
			//Forma 2 
		
			Scanner entrada = new Scanner(System.in);
			
			System.out.print("Digite a Temperatura em Fahrenheit: ");
			float valorFahrenheit = entrada.nextFloat();
			
			double celsius = (valorFahrenheit - 32) * 5 / 9;
			
			System.out.println("\n" + valorFahrenheit + "� Fahrenheit equivalem a: " + celsius + "� Celsius");
			
			
			System.out.print("\nDigite a Temperatura em Celsius: ");
			float valorCelsius = entrada.nextFloat();
			
			double fahrenheit = (valorCelsius * 9/5) + 32;
			
			System.out.println("\n" + valorCelsius + "� Fahrenheit equivalem a: " + fahrenheit + "� Celsius");
			
		
			entrada.close();
		/*int fahrenheitParaCelsius = 50;
		int celsius = (fahrenheitParaCelsius - 32) * 5 / 9;
		
		System.out.println("\n" + fahrenheitParaCelsius + "� Fahrenheit equivalem a: " + celsius + "� Celsius");
		
		
		* int celsiusParaFahrenheit = 10;
		 
		int fahrenheit = (celsiusParaFahrenheit * 9/5) + 32;
				
		System.out.println("\n" + celsiusParaFahrenheit + "� Celcius equivalem a: " + fahrenheit + "� Fahrenheit");
		System.out.printf("%d.2� Celcius equivalem a: %d.2� Fahrenheit", celsiusParaFahrenheit, fahrenheit); 
		*/
		
		
	}
}
