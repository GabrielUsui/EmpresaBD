package dominio;

public class Projeto 
{

	private String codigo;
	
	private Localidade localidade;
	
	private String descricao;
	
	private String departamento;

	public Projeto(String codigo, Localidade localidade, String descricao, String departamento) 
	{
		super();
		this.codigo = codigo;
		this.localidade = localidade;
		this.descricao = descricao;
		this.departamento = departamento;
	}

	public String getCodigo() 
	{
		return codigo;
	}

	public void setCodigo(String codigo) 
	{
		this.codigo = codigo;
	}

	public Localidade getLocalidade() 
	{
		return localidade;
	}

	public void setLocalidade(Localidade localidade) 
	{
		this.localidade = localidade;
	}

	public String getDescricao() 
	{
		return descricao;
	}

	public void setDescricao(String descricao) 
	{
		this.descricao = descricao;
	}

	public String getDepartamento() 
	{
		return departamento;
	}

	public void setDepartamento(String departamento) 
	{
		this.departamento = departamento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((departamento == null) ? 0 : departamento.hashCode());
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + ((localidade == null) ? 0 : localidade.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Projeto other = (Projeto) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (departamento == null) {
			if (other.departamento != null)
				return false;
		} else if (!departamento.equals(other.departamento))
			return false;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (localidade == null) {
			if (other.localidade != null)
				return false;
		} else if (!localidade.equals(other.localidade))
			return false;
		return true;
	}
	
	
	
}
