package fundamentos;

public class DesarioOperadoresAritmeticos {

	public static void main(String[] args) {
		
		/* int a = 3 * 4 - 10 ; 
		int b = (int)Math.pow(a, 3); // elevar a potencia
		double c = Math.pow(a, 3); // elevar a potencia
		
		System.out.println(b);
		System.out.println(c);
		*/
		
		double a1 = (6 * (3 + 2)); 
		double a2 = Math.pow(a1, 2);
		double a3 = (3 * 2); 
		double a = a2 / a3;
		
		System.out.println("Resultado de A1: " + a1);
		System.out.println("Resultado de A2: " + a2);
		System.out.println("Resultado de A3: " + a3);
			
		double b1 = ((1 - 5) * (2 - 7)) / 2; 
		double b = Math.pow(b1, 2);
		
		System.out.println("Resultado de B1: " + b1);
		
				
		double c = (a - b);
		
		double d2 = Math.pow(c, 3);
		double d3 = Math.pow(10, 3);
				
		System.out.println("Resultado de C2: " + d2);
		System.out.println("Resultado de C3: " + d3);
		
		double e = (d2 / d3);
		
				
		System.out.println("\nResultado de A: " + a);
		System.out.println("\nResultado de B: " + b);
		System.out.println("\nResultado de C: " + c);
		
		System.out.println("\nResultado Final : " + e);
	}
	
}
