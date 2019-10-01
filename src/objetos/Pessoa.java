package objetos;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Pessoa {
	
	private String nome;
	private String email;
	private String celular;
	private String dataDevolucao;
	
	private Date data = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	String dataFormatada = sdf.format(data);
	
	
	public Pessoa() {
		
	}

	public Pessoa(String nome, String email, String celular, String dataFormatada, String dataDevolucao) {
		super();
		this.nome = nome;
		this.email = email;
		this.celular = celular;
		this.dataFormatada = dataFormatada;
		this.dataDevolucao = dataDevolucao;
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
	
	public String getDataFormatada() {
		return dataFormatada;
	}
	public void setDataFormatada(String dataFormatada) {
		this.dataFormatada = dataFormatada;
	}

	public String getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(String dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	

	@Override
	public String toString() {
		return "\nNome: " + nome + ", \nE-mail: " + email + ", \nCelular: " + celular + ", \nData do Empréstimo: " 
				+ dataFormatada + "\nData de Devolução: " + dataDevolucao +  "";
	}

	
}
