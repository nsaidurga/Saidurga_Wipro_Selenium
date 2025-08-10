package Day7;
/*
 10  Create a program with multiple threads that access
  a shared counter without synchronization. Show the race condition.
 */
class Counter1{
	int count=0;
	public void increment() {
		count++;
	}
}
class CounterThread1 extends Thread{
	Counter1 c;
	CounterThread1(Counter1 c){
		this.c=c;
	}
	public void run() {
		for(int i=0;i<50;i++) {
			c.increment();
		}
	}
	
}
public class RaceCondition {

	public static void main(String[] args) {
		Counter1 counter=new Counter1();
		CounterThread1 c1=new CounterThread1(counter);
		CounterThread1 c2=new CounterThread1(counter);
		CounterThread1 c3=new CounterThread1(counter);
		c1.start();
		c2.start();
		c3.start();
		try {
			c1.join();
			c2.join();
			c3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(counter.count);
	}

}
//output: 139