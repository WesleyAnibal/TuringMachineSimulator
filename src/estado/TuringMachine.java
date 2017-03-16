package estado;

public class TuringMachine {
	private Fita fita;
	private Transferencias estados;

	public TuringMachine(String inicial, String aceitacao, String rejeicao, String palavra) {
		this.fita = new Fita(palavra);
		this.estados = new Transferencias(new Estado(inicial), new Estado(aceitacao), new Estado(rejeicao));
	}
	
	
}
