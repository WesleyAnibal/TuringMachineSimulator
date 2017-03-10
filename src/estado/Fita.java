package estado;

import java.util.ArrayList;

public class Fita {
	private ArrayList<String> palavra;
	private int cabecote;

	public Fita(String palavra) {
		this.palavra = new ArrayList<String>();
		escreverPalavraNaFita(palavra);
		this.cabecote = 0;
	}

	private void escreverPalavraNaFita(String palavra) {
		String[] saida = palavra.split("");
		for (int i = 0; i < saida.length; i++) {
			this.palavra.add(saida[i]);
		}
	}
	
	public void escrever(String simbolo){
		palavra.add(cabecote, simbolo);
	}
	
	public void andarParaEsquerda(){
		cabecote++;
	}
	public void andarParaDireita(){
		cabecote--;
	}
	
	public ArrayList<String> getPalavra(){
		return palavra;
	}
}
