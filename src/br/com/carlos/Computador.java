package br.com.carlos;

public class Computador {

	private boolean memoriaRam = true,processador = true,placaDeVideo = true,hd = true;
	
	private boolean ligado = false;
	private boolean queimado = false;
	
// Método utilizado para colocar peças ou retirar no computador
	
	public String montarPc (String componente, boolean colocar) {
		
		if(colocar) {
			if(componente.equals("mr") && ligado==false) {
				memoriaRam = true;
				return "A memoria ram foi instalada";
			} else if(componente.equals("pc") && ligado==false) {
				processador = true;
				return "O processador foi instalada";
			}else if(componente.equals("pv") && ligado==false) {
				placaDeVideo = true;
				return "A placa de video foi instalada";
			}else if(componente.equals("hd") && ligado==false) {
				hd = true;
				return "O HD foi instalada";
			}
		} else if (!colocar) {
			if(componente.equals("mr") && ligado==false) {
				memoriaRam = false;
				return "A memoria ram foi retirada";
			} else if(componente.equals("pc") && ligado==false) {
				processador = false;
				return "O processador foi retirada";
			}else if(componente.equals("pv") && ligado==false) {
				placaDeVideo = false;
				return "A placa de video foi retirada";
			}else if(componente.equals("hd") && ligado==false) {
				hd = false;
				return "O HD foi retirada";
			}
		}else if (componente == null) {
			return "Opção invalida";
		}
		queimado = true;
		return "O PC queimou";
	}
	
	
// Método usado para poder Ligar ou Desligar o Computador
	
	public String botaoEnergia () {
		if(ligado) {
			ligado = false;
			return "\n-----------------------------\n"
					+ "O computador está desligando"
					+ "\n-----------------------------\n";
		}else if (!ligado && queimado) {
			return "\n-----------------------------\n"
					+ "O Computador não liga porquê está queimado"
					+ "\\n-----------------------------\n";
		}else if (memoriaRam && processador && placaDeVideo && hd && !queimado) {
			ligado = true;
			return "\n-----------------------------\n"
					+ "O computador está ligando"
					+ "\n-----------------------------\n";
		}else {
			return "\n-----------------------------\n"
					+ "O PC está faltando alguma peça"
					+ "\n-----------------------------\n";	
		}
	}
	
	


	public boolean getLigado () {
		return ligado;
		
	}
	public boolean isMemoriaRam() {
		return memoriaRam;
	}


	public boolean isProcessador() {
		return processador;
	}


	public boolean isPlacaDeVideo() {
		return placaDeVideo;
	}


	public boolean isHd() {
		return hd;
	}


	public void setMemoriaRam(boolean memoriaRam) {
		this.memoriaRam = memoriaRam;
	}


	public void setProcessador(boolean processador) {
		this.processador = processador;
	}


	public void setPlacaDeVideo(boolean placaDeVideo) {
		this.placaDeVideo = placaDeVideo;
	}


	public void setHd(boolean hd) {
		this.hd = hd;
	}

}
