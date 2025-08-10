package Day8;
import java.util.LinkedHashSet;
import java.util.Objects;
/*
2.	Create a LinkedHashSet of custom objects (e.g., Student with id and name):
a)	Override hashCode() and equals() properly.
b)	Add at least 3 Student objects.
c)	Try adding a duplicate student and check if it gets added.
 */
class Studentt{
	int id;
	String name;
	Studentt(int id,String name){
		this.id=id;
		this.name=name;
	}
	public boolean equals(Object obj) {
		if(this==obj) return true;
		if(!(obj instanceof Studentt)) return false;
		Studentt other=(Studentt)obj;
		return this.id==other.id && this.name.equals(other.name);
	}
	public int hashCode() {
		return Objects.hash(id,name);
	}
	public String toString() {
		return "Student{id="+id+",name="+name+"'}";
		}
}
public class DuplicateStudent {

	public static void main(String[] args) {
		LinkedHashSet<Studentt> s=new LinkedHashSet<>();
		s.add(new Studentt(10,"Sai"));
		s.add(new Studentt(22,"Naven"));
		s.add(new Studentt(31,"Anil"));
		 boolean added = s.add(new Studentt(31,"Anil"));
		
		for(Studentt i:s) {
			System.out.println(i);
		}
		System.out.println("was duplicate added? "+(added?"Yes":"No"));
	}

}
/*
output:
Student{id=10,name=Sai'}
Student{id=22,name=Naven'}
Student{id=31,name=Anil'}
was duplicate added? No
*/