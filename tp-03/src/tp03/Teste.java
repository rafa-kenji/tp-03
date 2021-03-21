package tp03;

public class Teste {
	static Convidado c1;
	static Convidado c2;
	static Tarefas t;
	static Telefone te;
	
	
	public static void main(String[] args) {

		
		c1 = new Convidado("C1","local","email", true);
		c2 = new Convidado("C2","local","email",false);
		
		
		te = new Telefone(0, 0);
		te.setDDD(061);
		te.setNumero(55555555);
		
		t = new Tarefas("Tarefas para serem cumpridas");
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(te.toString());
		System.out.println(t.toString());
		
	}
}
