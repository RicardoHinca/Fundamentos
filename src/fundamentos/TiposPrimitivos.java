package fundamentos;

public class TiposPrimitivos {

	
		public static void main(String[] args) {
			// Informações do funcionario 
			
			// Tipos numericos inteiros 
			byte anosDeEmpresa = 23;
			short numeroDeVoos = 542;
			int id = 56789;
			long pontosAcumulados = 3_234_845_223L; //quando o numero passa do inteiro coloca um L no final
			
			
			// Tipos numeros reais (com pontos flutuantes)
			float salario = 11_445.44F;
			double vendasAcumuladas = 2_991_797_103.01;
			
			//Tipo booleano
			boolean estaDeFerias = false; // true
			
			// Tipo caractere 
			char status = 'A'; // ativo ?!?!? caracter especial ENTRE ASPAS SIMPLES
			
			//Dias de empresa 
			System.out.println(anosDeEmpresa *365);
			
			//Numero de Viagens
			System.out.println(numeroDeVoos / 2);

			//Pontos por real 
			System.out.println(pontosAcumulados / vendasAcumuladas);
			
			System.out.println(id + ": ganha ->" + salario);
			System.out.println("Ferias?" + estaDeFerias);
			System.out.println("Status: " + status);
			
		}
}
