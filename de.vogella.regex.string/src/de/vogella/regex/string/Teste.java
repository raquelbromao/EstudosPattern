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
		
		//VERIFICA SE É EXATAMENTE true
		superTeste.isTrue(verdadeiro1); //VERDADEIRO
		superTeste.isTrue(verdadeiro2); //FALSO
		
		//VERIFICA SE É EXATAMENTE true ou True
		superTeste.isTrueVersion2(verdadeiro1); //VERDADEIRO
		superTeste.isTrueVersion2(verdadeiro2); //VERDADEIRO
		
		//VERIFICA SE É EXATAMENTE yes, Yes, true ou True
		superTeste.isTrueOrYes(sim1); //VERDADEIRO
		superTeste.isTrueOrYes(sim2); //VERDADEIRO
		
		//VERIFICA SE CONTÊM true
		superTeste.containsTrue(contemVerdadeiro); //VERDADEIRO
		superTeste.containsTrue(contem3); //FALSO
		
		//VERIFICA SE SÃO EXATAMENTE 3 LETRAS
		superTeste.isThreeLetters(contem3); //VERDADEIRO
		superTeste.isThreeLetters(maior300); //FALSO
		
		//VERIFICA SE NÃO É NÚMERO NO INÍCIO
		superTeste.isNoNumberAtBeginning(numeroFim); //VERDADEIRO
		superTeste.isNoNumberAtBeginning(numeroInicio); //FIM
		
		//VERIFICA SE NÃO POSSUI b
		superTeste.isIntersection(semB); //VERDADEIRO
		superTeste.isIntersection(comB); //FALSO
		
		//VERIFICA SE O NÚMERO É MENOR QUE 300
		superTeste.isLessThenThreeHundred(menor300); //VERDADEIRO
		superTeste.isLessThenThreeHundred(maior300); //FALSO
	}
}
