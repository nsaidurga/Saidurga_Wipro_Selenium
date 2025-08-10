/*
 1.Create one employee class and in that class create instance variable, 
 local variable and static variable. 
 */
package Day3;
public class Employee {
	int eid;
	String ename;
	double sal;
	static int managerId=412;
	void employeeDetails(int eid,String name,double sal) {
		eid=eid;
		ename=name;
		sal=sal;
		
		System.out.println("Employee ID: "+eid);
		System.out.println("Employee Name: "+ename);
		System.out.println("Employee Salary: "+sal);
		System.out.println("Manager ID: "+managerId);
	}
	public static void main(String[] args) {
		
		Employee e=new Employee();
		
		System.out.println("First Employee details: ");		
		e.employeeDetails(112,"Akhil",34450.11d);
		System.out.println();
		
		System.out.println("Second Employee details: ");
		e.employeeDetails(258,"Naveen",29711.98d);
		System.out.println();
		
		System.out.println("Third Employee details: ");
		e.employeeDetails(324,"Sai",24335.87d);
	}

}
