package de.vogella.regex.test;

public class RegexTestStrings {

	public static final String EXAMPLE_TEST = "This is my small example " + "string which I'm going to "
			+ "use for pattern matching.";

	public static void main(String[] args) {
		// matches -> combina exatamente a frase e gera true ou false dependendo do resultado
		System.out.println("Resultado do EXAMPLE_TEST.matches:");
		System.out.println(EXAMPLE_TEST.matches("\\w.*")+"\n");
		
		// split -> separa as palavras pelos espaços em branco (que são jogados fora) e
		// armazena cada palavra no array de String splitString
		String[] splitString = (EXAMPLE_TEST.split("\\s+"));
		
		// lenght -> gera o tamanho do array splitString
		System.out.println("Resultado do splitString.lenght:");
		System.out.println(splitString.length+"\n");// should be 14
		
		System.out.println("Impressão do split de forma iterativa (for):");
		//cada string da classe String recebe um splitString da lista e o imprime
		for (String string : splitString) {
			System.out.println(string);
		}
		
		// replaceAll -> substitui todos os espaços em branco por tabulações
		System.out.println("\nResultado do EXAMPLE_TEST.replaceALL:");
		System.out.println(EXAMPLE_TEST.replaceAll("\\s+", "\t")+"\n");
	}

}
