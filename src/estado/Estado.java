package estado;

import java.util.HashMap;

public class Estado {
	private String nome;
	private HashMap<String, Estado> estados;
	
	public Estado(String nome) {
		this.nome = nome;
		this.estados = new HashMap<>();
	}
	
	public void add(String letra, Estado estado){
		estados.put(letra, estado);
	}
	
	public HashMap<String, Estado> getEstados(){
		return estados;
	}
	
}
