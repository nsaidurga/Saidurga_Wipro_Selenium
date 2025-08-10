package Day7;
//11. Solve the above problem using synchronized keyword to prevent race condition.
class Counter{
	int count=0;
	public synchronized void increment() {
		count++;
	}
}
class CounterThread extends Thread{
	Counter c;
	CounterThread(Counter c){
		this.c=c;
	}
	public void run() {
		for(int i=0;i<50;i++) {
			c.increment();
		}
	}
	
}
public class RaceConditionSync {

	public static void main(String[] args) {
		Counter counter=new Counter();
		CounterThread c1=new CounterThread(counter);
		CounterThread c2=new CounterThread(counter);
		CounterThread c3=new CounterThread(counter);
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

//output: 150