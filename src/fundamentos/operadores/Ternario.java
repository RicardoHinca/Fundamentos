package fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {
		
		double media = 9.6;
				String resultadoFinal = media >= 7.0 ? "Aprovado" : "Recuperação";
		
		System.out.println("O Aluno esta: " + resultadoFinal);
		
		double nota = 8.3;
		boolean bomComportamento = false;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "Sim" : "Nao";
		
		System.out.printf("Tem Desconto? " + resultado);
		
		
	}
}
