/*Nilton Manuel Nogueira Ginani - Turma 3 - 115211281*/
package prova2;

public class Caminhoneiro extends Rodoviario{
	
	private int carga;
	
	public Caminhoneiro(String nome, String cpf, int quilometros, int carga) throws Exception {
		super(nome, cpf, quilometros);
		if(carga < 0){
			throw new Exception("Carga nao pode ser menor que zero.");
		}
		this.carga = carga;
	}
	
	public double imposto(){
		double taxa = 500.0;
		double retorno = 0.0;
		if(this.getCarga() <= 10){
			taxa *= this.getCarga();
			retorno = this.impostoRodoviario() + taxa;	
		}else{
			int cargaExcedente = carga - 10;
			taxa = 500 + (cargaExcedente * 100);
			retorno = this.impostoRodoviario() + taxa;
		}
		return retorno;
	}
	
	@Override
	public void modificaLimiar() {
		if(this.getBens() >= 100000.00){
			this.setAcimaLimiar(true);
		}
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}
	
	public String toString(){
		return "[CAMINHONEIRO] " + super.toString();
	}	
}