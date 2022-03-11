package fundamentos.operadores;

public class Unarios {

	public static void main(String[] args) {
		
		int a = 1; 
		int b = 2;
		
		a++; // incremento a = a + 1
		a--; // decremento  a = a - 1
		
		++b; // b = b + 1 
		--b; // b = b - 1
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("Mini Desafio...");
		System.out.println(++a == b--); // true ++antes do operando soma antes  -- apos operando so apos a comparacao 
		System.out.println(a == b); // false
		System.out.println(a); // 2
		System.out.println(b); //1 
		
		
		
	}
}
