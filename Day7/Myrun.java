package Day7;
//18 Demonstrate the use of Thread.isAlive() to check thread status.
class Myrun1 implements Runnable{
	public void run() {
		for(int i=1;i<=2;i++) {
			System.out.println("Hello");
		}
		System.out.println("Current thread name="+Thread.currentThread().getName());
	}
}
public class Myrun {

	public static void main(String[] args) {
		Myrun1 t=new Myrun1();
		Thread t1=new Thread(t);
		Thread t2=new Thread(t);
		
		System.out.println(t1.isAlive());
		t1.start();
		t2.start();
		System.out.println(t2.isAlive());
	}

}
/*
output:
false
true
Hello
Hello
Hello
Hello
Current thread name=Thread-1
Current thread name=Thread-0
*/