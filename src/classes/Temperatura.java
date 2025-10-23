package classes;

public class Temperatura {
	private double celsius;

	public Temperatura(double grausCelsius) {
		this.setTemperatura(grausCelsius);
	}

	public double getTemperatura() {
		return this.celsius;
	}
	
	public void setTemperatura(double novaTempCelsius)
	{
		// validação: não permite temperatura menor que zero absoluto
		if (novaTempCelsius >= -273.15)
		{
			this.celsius = novaTempCelsius;
			return;
		}
		System.out.println("Temperatura inválida. Não pode ser menor que o zero absoluto.");
	}
	
	public double paraFahrenheit()
	{
		return (this.celsius * 9/5) + 32;
	}
	
	public double paraKelvin()
	{
		return this.celsius + 273.15;
	}
}
