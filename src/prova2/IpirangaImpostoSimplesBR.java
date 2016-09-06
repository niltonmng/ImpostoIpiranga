/*Nilton Manuel Nogueira Ginani - Turma 3 - 115211281*/
package prova2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IpirangaImpostoSimplesBR implements IpirangaIf{

	private Set<Contribuinte> contribuintes;
	
	public IpirangaImpostoSimplesBR() {
		contribuintes = new HashSet<Contribuinte>();
	}
	
	
	public void adicionarTaxista(String nome, String cpf, int quilometros,
			int passageiros) throws Exception {
		Contribuinte taxista = new 	Taxista(nome, cpf, quilometros, passageiros);
		contribuintes.add(taxista);
	}

	
	public void adicionarCaminhoneiro(String nome, String cpf, int quilometros,
			int carga) throws Exception {
		Contribuinte caminhoneiro = new Caminhoneiro(nome, cpf, quilometros, carga);
		contribuintes.add(caminhoneiro);
		
	}

	
	public void adicionarProfessor(String nome, String cpf, double despesas,
			double salario) throws Exception {
		Contribuinte professor = new Professor(nome, cpf, despesas, salario);
		contribuintes.add(professor);
		
	}

	
	public void adicionarBem(String cpf, double valor) throws Exception {
		this.buscaContribuinte(cpf).setBens(this.buscaContribuinte(cpf).getBens() + valor);
		
	}

	
	public boolean removerContribuinte(String cpf) throws Exception {
		if(this.achaContribuinte(cpf) == true){
			this.contribuintes.remove(buscaContribuinte(cpf));
			return true;
		}
		return false;
	}

	
	public double calcularImpostos(String cpf) throws Exception {
		return 0;
	}

	
	public List<String> getContribuintesOrdenadosPorImposto() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public String getString(String cpf) {
		return this.buscaContribuinte(cpf).toString();
	}

	
	public double getBens(String cpf) {
		return this.buscaContribuinte(cpf).getBens();
	}

	
	public double getImposto(String cpf) {
		return this.buscaContribuinte(cpf).imposto();
	}

	
	public Set<String> getContribuintesAcimaLimiar() {
		HashSet<String> acimaLimite = new HashSet<String>();
		for (Contribuinte contribuinte : this.contribuintes) {
			contribuinte.modificaLimiar();
			if(contribuinte.isAcimaLimiar() == true){
				acimaLimite.add(contribuinte.getCpf());
			}
		}
		return acimaLimite;
	}
	
	public Contribuinte buscaContribuinte(String cpf){
		for (Contribuinte contribuinte : this.contribuintes) {
			if(contribuinte.getCpf().equals(cpf)){
				return contribuinte;
			}
		}
		return null;
	}
	
	public boolean achaContribuinte(String cpf){
		for (Contribuinte contribuinte : this.contribuintes) {
			if(contribuinte.getCpf().equals(cpf)){
				return true;
			}
		}
		return false;
	}

}
