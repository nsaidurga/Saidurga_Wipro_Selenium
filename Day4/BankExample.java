/*
 3.	Create a Bank class with a method getInterestRate()           
 create subclasses:                                           
 SBIreturn 6.7%                                            
 ICICIreturn 7.0%                                             
 HDFCreturn 7.5%
 */

package Day4;

class Bank{
	void getInterestRate() {
		System.out.println("Interest Rate:");
	}
}
class SBI extends Bank{
	void getInterestRate() {
		System.out.println("SBI gives 6.7%");
	}
}
class ICICI extends Bank{
	void getInterestRate() {
		System.out.println("ICICI gives 7.0%");
	}
}
class HDFC extends Bank{
	void getInterestRate() {
		System.out.println("HDFC gives 7.5%");
	}
}

public class BankExample {

	public static void main(String[] args) {
		Bank b=new Bank();
		SBI s=new SBI();
		ICICI i=new ICICI();
		HDFC h=new HDFC();
		
		b.getInterestRate();
		s.getInterestRate();
		i.getInterestRate();
		h.getInterestRate();
	}

}
/*
output:
Interest Rate:
SBI gives 6.7%
ICICI gives 7.0%
HDFC gives 7.5%
*/