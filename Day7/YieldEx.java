package Day7;
/*
 5  Create a thread and use Thread.yield() to pause and give chance to another thread.
 */
public class YieldEx extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
			Thread.yield();
		}
	}
	public static void main(String[] args) {
		YieldEx y1=new YieldEx();
		YieldEx y2=new YieldEx();
		y1.setName("Thread A");
		y2.setName("Thread B");
		y1.start();
		y2.start();
	}

}
/*
output:
Thread B 1
Thread B 2
Thread B 3
Thread A 1
Thread B 4
Thread B 5
Thread A 2
Thread A 3
Thread A 4
Thread A 5
*/