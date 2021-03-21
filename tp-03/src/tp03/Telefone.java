package tp03;

public class Telefone extends Evento{
	private int numero;
	private int DDD;
	
	public Telefone(int n, int d) {
		numero = n;
		DDD = d;
	}

	
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getDDD() {
		return DDD;
	}

	public void setDDD(int dDD) {
		DDD = dDD;
	}

		
	
}
