package entities;

import Exeções.DomainException;

public class Account {

		Integer number;
		String holder;
		Double balance;
		Double withdrawlimit;

		public Account() {

		}

		public Account(Integer number, String holder, Double balance, Double withdrawlimit) {
			this.number = number;
			this.holder = holder;
			this.balance = balance;
			this.withdrawlimit = withdrawlimit;
		}

		public Integer getNumber() {
			return number;
		}

		public void setNumber(Integer number) {
			this.number = number;
		}

		public String getHolder() {
			return holder;
		}

		public void setHolder(String holder) {
			this.holder = holder;
		}

		public Double getBalance() {
			return balance;
		}


		public Double getWithdrawlimit() {
			return withdrawlimit;
		}

		public void deposit(Double deposito) {
			  balance += deposito;
		}

		public void withDraw(Double retirada) throws DomainException {
			if(retirada > withdrawlimit) {
				throw new DomainException("The amount exceeds withdraw limit");
			}
			if(retirada > balance) {
				throw new DomainException("Not enough balance");
			}
			 balance -= retirada;
		}

}