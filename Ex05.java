import java.util.Scanner;
import java.util.Arrays;
/**
 * 
 * Ex 05 Cria um array que vai receber uma sequencia numerica de 10 inteiros, 
 *       e ao final imprime a sequencia em ordem crescente
 * 
 * @author eliwelton.moreira
 *
 */
public class Ex05 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int i;
		int[] numeros = new int[10];
		System.out.println("Digite 10 números inteiros:");
		for(i = 0; i < 10; i++){
			numeros[i] = input.nextInt();
		}
		
		/**
		 * Sort   Metodo que ordena os valores do array na ordem crescente
		 * 
		 * @param numeros  Array de inteiros com 10 posicoes
		 */
		Arrays.sort(numeros);
		
		for(i = 0; i < 10; i++){
			System.out.println(numeros[i]);
		}
		
		input.close();

	}

}
