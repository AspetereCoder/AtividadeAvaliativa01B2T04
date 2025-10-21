package classes;

public class Pessoa {
	private String nome;
	private double peso;
	private double altura;
	
	public Pessoa(String nome, double peso, double altura)
	{
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
	}
	
	public double calcularIMC()
	{
		return this.peso * (this.altura * this.altura);
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
