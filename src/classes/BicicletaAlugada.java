package classes;

public class BicicletaAlugada {
	private int horas;
	private double valorHora;
	
	public BicicletaAlugada(int horas, double valor)
	{
		this.setHoras(horas);
		this.setValorHora(valor);
	}
	
	public int getHoras()
	{
		return this.horas;
	}
	
	public double getValorHora()
	{
		return this.valorHora;
	}
	
	
	public void setHoras(int qtd)
	{
		if (qtd >= 1)
		{
			this.horas = qtd;
			return;
		}
		System.out.println("Horas inválidas.");
	}
	
	public void setValorHora(double valor)
	{
		if (valor > 0)
		{
			this.valorHora = valor;
			return;
		}
		System.out.println("Valor inválido.");
	}
	
	public double calcularValor()
	{
		return this.horas * this.valorHora;
	}
}
