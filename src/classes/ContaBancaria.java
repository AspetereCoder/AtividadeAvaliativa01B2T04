package classes;

public class ContaBancaria {
	private String titular;
	private double saldo;
	
	public ContaBancaria(String titular)
	{
		this.setTitular(titular);
	}
	
	public ContaBancaria(String titular, double saldo)
	{
		this.setTitular(titular);
		if (saldo >= 0)
		{
			this.saldo = saldo;
		}
	}
	
	private void setTitular(String titular)
	{
		if (!titular.isBlank())
		{
			this.titular = titular;
		}
	}
	
	
	public String consultarTitular()
	{
		return this.titular;
	}
	
	public double consultarSaldo()
	{
		return this.saldo;
	}
	
	public void depositar(double valor)
	{
		// validação: aceita apenas valores positivos
		if (valor > 0)
		{
			this.saldo += valor;
			return;
		}
		
		System.out.println("Depósito inválido. Insira uma quantia positiva.");
	}
	
	public void sacar(double valor)
	{
		// validação: não permite saldo negativo após saque.
		if (this.saldo - valor >= 0)
		{
			this.saldo -= valor;
			return;
		}
		
		System.out.println("Saque inválido. Saldo insuficiente.");
	}
	
	public void extrato()
	{
		System.out.println("--------------------------------");
		System.out.println("Titular: " + this.titular);
		System.out.println("Saldo: R$" + this.saldo);
		System.out.println("--------------------------------");
	}
	
}
