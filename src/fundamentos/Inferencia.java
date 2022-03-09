package fundamentos;

public class Inferencia {
	
	public static void main(String[] args) {
		
		double a = 4.5;
			System.out.println(a);
		
		var b = 4.5; //inferencia ele define o tipo que é se é inteiro ou se é variavel
			System.out.println(b);
		
		var c = "Texto";
			System.out.println(c);
		
		c = "Outro Texto";
			System.out.println(c);
		
	}
}
