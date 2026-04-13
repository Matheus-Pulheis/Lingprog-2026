package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product{

		private LocalDate manufactureDate;
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		public UsedProduct(String name, Double price, LocalDate data) {
			super(name, price);
			this.manufactureDate = data;
		}

		public LocalDate getManufactureDate() {
			return manufactureDate;
		}

		public void setManufactureDate(LocalDate manufactureDate) {
			this.manufactureDate = manufactureDate;
		}
		
		@Override
		public String priceTag() {
			return name + " (used) $"+ price + "(Manufacture date: " + fmt.format(manufactureDate) + ")";
		}
		
	
}
