package classes;

public class Pessoa {
	private String nome;
	private double peso;
	private double altura;
	
	public Pessoa(String nome, double peso, double altura)
	{
		this.setNome(nome);
		this.setPeso(peso);
		this.setAltura(altura);
	}
	
	public String getNome()
	{
		return this.nome;
	}
	
	public double getPeso()
	{
		return this.peso;
	}
	
	public double getAltura()
	{
		return this.altura;
	}
	
	public void setNome(String novoNome)
	{
		if (!novoNome.isBlank())
		{
			this.nome = novoNome;
			return;
		}
		System.out.println("Nome inválido.");
	}
	
	public void setPeso(double novoPeso)
	{
		if (novoPeso > 0)
		{
			this.peso = novoPeso;
			return;
		}
		System.out.println("Peso inválido.");
	}
	
	public void setAltura(double novaAltura)
	{
		if (novaAltura > 0)
		{
			this.altura = novaAltura;
			return;
		}
		System.out.println("Altura inválido.");
	}
	
	public double calcularIMC()
	{
		return this.peso / (this.altura * this.altura);
	}
	
	public String classificacaoIMC()
	{
		var imc = this.calcularIMC();
		
		if (imc >= 40.0)
		{
			return "Obesidade grau 3";
		} else if (imc >= 35.0)
		{
			return "Obesidade grau 2";
		} else if (imc >= 30.0)
		{
			return "Obesidade grau 1";
		} else if (imc >= 25.0)
		{
			return "Sobrepreso";
		} else if (imc >= 18.5)
		{
			return "Peso normal";
		} else {
			return "Abaixo do peso";
		}
	}
}
