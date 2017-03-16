package estado;

public class Transferencias {
	private Estado atual;
	private Estado estadoInicial;
	private Estado estadoDeAceitacao;
	private Estado estadoDeReijeicao;
	
	//classe responsável pelas transferencias de um estado para outro.
	
	public Transferencias(Estado inicial, Estado aceitacao, Estado rejeicao) {
		this.estadoInicial = inicial;
		this.atual = estadoInicial;
		this.estadoDeAceitacao = aceitacao;
		this.estadoDeReijeicao = rejeicao;
	}

	public void add(String letra, Estado estado) {
		atual.add(letra, estado);
	}
	
	public int trocaEstado(String simbolo){
		atual = atual.getEstados().get(simbolo);
		if(atual == estadoDeAceitacao) return 1;
		else if(atual.equals(estadoDeReijeicao)) return -1;
		return 0;
	}
	
	
}
