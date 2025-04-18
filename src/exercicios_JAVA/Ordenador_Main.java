package exercicios_JAVA;

public class Ordenador_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ordenador chamada= new Ordenador();
		
		int[]numeros= chamada.preencherVetor();
		chamada.ordenarCrecente(numeros);
		chamada.exibirVetor(numeros);
		
		
		

		
	}

}
