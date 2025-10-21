package classes;

public class Musica {
	private String titulo;
	private int duracaoSegundos;
	
	public Musica(String titulo, int duracaoSegundos)
	{
		this.setTitulo(titulo);
		this.setDuracao(duracaoSegundos);
	}
	
	public String getTitulo()
	{
		return this.titulo;
	}
	
	public int getDuracao()
	{
		return this.duracaoSegundos;
	}
	
	public void setTitulo(String novoTitulo)
	{
		// validação: titulo não pode ser vazio
		if (!novoTitulo.isBlank())
		{
			this.titulo = novoTitulo;
			return;
		}
		System.out.println("Titulo inválido.");
	}
	
	public void setDuracao(int duracaoSegundos)
	{
		// validação: duração não pode ser 0
		if (duracaoSegundos > 0)
		{
			this.duracaoSegundos = duracaoSegundos;
			return;
		}
		System.out.println("Duração inválida.");
	}
	
	public String formatarDuracao()
	{
		// retorna a duração da música no formato mm:ss]
		double valorConvertido = duracaoSegundos / 60.0;
		
		return Double.toString(valorConvertido);
	}
}
