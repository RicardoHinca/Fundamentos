package fundamentos.desafios;

public class DesafioLogico {

	public static void main(String[] args) {
		
		//Trabalho na terça (v ou f)
		//Trabalho na quinta (v ou f)
		// Prometeou pra familia se os 2 trampo deu certo compra tv 50" 
		// &&
		//se um dos dois trab deu certo uma tv de 32" 
		// ^ Ou exclusivo, pois se os dois derem certo compra tv de 50 se nenhum der certo nao compra...
		//...so compra a de 32 se um der certo
		// ambas as promessas vao tomar sorvete juntos 
		// ||
		// se nao tiver trabalho vai ficar em casa 
		//NOT
		
		boolean trabalho1 = false;
		boolean trabalho2 = false;
		
		boolean comproutv50 = trabalho1 && trabalho2; 
		boolean comproutv32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2; 
		boolean maisSaudavel = !comprouSorvete;
		
		System.out.println("Comrpou TV50\": " +  comproutv50);
		System.out.println("Comrpou TV32\": " +  comproutv32);
		System.out.println("Comrpou Sorvete\": " + comprouSorvete);
		System.out.println("Mais Saudavel? " + maisSaudavel);
		
		
		
		
	}
	
}
