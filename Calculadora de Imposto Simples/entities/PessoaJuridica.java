package entities;

public class PessoaJuridica extends Contribuintes {

	private Integer numfuncionarios;

	
	public PessoaJuridica(String name, Double rendaAnual, Integer numfuncionarios) {
		super(name, rendaAnual);
		this.numfuncionarios = numfuncionarios;
	}


	public Integer getNumfuncionarios() {
		return numfuncionarios;
	}


	public void setNumfuncionarios(Integer numfuncionarios) {
		this.numfuncionarios = numfuncionarios;
	}


	@Override
	public double imposto() {
		double imp=0;
		if(numfuncionarios <= 10) {
			imp = rendaAnual * 0.16;
		}
		else {
			imp = rendaAnual * 0.14;
		}
		return imp;
	}
}
