package entities;

public class OutsourcedEmployee extends Employee {

			private Double additionalCharge;
			
			
	public OutsourcedEmployee(String name, Integer hour, Double valorPerHour, Double additionalCharge ) {
		super(name, hour, valorPerHour);
		this.additionalCharge = additionalCharge;
	}
	
	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}

	@Override
	public Double payment() {
		return (valorPerHour * hour) + (additionalCharge * 1.10);
	}
}
