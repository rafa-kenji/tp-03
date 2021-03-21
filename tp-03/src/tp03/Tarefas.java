package tp03;

public class Tarefas extends Evento{
	private String listaTarefa;

	public Tarefas(String lt) {
		listaTarefa = lt;		
	}
	
	
	
	public String toString() {
		return "lista de tarefas: " + listaTarefa;
	}



	public String getListaTarefa() {
		return listaTarefa;
	}



	public void setListaTarefa(String listaTarefa) {
		this.listaTarefa = listaTarefa;
	}
	
	
}
