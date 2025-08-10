/*
 3. Advanced: Bank Account with Deposit/Withdraw Logic
Transaction validation and encapsulation protection.
a)	Create a BankAccount class with private accountNumber, accountHolder, balance.
b)	Provide:
c)	deposit(double amount) — ignores or rejects negative.
d)	withdraw(double amount) — prevents overdraft and returns a boolean success.
e)	Getter for balance but no setter.
f)	Optionally override toString() to display masked account number and details.
g)	Track transaction history internally using a private list (or inner class for transaction object).
h)	Expose a method getLastTransaction() but do not expose the full internal list.

 */
package Day5;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
	private String accountNumber;
	private String accountHolder;
	private double balance = 0;

	private class Transaction {
		String type;
		double amount;

		Transaction(String type, double amount) {
			this.type = type;
			this.amount = amount;
		}

		@Override
		public String toString() {
			return type + ":$" + amount;
		}
	}

	private List<Transaction> transactionHistory = new ArrayList<>();

	public BankAccount(String accountNumber, String accountHolder, double balance) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}

	public void deposit(double amt) {
		if (amt > 0) {
			balance += amt;
			System.out.println("Deposited = " + amt);
		}
	}

	private void withdraw(double amt) {
		if (amt > 0 && amt <= balance) {
			balance -= amt;
			System.out.println("Withdraw amount= " + amt);
		} else {
			System.out.println("Invalid amount");
		}
	}

	private double getbalance() {
		System.out.println("Current balance: " + balance);
		return balance;
	}

	public String getLastTransaction() {
		if (!transactionHistory.isEmpty()) {
			return transactionHistory.get(transactionHistory.size() - 1).toString();
		} else {
			return "No transactions yet.";
		}
	}

	@Override
	public String toString() {
		String maskedAccount = "****" + accountNumber.substring(accountNumber.length() - 4);
		return "Account Holder: " + accountHolder + "\nAccount Number: " + maskedAccount + "\nBalance: $" + balance;
	}

	public static void main(String[] args) {
		BankAccount b = new BankAccount("7652738645", "Ravi", 7000);
		System.out.println(b);

		b.deposit(5560);
		b.withdraw(2050);
		b.withdraw(6000);
		b.getbalance();
		System.out.println();
		System.out.println("After Transaction:");
		System.out.println(b);
		System.out.println("Last Transaction: " + b.getLastTransaction());
	}

}


/*
 output:

Account Holder: Ravi
Account Number: ****8645
Balance: $7000.0
Deposited = 5560.0
Withdraw amount= 2050.0
Withdraw amount= 6000.0
Current balance: 4510.0

After Transaction:
Account Holder: Ravi
Account Number: ****8645
Balance: $4510.0
Last Transaction: No transactions yet.
 */