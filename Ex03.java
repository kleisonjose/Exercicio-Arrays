import java.util.Scanner;
import java.util.Arrays;
/**
 * 
 * Ex03 Cria um array que recebe 10 valores e depois realiza uma pesquisa por um valor 
 *      Ordena a lista, faz uma pesquisa Binaria e retorna o indice se o mesmo existir
 *      no array.
 * 
 * @author eliwelton.moreira
 *  
 */
public class Ex03 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int i, valor;
		int[] numeros = new int[10];
		System.out.println("Digite 10 números: ");
		for(i = 0; i < 10; i++){
			numeros[i] = input.nextInt();
		}
		
		/**
		 * Sort   Metodo que ordena os valores do array na ordem crescente
		 * 
		 * @param numeros  Array de inteiros com 10 posicoes
		 */
		Arrays.sort(numeros);
		
		System.out.println("Digite um valor: ");
		valor = input.nextInt();
		
		/**
		 * binarySearch  Metodo que realiza uma pesquisa binaria no array ordenado
		 * 
		 * @param numeros  Array ordenado de inteiros com 10 posicoes
		 * @param valor    Valor que sera procurado no array
		 */
		int location = Arrays.binarySearch(numeros, valor);
		if(location >= 0){
			System.out.println("A posição de " + valor + " é " + location + ", numeros[" + location + "] = " + numeros[location]);
		} else {
			System.out.println("Número não encontrado!");
		}
		
		input.close();
		
	}

}
