package estado;

public class Tranferencias {
	private Estado atual;
	
	//classe responsável pelas transferencias de um estado para outro.
	
	public Tranferencias(String nome) {
		atual = new Estado(nome);
	}

	public void add(String letra, Estado estado) {
		atual.add(letra, estado);
	}
	
	public void trocaEstado(String simbolo){
		atual = atual.getEstados().get(simbolo);
	}
	
	
}
