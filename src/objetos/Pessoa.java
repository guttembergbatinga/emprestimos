package objetos;

public class Pessoa {
	
	private String nome;
	private String email;
	private String celular;
	private String data;
	
	public Pessoa() {
		
	}

	public Pessoa(String nome, String email, String celular, String data) {
		super();
		this.nome = nome;
		this.email = email;
		this.celular = celular;
		this.data = data;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}
	
	public String getData() {
		return nome;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "\nNome: " + nome + "\n\nEmail: " + email + "\n\nCelular: " + celular + "\n\nData do Empréstimo: " + data + "\n";
	}

	
}
