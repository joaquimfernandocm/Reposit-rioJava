package entidade;


public class Pessoa {
	private String nome;
	private String email;
	private String telefone;
	
	// ctrl + espa�o
	public Pessoa() {
		
	}
	
	// alt + shift + S + O 
	public Pessoa(String nome, String email, String telefone) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}
	
	public Pessoa(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
	
	
	//alt + shift + S + S
	@Override
	public String toString() {
		return "Nome: " + nome + "\tEmail: " + email + "\tTelefone: " + telefone;
	}
	
	//alt + shift + S + R
	public String getNome(){
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
