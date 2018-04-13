import java.util.Arrays;
import java.util.Scanner;
/**
 * 
 * Classe de metodos que manipulam o vetor
 * 
 * @author eliwelton.moreira
 *
 */
public class ManipulaVetores {

	/**
	 * 
	 * @return Retorna o array com a posicao definida
	 */
	public int[] inicializarVetor(){
		
		System.out.println("Inicializar vetor");
		int valor = obterValor();
		int[] retorno = new int[valor];
		System.out.println("Vetor inicializado com " + valor + " elementos");
		
		return retorno;
	}
	
	/**
	 * 
	 * @param vetor
	 * @param valor
	 * @return Retorna o array ordenado
	 */
	public int[] preencherVetor(int[] vetor, int valor){
		
		Arrays.fill(vetor, valor);
		
		return vetor;
		
	}
	
	/**
	 * 
	 * @param vetor
	 * @param tipo 1 - for | 2 - while | 3 - arraysToString
	 */
	public void imprimirVetor(int[] vetor, int tipo){
		
		int i = 0;
		if(tipo == 1){
			for(i = 0; i < vetor.length; i++){
				System.out.println(vetor[i]);
			}
		}
		if(tipo == 2){
			i = 0;
			while(i < vetor.length){
				System.out.println(vetor[i]);
				i++;
			}
		}
		if(tipo == 3) System.out.println(Arrays.toString(vetor));
		
	}
	
	/**
	 * 
	 * @param vetor
	 * @param elementoBusca
	 * @return Retorna a posicao do elemento encontrado
	 */
	public int consultarElemento(int[] vetor, int elementoBusca){
		
		for(int i = 0; i < vetor.length; i++){
			if(vetor[i] == elementoBusca)
				return i;
		}
		
		return -1;
	}
	
	/**
	 * 
	 * @return Retorna a quantidade de posicoes do array
	 */
	public int obterValor(){
		
		int valor = -1;
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe um número:");
		
		while(true){
			valor = leitor.nextInt();
			if(valor > 0) 
				return valor;
			else
				System.out.println("Informe um valor maior que zero");
		}
		
	}
	
}
