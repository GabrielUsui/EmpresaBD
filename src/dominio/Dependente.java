package dominio;

import java.util.Date;

public class Dependente 
{
	
	private String nome;
	
	private Empregado responsavel;
	
	private String sexo;
	
	private Date dtNascimento;
	
	private String parentesco;

	public Dependente(String nome, Empregado responsavel, String sexo, Date dtNascimento, String parentesco) 
	{
		super();
		this.nome = nome;
		this.responsavel = responsavel;
		this.sexo = sexo;
		this.dtNascimento = dtNascimento;
		this.parentesco = parentesco;
	}

	public String getNome() 
	{
		return nome;
	}

	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	public Empregado getResponsavel() 
	{
		return responsavel;
	}

	public void setResponsavel(Empregado responsavel) 
	{
		this.responsavel = responsavel;
	}

	public String getSexo() 
	{
		return sexo;
	}

	public void setSexo(String sexo) 
	{
		this.sexo = sexo;
	}

	public Date getDtNascimento() 
	{
		return dtNascimento;
	}

	public void setDtNascimento(Date dtNascimento) 
	{
		this.dtNascimento = dtNascimento;
	}

	public String getParentesco() 
	{
		return parentesco;
	}

	public void setParentesco(String parentesco) 
	{
		this.parentesco = parentesco;
	}

	@Override
	public int hashCode() 
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((responsavel == null) ? 0 : responsavel.hashCode());
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
		Dependente other = (Dependente) obj;
		if (dtNascimento == null) {
			if (other.dtNascimento != null)
				return false;
		} else if (!dtNascimento.equals(other.dtNascimento))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (parentesco == null) {
			if (other.parentesco != null)
				return false;
		} else if (!parentesco.equals(other.parentesco))
			return false;
		if (responsavel == null) {
			if (other.responsavel != null)
				return false;
		} else if (!responsavel.equals(other.responsavel))
			return false;
		if (sexo == null) {
			if (other.sexo != null)
				return false;
		} else if (!sexo.equals(other.sexo))
			return false;
		return true;
	}
}
