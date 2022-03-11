package fundamentos.ExerciciosFixacao;

import java.util.Scanner;

public class LeitorDeTemperatura {

	public static void main(String[] args) {
		// Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius e ao contrario tambem.
		//Formula conversao C -> F ... (10 °C × 9/5) + 32 = 50 °F
		//Formula conversao F -> C ... (ºF - 32) x 5/9 = ºC

		/*  Forma 1 
		 
		 	Scanner entrada = new Scanner(System.in);
		
			System.out.print("Digite a Temperatura em Fahrenheit: ");
			String valorFahrenheit = entrada.next();
		
			double fahrenheit = Double.parseDouble(valorFahrenheit);
		
			double celsius = (fahrenheit - 32) * 5 / 9;
		
			System.out.println("\n" + valorFahrenheit + "º Fahrenheit equivalem a: " + celsius + "º Celsius");
		*/
		
			//Forma 2 
		
			Scanner entrada = new Scanner(System.in);
			
			System.out.print("Digite a Temperatura em Fahrenheit: ");
			float valorFahrenheit = entrada.nextFloat();
			
			double celsius = (valorFahrenheit - 32) * 5 / 9;
			
			System.out.println("\n" + valorFahrenheit + "º Fahrenheit equivalem a: " + celsius + "º Celsius");
			
			
			System.out.print("\nDigite a Temperatura em Celsius: ");
			float valorCelsius = entrada.nextFloat();
			
			double fahrenheit = (valorCelsius * 9/5) + 32;
			
			System.out.println("\n" + valorCelsius + "º Fahrenheit equivalem a: " + fahrenheit + "º Celsius");
			
		
			entrada.close();
		/*int fahrenheitParaCelsius = 50;
		int celsius = (fahrenheitParaCelsius - 32) * 5 / 9;
		
		System.out.println("\n" + fahrenheitParaCelsius + "º Fahrenheit equivalem a: " + celsius + "º Celsius");
		
		
		* int celsiusParaFahrenheit = 10;
		 
		int fahrenheit = (celsiusParaFahrenheit * 9/5) + 32;
				
		System.out.println("\n" + celsiusParaFahrenheit + "º Celcius equivalem a: " + fahrenheit + "º Fahrenheit");
		System.out.printf("%d.2º Celcius equivalem a: %d.2º Fahrenheit", celsiusParaFahrenheit, fahrenheit); 
		*/
		
		
	}
}
