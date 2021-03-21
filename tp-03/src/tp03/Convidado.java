package tp03;

public class Convidado extends Evento{
	private String nomeConvidado;
	private boolean presenca;
	private String endereco;
	private String email;
	
	public Convidado(String nC, String end, String em, boolean pres) {
		nomeConvidado = nC;
		endereco = end;
		email = em;
		presenca = pres;		
	}
	


	public String toString() {
		return "nome do convidado: " + nomeConvidado;
	}



	public String getNomeConvidado() {
		return nomeConvidado;
	}



	public void setNomeConvidado(String nomeConvidado) {
		this.nomeConvidado = nomeConvidado;
	}



	public boolean isPresenca() {
		return presenca;
	}



	public void setPresenca(boolean presenca) {
		this.presenca = presenca;
	}



	public String getEndereco() {
		return endereco;
	}



	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}
