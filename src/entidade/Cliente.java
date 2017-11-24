package entidade;

public class Cliente {
	private int id;
	private String nome;
	private int idade;
	
	//CONSTRUTOR
	public Cliente() {
		
	}
	
	//PUBLIC VOID PQ SÓ ATRIBUI
	public void setIdade(int idade) {
		//THIS PQ A "IDADE" - CLASSE E NAO ATRIBUTO
		this.idade = idade;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	
	public String getNome() {
		return nome;
	}
	
	public int getId() {
		return id;
	}
}
