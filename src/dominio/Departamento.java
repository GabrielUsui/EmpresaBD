package dominio;

import java.util.Date;

public class Departamento 
{
	
	
	private String codigo;
	
	private String nome;
	
	private Empregado gerente;
	
	private Date inicioGerente;

	public Departamento(String codigo, String nome, Empregado gerente, Date inicioGerente) 
	{
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.gerente = gerente;
		this.inicioGerente = inicioGerente;
	}

	public String getCodigo() 
	{
		return codigo;
	}

	public void setCodigo(String codigo) 
	{
		this.codigo = codigo;
	}

	public String getNome() 
	{
		return nome;
	}

	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	public Empregado getGerente() 
	{
		return gerente;
	}

	public void setGerente(Empregado gerente) 
	{
		this.gerente = gerente;
	}

	public Date getInicioGerente() 
	{
		return inicioGerente;
	}

	public void setInicioGerente(Date inicioGerente) 
	{
		this.inicioGerente = inicioGerente;
	}

	@Override
	public int hashCode() 
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Departamento other = (Departamento) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (gerente == null) {
			if (other.gerente != null)
				return false;
		} else if (!gerente.equals(other.gerente))
			return false;
		if (inicioGerente == null) {
			if (other.inicioGerente != null)
				return false;
		} else if (!inicioGerente.equals(other.inicioGerente))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
}
