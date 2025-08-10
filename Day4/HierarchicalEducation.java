//4.	Create Hierarchical inheritance for flowchart.
package Day4;

class After_12th{
	void careerOptions() {
		System.out.println("Career options after Intermediate: Engineering, Medical, Others");
	}
}
class Engineering extends After_12th{
	void chooseOptions() {
		System.out.println("You choose engineering");
		System.out.println("Engineering groups: IT, Mechanical, Cs");
	}
}

class IT extends Engineering{
	void course() {
		System.out.println("You choose IT");
	}
}
class CS extends Engineering{
	void course() {
		System.out.println("You choose CS");
	}
}
class Mechanical extends Engineering{
	void course() {
		System.out.println("You choose Mechanical");
	}
}

class Medical extends After_12th{
	void chooseOptions() {
		System.out.println("You choose Medical courses");
		System.out.println("Medical courses: MBBS, BDS");
	}
}

class MBBS extends Medical{
	void course() {
		System.out.println("You choose MBBS");
	}
}
class BDS extends Medical{
	void course() {
		System.out.println("You choose BDS");
	}
}

class Other_courses extends After_12th{
	void chooseOptions() {
		System.out.println("You can also choose others courses: BCA, BBA");
	}
}
class BCA extends Other_courses{
	void course() {
		System.out.println("You choose BCA");
	}
}
class BBA extends Other_courses{
	void course() {
		System.out.println("You choose BBA");
	}
}

public class HierarchicalEducation {

	public static void main(String[] args) {
		System.out.println(".........After 12th Career Paths...........");
		IT it=new IT();
		it.careerOptions();
		it.chooseOptions();
		it.course();
		System.out.println();
		
		/*MBBS mbbs=new MBBS();
		mbbs.careerOptions();
		mbbs.chooseOptions();
		mbbs.course();
		System.out.println();
		
		BCA bca=new BCA();
		bca.careerOptions();
		bca.chooseOptions();
		bca.course();
		System.out.println();*/
	}

}
/*
output:
.........After 12th Career Paths...........
Career options after Intermediate: Engineering, Medical, Others
You choose engineering
Engineering groups: IT, Mechanical, Cs
You choose IT
*/