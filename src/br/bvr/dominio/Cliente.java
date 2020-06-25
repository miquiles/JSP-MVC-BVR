package br.bvr.dominio;
/**
 * @author pedroMiquiles
 */
public class Cliente {
	
	private String nome, telefone, email;
	
	public Cliente() {
		
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", telefone=" + telefone + ", email=" + email + "]";
	}
	


}
