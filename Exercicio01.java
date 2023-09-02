package senaiprojetos;
import javax.swing.JOptionPane;

public class Exercicio01 {

	public static void main(String[] args) {
		
		/*Crie um array de inteiros com 5 elementos e atribua valores a cada um deles. Em seguida, imprima	
		os valores do array.
		 * */
		
		String [] nomes = new String [5];
		
		for(int i = 0 ; i < nomes.length ; i++) {
			
			nomes[i] = JOptionPane.showInputDialog(null , "Digite um nome");
			System.out.println(nomes[i]);
		}
	
	}

}
