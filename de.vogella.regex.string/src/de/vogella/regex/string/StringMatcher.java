package de.vogella.regex.string;

public class StringMatcher {
	        // returns true if the string matches exactly "true"
	        public void isTrue(String s){
	                if (s.matches("true")) {
	                	System.out.println("Verdadeiro para " + s);
	                } else {
	                	System.out.println("Falso para " + s);
	                }
	        }
	        
	        // returns true if the string matches exactly "true" or "True"
	        public void isTrueVersion2(String s){
	                if (s.matches("[tT]rue")) {
	                	System.out.println("Verdadeiro para " + s);
	                } else {
	                	System.out.println("Falso para " + s);
	                }
	        }

	        // returns true if the string matches exactly "true" or "True"
	        // or "yes" or "Yes"
	        public void isTrueOrYes(String s){
	                if (s.matches("[tT]rue|[yY]es")) {
	                	System.out.println("Verdadeiro para " + s);
	                } else {
	                	System.out.println("Falso para " + s);
	                }
	        }

	        // returns true if the string contains exactly "true"
	        public void containsTrue(String s){
	                if (s.matches(".*true.*")) {
	                	System.out.println("Verdadeiro para " + s);
	                } else {
	                	System.out.println("Falso para " + s);
	                }
	        }

	        // returns true if the string contains of three letters
	        public void isThreeLetters(String s){
	                if (s.matches("[a-zA-Z]{3}")) {
	                	System.out.println("Verdadeiro para " + s);
	                } else {
	                	System.out.println("Falso para " + s);
	                }
	                // simpler from for
	                // return s.matches("[a-Z][a-Z][a-Z]");
	        }

	        // returns true if the string does not have a number at the beginning
	        public void isNoNumberAtBeginning(String s){
	                if (s.matches("^[^\\d].*")) {
	                	System.out.println("Verdadeiro para " + s);
	                } else {
	                	System.out.println("Falso para " + s);
	                }
	        }
	        
	        // returns true if the string contains a arbitrary number of characters except b
	        public void isIntersection(String s){
	                if (s.matches("([\\w&&[^b]])*")) {
	                	System.out.println("Verdadeiro para " + s);
	                } else {
	                	System.out.println("Falso para " + s);
	                }
	        }
	        
	        // returns true if the string contains a number less then 300
	        public void isLessThenThreeHundred(String s){
	                if (s.matches("[^0-9]*[12]?[0-9]{1,2}[^0-9]*")) {
	                	System.out.println("Verdadeiro para " + s);
	                } else {
	                	System.out.println("Falso para " + s);
	                }
	        }
}