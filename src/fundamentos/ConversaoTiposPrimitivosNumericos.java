package fundamentos;

public class ConversaoTiposPrimitivosNumericos {

	
	public static void main(String[] args) {
		
		double a = 1; //implicita 
		System.out.println(a);
		
		//usando o segundo float voce esta ciente q vai cortar o numero truncando explicitamente
		//explicita 
		float b = (float)1.12345;
		// float b = 1.12345; implicita
		System.out.println(b);
		
		int c = 130;
		byte d = (byte)c; // explicita 
		System.out.println(d);
		
		double e = 1.99999;
		int f = (int) e;
		System.out.println(f);
				
		
	}
}
