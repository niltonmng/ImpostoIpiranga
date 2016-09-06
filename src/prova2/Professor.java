/*Nilton Manuel Nogueira Ginani - Turma 3 - 115211281*/
package prova2;

public class Professor extends Contribuinte {
	
	private double salario;
	private double despesas;

	public Professor(String nome, String cpf, double despesas, double salario) throws Exception {
		super(nome, cpf);
		if(salario < 0){
			throw new Exception("Salario nao pode ser menor que zero.");
		}
		if(despesas < 0){
			throw new Exception("Salario nao pode ser menor que zero.");
		}
		this.salario = salario;
		this.despesas = despesas;
	}

	public double imposto(){
		double retorno = 0.0;
		double minimo = 880.0;
		double descontoDespesas = despesas - ((despesas*50)/100);
		if(this.getSalario() <= minimo){
			retorno += salario - ((salario * 5)/100) - descontoDespesas;
		}else if(this.getSalario() > minimo && this.getSalario() / minimo <= 5){
			retorno += salario - ((salario * 10)/100) - descontoDespesas;
		}else if(this.getSalario()/minimo > 5){
			retorno += salario - ((salario * 20)/100) - descontoDespesas;
		}
		return retorno;
	}
	
	@Override
	public void modificaLimiar() {
		if(this.getBens() >= 300000.00){
			this.setAcimaLimiar(true);
		}
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String toString(){
		return "[PROFESSOR] " + super.toString();
	}	
}