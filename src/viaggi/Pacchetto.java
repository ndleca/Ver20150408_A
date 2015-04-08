package viaggi;

import java.util.Vector;

public class Pacchetto
{
	private String ID;
	private String descrizione;
	private int postiTotali;
	private Vector<Prenotazione> prenotazioni;
	
	public Pacchetto(String ID, String descrizione, int postiTotali) {
		if(ID.length() == 0)
			throw new IllegalArgumentException("La lunghezza della stringa deve essere diversa da 0.");
		this.ID = new String(ID);
		if(descrizione.length() == 0)
			throw new IllegalArgumentException("La lunghezza della stringa deve essere diversa da 0.");
		this.descrizione = new String(descrizione);
		if(postiTotali <= 0)
			throw new IllegalArgumentException("I veicoli devono essere positivi.");
		this.postiTotali = postiTotali;
		this.prenotazioni = new Vector<Prenotazione>(postiTotali, 0);
	}

	public String getID() {
		return ID;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public int getPostiTotali() {
		return postiTotali;
	}
	
	public int getPostiDisponibili() {
		int posti = prenotazioni.size();
		for(int i = 0; i < prenotazioni.size(); i++)
		{
			posti -= prenotazioni.get(i).getPosti();
			
		}
		return posti;
	}
	
	public void addPrenotazione(Prenotazione n){
		if(getPostiDisponibili() <= 0){
			throw new IllegalArgumentException("posti insuficienti");
		}
		prenotazioni.addElement(n);
	}

	public Vector<Prenotazione> getPrenotazioni(){
		return prenotazioni;
	}
}