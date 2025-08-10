package Day7;
//12. Write a Java program using synchronized block to ensure mutual exclusion.
class Counterr{
	int count=0;
	Object lock=new Object();
	public void increment() {
		synchronized (lock) {
		count++;
		}
	}
}
class CounterThreadd extends Thread{
	Counterr c;
	CounterThreadd(Counterr c){
		this.c=c;
	}
	public void run() {
		for(int i=0;i<50;i++) {
			c.increment();
		}
	}
	
}
public class RaceSyncBlock {

	public static void main(String[] args) {
		Counterr counter=new Counterr();
		CounterThreadd c1=new CounterThreadd(counter);
		CounterThreadd c2=new CounterThreadd(counter);
		CounterThreadd c3=new CounterThreadd(counter);
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