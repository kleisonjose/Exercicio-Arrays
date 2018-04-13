import java.util.Scanner;
import java.util.Arrays;
/**
 * 
 * Ex 04 Cria um array que recebe varios 10 nomes e ao final ordena os mesmos
 *       em ordem alfabetica
 * 
 * @author eliwelton.moreira
 *
 */
public class Ex04 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int i;
		String[] nomes = new String[10];
		System.out.println("Informe 10 nomes: ");
		for(i = 0; i < 10; i++){
			nomes[i] = input.nextLine();
		}
		
		/**
		 * Sort   Metodo que ordena os nomes do array na ordem alfabetica
		 * 
		 * @param nomes  Array de strings com 10 posicoes
		 */
		Arrays.sort(nomes);
		
		for(i = 0; i < 10; i++){
			System.out.println(nomes[i]);
		}

		input.close();
		
	}

}
