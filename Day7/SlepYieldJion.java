package Day7;
//16.write a program for combine usage of join,yield,sleep
class Test1 extends Thread {
	public void run() {
		
		try {
			for (int i = 0; i < 11; i += 2) {
				System.out.println("Thread1");
				Thread.sleep(300);
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class Test2 extends Thread {
	public void run() {
		for (int i = 1; i < 11; i += 2) {
			System.out.println("Thread2");
		Thread.yield();
		}
	}
}

class Test3 extends Thread {
	Test1 t ;
	Test2 t1;
	public Test3(Test1 t,Test2 t1) {
		this.t=t;
		this.t1=t1;
	}

	public void run() {
		
		try {
			t.join();
			t1.join();
			System.out.println("Thread3");
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

	}
}

public class SlepYieldJion {

	public static void main(String[] args) {
		Test1 t = new Test1();
	
		Test2 t1 = new Test2();
		
		Test3 t2 = new Test3(t,t1);
		
		///t.interrupt();
		t.start();
		t1.start();
		t2.start();
		
//		t1.start();
	}

}
/*
output:
Thread1
Thread2
Thread2
Thread2
Thread2
Thread2
Thread1
Thread1
Thread1
Thread1
Thread1
Thread3
*/