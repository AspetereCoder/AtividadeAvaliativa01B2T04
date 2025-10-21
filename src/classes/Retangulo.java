package classes;

public class Retangulo {
	private double altura, largura;
	
	public Retangulo(double altura, double largura)
	{
		this.setAltura(altura);
		this.setLargura(largura);
	}
	
	public double getAltura()
	{
		return this.altura;
	}
	
	public double getLargura()
	{
		return this.largura;
	}
	
	public void setAltura(double novoValor)
	{
		if (novoValor > 0)
		{
			this.altura = novoValor;
			return;
		}
		System.out.println("Altura inválida.");
	}
	
	public void setLargura(double novoValor)
	{
		if (novoValor > 0)
		{
			this.largura = novoValor;
			return;
		}
		System.out.println("Largura inválida.");
	}
	
	public double getArea()
	{
		return this.altura * this.largura;
	}
	
	public double getPerimetro()
	{
		return 2 * (this.largura + this.altura);
	}
}
