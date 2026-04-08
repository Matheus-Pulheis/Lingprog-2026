package entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {
		
		private LocalDateTime moment;
		private OrderStatus status;
		private Client client;	
		private List<OrderItem> items = new ArrayList<>();
		
		
		public Order() {
			
		}
		
		public Order(LocalDateTime moment2, OrderStatus status, Client client) {
			this.moment = moment2;
			this.status = status;
			this.client = client;
		}
		
		public LocalDateTime getMoment() {
			return moment;
		}

		public void setMoment(LocalDateTime moment) {
			this.moment = moment;
		}

		public OrderStatus getStatus() {
			return status;
		}

		public void setStatus(OrderStatus status) {
			this.status = status;
		}

		public Client getClient() {
			return client;
		}

		public void setClient(Client client) {
			this.client = client;
		}

		public void addItem(OrderItem item) {
			items.add(item);
		}
		
		public void removeItem(OrderItem item) {
			items.remove(item);
		}
		
		public Double total() {
			double sum = 0;
			for(OrderItem item : items) {
				sum += item.subTotal();
			}
			return sum;
		}
		
		public String toString() {
		    StringBuilder sb = new StringBuilder();
		    
		    for (OrderItem item : items) {
		        sb.append(item + "\n"); 
		    }
		    
		    return sb.toString();
		}
}
