package de.vogella.regex.string;

public class Teste extends StringMatcher {
	public static void main(String[] args) {
		String verdadeiro1 = "true";
		String verdadeiro2 = "True";
		String sim1 = "yes";
		String sim2 = "Yes";
		String contemVerdadeiro = "its alive and its true";
		String contem3 = "amor doce bombom";
		String numeroInicio = "3 sorvetes";
		String numeroFim = "muitos sorvetes 3";
		String comB = "aagsfahdhfb";
		String semB = "daegdvcer";
		String menor300 = "299";
		String maior300 = "301";
		
		StringMatcher superTeste = new StringMatcher();
		
		
		//Eu podia ter apenas colocado strings diretamente na chamada da fun��o,
		//mas sou distra�da e criei todas elas
		
		System.out.println("## Verifica m�todo isTrue");
		
		//VERIFICA SE � EXATAMENTE true
		superTeste.isTrue(verdadeiro1); //VERDADEIRO
		superTeste.isTrue(verdadeiro2); //FALSO
		
		System.out.println("\n");
		System.out.println("## Verifica m�todo isTrueVersion2");
		
		//VERIFICA SE � EXATAMENTE true ou True
		superTeste.isTrueVersion2(verdadeiro1); //VERDADEIRO
		superTeste.isTrueVersion2(verdadeiro2); //VERDADEIRO
		
		System.out.println("\n");
		System.out.println("## Verifica m�todo isTrueOrYes");
		
		//VERIFICA SE � EXATAMENTE yes, Yes, true ou True
		superTeste.isTrueOrYes(sim1); //VERDADEIRO
		superTeste.isTrueOrYes(sim2); //VERDADEIRO
		
		System.out.println("\n");
		System.out.println("## Verifica m�todo containsTrue");
		
		//VERIFICA SE CONT�M true
		superTeste.containsTrue(contemVerdadeiro); //VERDADEIRO
		superTeste.containsTrue(contem3); //FALSO
		
		System.out.println("\n");
		System.out.println("## Verifica m�todo isThreeLetters");
		
		//VERIFICA SE S�O EXATAMENTE 3 LETRAS
		
		///////////////////////// VERIFICAR ESSA FUN��O E RESULTADOS
		
		superTeste.isThreeLetters(contem3); //VERDADEIRO
		superTeste.isThreeLetters(maior300); //FALSO
		
		System.out.println("\n");
		System.out.println("## Verifica m�todo isNoNumberAtBeginning");
		
		//VERIFICA SE N�O � N�MERO NO IN�CIO
		superTeste.isNoNumberAtBeginning(numeroFim); //VERDADEIRO
		superTeste.isNoNumberAtBeginning(numeroInicio); //FALSO
		
		System.out.println("\n");
		System.out.println("## Verifica m�todo isIntersection");
		
		//VERIFICA SE N�O POSSUI b
		superTeste.isIntersection(semB); //VERDADEIRO
		superTeste.isIntersection(comB); //FALSO
		
		System.out.println("\n");
		System.out.println("## Verifica m�todo isLessThenThreeHundred");
		
		//VERIFICA SE O N�MERO � MENOR QUE 300
		superTeste.isLessThenThreeHundred(menor300); //VERDADEIRO
		superTeste.isLessThenThreeHundred(maior300); //FALSO
	}
}
