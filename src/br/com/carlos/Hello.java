package br.com.carlos;

public class Hello {

	public static void main (String [] args) {
		
		String language = "pt-br";
		
		if(language == "en") {
			System.out.println("Hello world");
		}else if (language =="pt-br"){
			System.out.println("Olá mundo");
		} else {
			System.out.println("Linguagem não identificado");
		}
	}
	
}
