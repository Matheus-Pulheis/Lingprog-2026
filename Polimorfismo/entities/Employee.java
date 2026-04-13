package entities;

import java.util.ArrayList;
import java.util.List;

public class Employee {

		private String name;
		protected Integer hour;
		protected Double valorPerHour;
		
		public Employee(String name, Integer hour, Double valorPerHour) {
			this.name = name;
			this.hour = hour;
			this.valorPerHour = valorPerHour;
		}
		
		public Double payment() {
			return valorPerHour * hour;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getHour() {
			return hour;
		}

		public void setHour(Integer hour) {
			this.hour = hour;
		}

		public Double getValorPerHour() {
			return valorPerHour;
		}

		public void setValorPerHour(Double valorPerHour) {
			this.valorPerHour = valorPerHour;
		}
		
		
}
