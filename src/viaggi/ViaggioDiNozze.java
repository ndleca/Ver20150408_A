package viaggi;

public class ViaggioDiNozze extends Pacchetto{
	
	
		private int divorzi;
		
		public ViaggioDiNozze(String ID, String descrizione, int postiTotali, int divorzi)
		{
			super(ID, descrizione, postiTotali);
			if(divorzi <= 0)
				throw new IllegalArgumentException("divorzi<0!");
			this.divorzi = divorzi;
		}

		public int getDivorzi()
		{
			return divorzi;
		}
	
	
	
}
