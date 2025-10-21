package classes;

public class Filme {
	private String titulo;
	private double avaliacao;
	
	public Filme(String titulo)
	{
		this.setTitulo(titulo);
	}
	
	public Filme(String titulo, double avaliacao)
	{
		this.setTitulo(titulo);
		this.setAvaliacao(avaliacao);
	}
	
	public String getTitulo()
	{
		return this.titulo;
	}
	
	public void setTitulo(String novoTitulo)
	{
		// validação: titulo não pode ser vazio
		if (!novoTitulo.isBlank())
		{
			this.titulo = novoTitulo;
		}
	}
	
	public double getAvaliacao()
	{
		return this.avaliacao;
	}
	
	
	public void setAvaliacao(double novaAvaliacao)
	{
		// validação: nota entre 0 e 5
		if (novaAvaliacao >= 0 && novaAvaliacao <= 5)
		{
			this.avaliacao = novaAvaliacao;
		}
	}
	
	public void exibir()
	{
		System.out.println("Filme: " + this.titulo + " | Avaliacao: " + this.avaliacao + "⭐");
	}
}
