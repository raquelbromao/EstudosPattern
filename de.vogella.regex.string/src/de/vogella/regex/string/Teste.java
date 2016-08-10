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
		
		
		//Eu podia ter apenas colocado strings diretamente na chamada da função,
		//mas sou distraída e criei todas elas
		
		System.out.println("## Verifica método isTrue");
		
		//VERIFICA SE É EXATAMENTE true
		superTeste.isTrue(verdadeiro1); //VERDADEIRO
		superTeste.isTrue(verdadeiro2); //FALSO
		
		System.out.println("\n");
		System.out.println("## Verifica método isTrueVersion2");
		
		//VERIFICA SE É EXATAMENTE true ou True
		superTeste.isTrueVersion2(verdadeiro1); //VERDADEIRO
		superTeste.isTrueVersion2(verdadeiro2); //VERDADEIRO
		
		System.out.println("\n");
		System.out.println("## Verifica método isTrueOrYes");
		
		//VERIFICA SE É EXATAMENTE yes, Yes, true ou True
		superTeste.isTrueOrYes(sim1); //VERDADEIRO
		superTeste.isTrueOrYes(sim2); //VERDADEIRO
		
		System.out.println("\n");
		System.out.println("## Verifica método containsTrue");
		
		//VERIFICA SE CONTÊM true
		superTeste.containsTrue(contemVerdadeiro); //VERDADEIRO
		superTeste.containsTrue(contem3); //FALSO
		
		System.out.println("\n");
		System.out.println("## Verifica método isThreeLetters");
		
		//VERIFICA SE SÃO EXATAMENTE 3 LETRAS
		
		///////////////////////// VERIFICAR ESSA FUNÇÃO E RESULTADOS
		
		superTeste.isThreeLetters(contem3); //VERDADEIRO
		superTeste.isThreeLetters(maior300); //FALSO
		
		System.out.println("\n");
		System.out.println("## Verifica método isNoNumberAtBeginning");
		
		//VERIFICA SE NÃO É NÚMERO NO INÍCIO
		superTeste.isNoNumberAtBeginning(numeroFim); //VERDADEIRO
		superTeste.isNoNumberAtBeginning(numeroInicio); //FALSO
		
		System.out.println("\n");
		System.out.println("## Verifica método isIntersection");
		
		//VERIFICA SE NÃO POSSUI b
		superTeste.isIntersection(semB); //VERDADEIRO
		superTeste.isIntersection(comB); //FALSO
		
		System.out.println("\n");
		System.out.println("## Verifica método isLessThenThreeHundred");
		
		//VERIFICA SE O NÚMERO É MENOR QUE 300
		superTeste.isLessThenThreeHundred(menor300); //VERDADEIRO
		superTeste.isLessThenThreeHundred(maior300); //FALSO
	}
}
