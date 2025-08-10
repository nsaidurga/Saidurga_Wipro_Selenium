package Day8;

import java.util.Comparator;
import java.util.PriorityQueue;
/* PriorityQueue 
1.	Hospital Emergency Queue:
a)	Create a class Patient with fields: name and severityLevel (int).
b)	Use PriorityQueue<Patient> with a comparator to serve the most 
critical patients first (highest severityLevel).
 */
class Patient{
	String name;
	int severityLevel;
	Patient(String name,int severityLevel){
		this.name=name;
		this.severityLevel=severityLevel;
	}
	public String toString() {
		return "Patient{name= "+name+" severity: "+severityLevel+"}";
	}
}

class SortPatient implements Comparator<Patient>{
	public int compare(Patient p1,Patient p2){
		return Integer.compare(p2.severityLevel, p1.severityLevel);
	}

}
public class PriorityQPatientObj {

	public static void main(String[] args) {
		PriorityQueue<Patient> q1=new PriorityQueue<>(new SortPatient());
		
		q1.add(new Patient("Blice",4));
		q1.add(new Patient("Varun",9));
		q1.add(new Patient("Anil",6));

        System.out.println("Merged Sorted Queue:");
        while(!q1.isEmpty()) {
        	System.out.println(q1.poll());
        }
	}

}
/* output:
 Merged Sorted Queue:
Patient{name= Varun severity: 9}
Patient{name= Anil severity: 6}
Patient{name= Blice severity: 4}
  */
 