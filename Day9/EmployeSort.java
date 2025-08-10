package Day9;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/*
  Q3. Create an Employee class and sort by name using Comparable.
Use the compareTo() method to sort alphabetically by employee names.
 */
public class EmployeSort implements Comparable<EmployeSort> {
	int id;
	String name;

	public EmployeSort(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	//for compare string name
	public int compareTo(EmployeSort s) {
		return this.name.compareTo(s.name);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	public static void main(String[] args) {
		List<EmployeSort> l=Arrays.asList(new EmployeSort(9,"Sai"),
				new EmployeSort(2,"Durga"),
				new EmployeSort(6,"Akhil")
				);
		Collections.sort(l);
		l.forEach(System.out::println);
	}

}
/*output:
Employee [id=6, name=Akhil]
Employee [id=2, name=Durga]
Employee [id=9, name=Sai]
*/