/*Nilton Manuel Nogueira Ginani - Turma 3 - 115211281*/
package prova2;

public abstract class Contribuinte {
	
	private String nome;
	private String cpf;
	private double bens;
	private boolean acimaLimiar;
	
	public Contribuinte(String nome, String cpf) throws Exception{
		if(nome == null || nome.trim().isEmpty()){
			throw new Exception("Nome invalido.");
		}
		if(cpf == null || cpf.trim().isEmpty()){
			throw new Exception("CPF invalido.");
		}
		this.nome = nome;
		this.cpf = cpf;
		this.bens = 0.0;
		this.acimaLimiar = false;
	}
	
	public abstract void modificaLimiar();
	public abstract double imposto();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getBens() {
		return bens;
	}

	public void setBens(double bens) {
		this.bens = bens;
	}
	
	public String toString(){
		String retorno = this.nome + ", " + this.cpf + ".";
		return retorno;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Contribuinte){
			Contribuinte iisbr = (Contribuinte) obj;
			if(this.getCpf().equalsIgnoreCase(iisbr.getCpf())){
				if(this.toString().equalsIgnoreCase(iisbr.toString())){
					return true;
				}
			}
		}
		return false;
	}

	public boolean isAcimaLimiar() {
		return acimaLimiar;
	}

	public void setAcimaLimiar(boolean acimaLimiar) {
		this.acimaLimiar = acimaLimiar;
	}
}