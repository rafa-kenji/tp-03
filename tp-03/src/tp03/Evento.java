package tp03;

import java.util.Date;

public abstract class Evento {
	protected Date dataEvento;
	protected String nomeEvento;
	protected int horario;
	

	public Date getDataEvento() {
		return dataEvento;
	}


	public void setDataEvento(Date dataEvento) {
		this.dataEvento = dataEvento;
	}


	public String getNomeEvento() {
		return nomeEvento;
	}


	public void setNomeEvento(String nomeEvento) {
		this.nomeEvento = nomeEvento;
	}


	public int getHorario() {
		return horario;
	}


	public void setHorario(int horario) {
		this.horario = horario;
	}
	
	
	
	
	
}
