package fundamentos;

public class Temperatura {

		public static void main(String[] args) {
			// formula conversao (ºF - 32) x 5/9 = ºC
			// 2 variaveis f e c
			//2 constante -32 e 5/9
			final double AJUSTE = 32;
			final double FATOR = 5.0 / 9.0; 
			double F = 86;
			double C = (F - AJUSTE) * FATOR;
			
			System.out.println("Se estiver: " + F + " Graus Fahrenheit, vai estar: " + C + " Graus Celsius.");
	
			F = 0;
			C = (F - AJUSTE) * FATOR;
			 
			System.out.println("Se estiver: " + F + " Graus Fahrenheit, vai estar: " + C + " Graus Celsius.");
		}
}
