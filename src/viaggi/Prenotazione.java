package viaggi;

public class Prenotazione {
	
	private String ID;
	private int posti;
	private Cliente cliente;
	
	public Prenotazione(String ID, int posti, Cliente cliente) {
		
		if(ID.length() == 0)
			throw new IllegalArgumentException("posti diversi da 0");
		this.ID = ID;
		
		if(posti < 0)
			throw new IllegalArgumentException("posti >0");
		this.posti = posti;
		this.cliente = cliente;
	}
	
	
	public String getID() {
		return ID;
	}

	public int getPosti() {
		return posti;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	@Override public String toString()
	{
		return "Prenotazione [ID=" + ID + ", posti=" + posti + ", cliente="
				+ cliente + "]";
	}
}
