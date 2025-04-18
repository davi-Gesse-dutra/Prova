package exercicios_JAVA;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class Ordenador {

	public int[] preencherVetor () {
		int[] vetor=new int[10];
		for(int i=0;i<vetor.length;i++) {
			int valor_digitado= Integer.parseInt(JOptionPane.showInputDialog("digite o numero " + (i+1)));
			if( valor_digitado<0){
				JOptionPane.showMessageDialog(null, "so aceitamos numeros positivos");
				break;
			}else;
			
			 vetor[i]=valor_digitado;
		
		
		}
		return vetor;
		
	}
	
	
	public void ordenarCrecente(int[] vetor) {
		Arrays.sort(vetor);
		
	}
	
	
	public void exibirVetor(int[]vetor ) {
		String resultado="";
		for(int num : vetor) {
			
		   resultado+=num + " ";
			
		}
		JOptionPane.showMessageDialog(null, "A ordem ficou assim");
		JOptionPane.showMessageDialog(null, resultado);
		
	}
	
	
	
	
	
	
	
	
	
}
