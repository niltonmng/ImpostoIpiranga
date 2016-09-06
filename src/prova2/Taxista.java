/*Nilton Manuel Nogueira Ginani - Turma 3 - 115211281*/
package prova2;

public class Taxista extends Rodoviario {

	private int passageiros;
	
	public Taxista(String nome, String cpf, int quilometros, int passageiros) throws Exception {
		super(nome, cpf, quilometros);
		if(passageiros < 0){
			throw new Exception("Passageiros nao pode ser menor que zero.");
		}
		this.passageiros = passageiros;
	}
	
	public double imposto(){
		return this.impostoRodoviario() + (this.getPassageiros() * 0.5);
	}

	public int getPassageiros() {
		return passageiros;
	}

	public void setPassageiros(int passageiros) {
		this.passageiros = passageiros;
	}
	
	public String toString(){
		return "[TAXISTA] " + super.toString();
	}

	@Override
	public void modificaLimiar() {
		if(this.getBens() >= 150000.00){
			this.setAcimaLimiar(true);
		}
	}	
}
