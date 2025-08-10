/*
  Contract Programming: Printer Switch
•	Declare an interface Printer with method void print(String document).
•	Implement two classes: LaserPrinter and InkjetPrinter, each providing unique behavior.
•	In the client code, declare Printer p;, switch implementations at runtime, and test printing.
 */
package Day5;

interface Printer{
	void print(String document);
}
class LaserPrinter implements Printer{
	@Override
	public void print(String document) {
		System.out.println("Laser printing: "+document.toUpperCase());
	}
}
class InkjetPrinter implements Printer{
	@Override
	public void print(String document) {
		System.out.println("Inkjet printing: "+document);
	}
}
public class PrinterSwitchTest {

	public static void main(String[] args) {
		Printer p;
		p=new LaserPrinter();
		p.print("Project Report");
		
		p=new InkjetPrinter();
		p.print("Photo Album");
	}

}

/*
output:
Laser printing: PROJECT REPORT
Inkjet printing: Photo Album
*/