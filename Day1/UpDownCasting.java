
package Day1;
class Test{
	void show() {
		System.out.println("Hello");
	}
}
class Test1 extends Test{
	void display() {
		System.out.println("Welcome");
	}
	void show(){
		System.out.println("How are you");
	}
}
public class UpDownCasting {

	public static void main(String[] args) {
		Test t1=new Test();
		t1.show();
		Test t=new Test1();//upcasting
		t.show();
		Test1 tt=(Test1)t;//downcasting
		tt.display();
		tt.show();
	}

}
/*output:
Hello
How are you
Welcome
How are you
*/
