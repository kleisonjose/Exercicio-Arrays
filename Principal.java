import java.util.Scanner;

/**
 * 
 * Programa principal
 * 
 * @author eliwelton.moreira
 *
 */
public class Principal {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		Menu menu = new Menu();
		ManipulaVetores manipulaVetores = new ManipulaVetores();
		int opcao = 0;
		int[] vetor = null;
		
		while(true){
			menu.menu();
			opcao = manipulaVetores.obterValor();
			
			switch(opcao){
			case 1:
				vetor = manipulaVetores.inicializarVetor();
				break;
			case 2:
				menu.menuImpressao();
				int tipo = manipulaVetores.obterValor();
				manipulaVetores.imprimirVetor(vetor, tipo);
				break;
			case 3:
				vetor = manipulaVetores.preencherVetor(vetor, 45);
				break;
			case 4:
				System.out.println("Digite o valor a ser pesquisado:");
				int elemento = leitor.nextInt();
				if(manipulaVetores.consultarElemento(vetor, elemento) == -1){
					System.out.println("Valor não encontrado!");
				} else {
					System.out.println("Valor encontrado na posição " + manipulaVetores.consultarElemento(vetor, elemento));
				}
				break;
			case 9:
				System.exit(0);
			default:
				System.out.println("Opção inválida");
				break;
			}
			
		}

	}

}
