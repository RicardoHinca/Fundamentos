package fundamentos;

public class PrimitivoVsObjeto {

	public static void main(String[] args) {
		
		String s = new String ("texto");
		s.toUpperCase();
		
		//Wrappers sao a versao objeto dos tipos primitivos
		//No java tudo sao objetos menos os primitivos
		int a = 123;
		System.out.println(a);
		
		
	}
	
}
