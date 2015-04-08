package viaggi;

public class Cliente {
	private String nome;
	private String cognome;
	private String email;
	
	public Cliente(String nome, String cognome, String email)
	{
		if(nome.length() <= 0)
			throw new IllegalArgumentException("nome<0");
		this.nome = nome;
		if(cognome.length() <= 0)
			throw new IllegalArgumentException("cognome<0");
		this.cognome = cognome;
		if(email.length() <= 0)
			throw new IllegalArgumentException("email<0");
		this.email = email;
	}

	public String getNome()
	{
		return nome;
	}

	public String getCognome()
	{
		return cognome;
	}

	public String getEmail()
	{
		return email;
	}

	@Override public String toString()
	{
		return "Cliente [nome=" + nome + ", cognome=" + cognome + ", email=" + email + "]";
	}
	
}
