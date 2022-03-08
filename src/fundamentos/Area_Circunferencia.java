package fundamentos;

public class Area_Circunferencia {
	
	//todo e qualquer programa inicia com main ctrl espaço 
	
	public static void main(String[] args) {
		int raioint = 3; //int = numero inteiro, raio nome valor 3
		double raio = 3.4; // double = numero quebrado
		final double pi = 3.14159; // final double = numero quebrado que nao pode ser alterado 
		double area = pi * raio * raio; 
				// atalho para fala de impressao SYSO ctrl espaço
		
		System.out.println(area);
		
		raio = 10; 
		area = pi * raio * raio; 
		System.out.println("Area = " + area + "m².");
}
}
