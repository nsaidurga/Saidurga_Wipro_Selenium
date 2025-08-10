//5.	 Create practice on this hospital hierarchy
package Day4;

class Hospital {
	void hospitalDetails(String name,String loc) {
		System.out.println("Name of Hospital: "+name);
		System.out.println("Location of hospital: " + loc);
	}
}

class Doctor extends Hospital {
	void doctorDetails() {
		System.out.println("Doctor details");
	}
}

class Nurse extends Hospital {
	void nurseDetails() {
		System.out.println("Nurse Department");
	}
}

class Gynac extends Doctor {
	void doctorInfo(String name,String typeOfDoc, String availableTime) {
		System.out.println("Doctor name: " + name);
		System.out.println("Available at: " + availableTime);
	}
}

class Endo extends Doctor {
	void doctorInfo(String name,String typeOfDoc, String availableTime) {
		System.out.println("Doctor name: " + name);
		System.out.println("Available at: " + availableTime);
	}
}

class Cardiac extends Doctor {
	void doctorInfo(String name,String typeOfDoc, String availableTime) {
		System.out.println("Doctor name: " + name);
		System.out.println("Type: "+typeOfDoc);
		System.out.println("Available at: " + availableTime);
	}
}

class Operation extends Cardiac {
	void operationDetails() {
		System.out.println("Operation Details");
	}
}

class OPD extends Cardiac {
	void opdDetails() {
		System.out.println("OP department");
	}
}

class Accountant extends Hospital {
	void accountantDetails() {
		System.out.println("Accountant Details");
	}
}

class Payment extends Accountant {
	void getPaymentGetails() {
		System.out.println("Payment details");
	}
}

class Documentation extends Accountant {
	void getDocumentationDetails() {
		System.out.println("Patient Document details");
	}
}

public class Hospital_Details {

	public static void main(String[] args) {
		System.out.println("Op Details..................");
		Operation op=new Operation();
		op.hospitalDetails("GVP","Vizag");
		op.doctorDetails();
		op.doctorInfo("Mrs.Ramani","Cardiac doctor", "11am");
		op.operationDetails();
		
		System.out.println();
		
		System.out.println("Payment Details............");
		Payment p=new Payment();
		p.hospitalDetails("GVP","Vizag");
		p.accountantDetails();
		p.getPaymentGetails();
	}

}

/*
output:
Op Details..................
Name of Hospital: GVP
Location of hospital: Vizag
Doctor details
Doctor name: Mrs.Ramani
Type: Cardiac doctor
Available at: 11am
Operation Details

Payment Details............
Name of Hospital: GVP
Location of hospital: Vizag
Accountant Details
Payment details
*/