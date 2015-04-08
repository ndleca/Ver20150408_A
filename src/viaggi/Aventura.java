package viaggi;

public class Aventura {
	int dispersi;
	
	public Aventura(String ID, String descrizione, int postiTotali, int dispersi)
	{
		super(ID, descrizione, postiTotali);
		if(dispersi <= 0)
			throw new IllegalArgumentException("dispersi<0!");
		this.dispersi = dispersi;
	}

	public int getDispersi() {
		return dispersi;
	}

}
