package entities;

public class PessoaFisica extends Contribuintes{

	
	private Double gastosSaude;
	
	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	public PessoaFisica(String name, Double rendaAnual, Double gastosSaude) {
		super(name, rendaAnual);
		this.gastosSaude = gastosSaude;
	}
	
	@Override
	public double imposto() {
		double imp=0;
		if(rendaAnual < 20000) {
			imp = rendaAnual * 0.15;
		}
		else {
			imp = (rendaAnual * 0.25) - (gastosSaude * 0.50);
		}
		return imp;
	}
	
}
