package Principal;

import classes.*;

public class Main {

	public static void main(String[] args) {

//		atividadeUm();
//		atividadeDois();
//		atividadeTres();
//		atividadeQuatro();
		atividadeCinco();
	}

	public static void atividadeUm()
	{
		/*
		 * Criar a classe ContaBancaria com atributos titular e saldo
		 * Métodos: depositar(double valor) e sacar(double valor)
		 * 
		 * Crie uma conta, faça depósitos, saques e imprima o saldo final.
		 */
		var conta = new ContaBancaria("Ronaldo");
		conta.depositar(255);
		
		System.out.println(conta.consultarSaldo());
		System.out.println(conta.consultarTitular());
		
		conta.sacar(355);
		conta.sacar(155);

		conta.depositar(1000);
		
		conta.extrato();
	}
	
	public static void atividadeDois()
	{
		/*
		 * Crie a classe Filme com atributos privados: titulo (String) e avaliacao (double).
		 * Valide: título não vazio; avaliação entre 0 e 5
		 * Construtores vazio e com parâmetros (reutilizando setters).
		 * Implemente o método exibir() que imprime: “Filme: <titulo> | Avaliação: <avaliacao> ⭐”.
		 * No main, crie dois filmes e exiba.
		 */
		var filme1 = new Filme("O poderoso chefão");
		var filme2 = new Filme("Taxi Driver", 5.0);
		
		System.out.println("Filmes: ");
		filme1.exibir();
		filme2.exibir();
	}
	
	public static void atividadeTres()
	{
//		Crie a classe Funcionario com atributos privados: nome (String) e salario (double).
//		Valide: nome não vazio; salário ≥ 0.
//		Método aumentarSalario(double percentual) que aumenta o salário com base no percentual (ex: 10%).
//		No main, crie um funcionário, aumente o salário e mostre antes e depois.
		var func1 = new Funcionario("Mendes", 2935.54);
		System.out.println("Funcionário: " + func1.getNome());
		System.out.println("Salário antes do acréscimo: R$" + func1.getSalario());
		
		func1.aumentarSalario(10.0);
		
		System.out.println("Salário após o acréscimo: R$" + func1.getSalario());
	}
	
	public static void atividadeQuatro() {
//		Crie a classe Retangulo com largura e altura (double) privados.
//		Valide: valores maiores que 0.
//		Métodos:
//		- area() retorna largura × altura
//		- perimetro() retorna 2 × (largura + altura)
//		No main, crie um retângulo e mostre a área e perímetro
		var retangulo = new Retangulo(2, 5);
		var areaRetangulo = retangulo.getArea();
		var perimetroRetangulo = retangulo.getPerimetro();
	
		System.out.println("Dimensões: " + retangulo.getAltura() + "cm x " + retangulo.getLargura() + "cm");
		System.out.println("Área: " + areaRetangulo);
		System.out.println("Perímetro: " + perimetroRetangulo);
	}
	
	public static void atividadeCinco() {
//		Crie a classe Musica com atributos privados: titulo (String) e duracaoSegundos (int).
//		Valide: título não vazio; duração > 0.
//		Método formatarDuracao() que retorna a duração no formato mm:ss.
//		No main, crie duas músicas e imprima título + duração formatada.
		var m1 = new Musica("Hotel California", 378);
		var m2 = new Musica("Californication", 312);
		
		System.out.println("Musica: " + m1.getTitulo() + " - Duração: " + m1.formatarDuracao() + "m");
		System.out.println("Musica: " + m2.getTitulo() + " - Duração: " + m2.formatarDuracao() + "m");
	}
	x
	public static void atividadeSeis()
	{
//		Crie a classe Pessoa com atributos privados: nome (String), peso (double) e altura (double).
//		 Valide: nome não vazio; peso e altura > 0.
//		 Método calcularIMC() que retorna peso / (altura²).
//		 Método classificacaoIMC() que retorna uma string com a faixa (ex: “Normal”, “Sobrepeso”...).
//		 No main, crie uma pessoa e exiba IMC e classificação.
		var p1 = new Pessoa("Patrick", 73.5, 1.79);
		
		var imc = p1.calcularIMC();
		
	}
}
