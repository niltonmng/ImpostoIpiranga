/*Nilton Manuel Nogueira Ginani - Turma 3 - 115211281*/
package prova2;

public abstract class Rodoviario extends Contribuinte {

	private int quilometros;
	
	public Rodoviario(String nome, String cpf, int quilometros) throws Exception {
		super(nome, cpf);
		if(quilometros < 0){
			throw new Exception("Quilometros nao pode ser menor que zero.");
		}
		this.quilometros = quilometros;
	}
	
	public double impostoRodoviario(){
		double retorno = 0.0;
		retorno += this.getBens() - (this.getQuilometros() * 0.01);
		return retorno;
	}

	public int getQuilometros() {
		return quilometros;
	}

	public void setQuilometros(int quilometros) {
		this.quilometros = quilometros;
	}
	
	

}
