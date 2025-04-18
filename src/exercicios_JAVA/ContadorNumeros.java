package exercicios_JAVA;
import javax.swing.JOptionPane;

public class ContadorNumeros {
	 int par=0;
     int impar=0;
	public void ContarParesImpares() {
		int[] lista=new int[12];
		 
		for(int i=0;i<lista.length;i++){
			
			lista[i]=  Integer.parseInt(JOptionPane.showInputDialog("Digite um número "+ (i+1)+" para saber se e par ou impar "  ));
			
				if(lista[i] % 2 ==0) {
					par++;
				}else {
					impar++;
				}
			}
		
		
		}
	
	     public void exibirResultado() {
    	JOptionPane.showMessageDialog(null, "existem " + par + " numeros pares");
    	JOptionPane.showMessageDialog(null, "existem " + impar + " numeros impares");
    	
    	 if (par>impar) {
    		JOptionPane.showMessageDialog(null," A quantidade de numeros pares e maior");
    		
    	}else if (impar>par) {
    		JOptionPane.showMessageDialog(null," A quantidade de numeros impares e maior");
    	}else{
    	JOptionPane.showMessageDialog(null," A quantidade de pares e impares e igual");
    	}
    	
    	
	     }
    	
    	
    }
	
		
	
    

	
	
	

