package br.com.carlos;

import java.util.Scanner;

public class Main {
	
	private static Computador pc = new Computador();
	private static Scanner scanner = new Scanner(System.in);
	private static byte opcoes = 0;
	
	
	public static void main (String [] args) {
		
		primeiraEscolha();
		
	}
	
// Método que irá verificar e notificar o usuario se o computador está ligado ou não
	public static String verificarPc () {
		if(pc.getLigado()== true) {
			return "\n-----------------------------\n"
					+ "O computador está ligado"
					+ "\n-----------------------------\n";
		}
		return"\n-----------------------------\n"
				+ "O computador está desligado"
				+ "\n-----------------------------\n";
	}
	
	
// Método que faz a aparição das opções
	
	public static void primeiraEscolha () {
		System.out.println(verificarPc());
		System.out.println(""
				+ "1- Ligar/Desligar o Computador \n"
				+ "2- Colocar Componentes do computador \n"
				+ "3- Retirar Componentes do computador \n"
				+ "4- Status do computador");
		opcoes = scanner.nextByte();
		mexerPc(opcoes);
	}

// Método para poder desativar ou ativar algum componente do computador
	
	public static void mexerPc (byte opcoes) {
		if(opcoes==1) {
			System.out.println(pc.botaoEnergia());
			primeiraEscolha();
		}else if (opcoes == 2) {
			pc.montarPc(escolherComp(), true);
			primeiraEscolha();
		}else if (opcoes == 3) {
			pc.montarPc(escolherComp(), false);
			primeiraEscolha();
		}else if (opcoes == 4){
			comp();
			primeiraEscolha();
		}else {
			System.out.println("Opção invalida");
		}
	}
	
	
// Método que permite escolher qual peça que deseja ativar ou desativar
	
	public static String escolherComp() {
		System.out.println("Qual componente ?\n"
				+ "1- Memoria RAM\n"
				+ "2- Processador\n"
				+ "3- Placa de video\n"
				+ "4- HD");
		opcoes = scanner.nextByte();
		if(opcoes == 1) {
			return "mr";
		}else if(opcoes == 2) {
			return "pc";
		}else if(opcoes == 3) {
			return "pv";
		}else if(opcoes == 4) {
			return "hd";
		}else {
			return null;
		}
		
	}
	
	
// Mostra os status dos componentes 
	
	public static void comp () {
		System.out.println("\n=======================\n");
		System.out.println("Processador: "+pc.isProcessador());
		System.out.println("Memoria Ram: "+pc.isMemoriaRam());
		System.out.println("Placa de Video: "+pc.isPlacaDeVideo());
		System.out.println("HD: "+pc.isHd());
		System.out.println("\n=======================\n");
	}

}
