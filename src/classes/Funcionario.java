package classes;

public class Funcionario {
	private String nome;
	private double salario;
	
	public Funcionario(String nome, double salario)
	{
		this.nome = nome;
		this.salario = salario;
	}
	
	public String getNome()
	{
		return this.nome;
	}
	
	public double getSalario()
	{
		return this.salario;
	}
	
	public void aumentarSalario(double percentual)
	{
		if (percentual <= 0)
		{
			System.out.println("Percentual inválido. Insira um maior valor que 0");
			return;
		}
		
		double valorAcrescimo = this.salario * (percentual / 100.0);
		this.salario += valorAcrescimo;
	}
}
