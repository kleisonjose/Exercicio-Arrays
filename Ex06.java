import java.util.*;
/**
 * 
 * @author eliwelton.moreira
 *
 */
public class Ex06 {

	/**
	 * 
	 * @param m
	 * @return Retorna o mapa com os valores ordenados e sem repeticoes
	 */
	static Map<String, String> fill(Map<String, String> m){
		m.put("Maria", "Analista de projetos");
		m.put("João", "Programador");
		return m;
	}
	
	public static void main(String[] args) {
		
		System.out.println(fill(new HashMap<String, String>()));
		
	}
	
}
