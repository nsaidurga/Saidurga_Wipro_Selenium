package Day7;
/*
 7  Create a program that starts three threads and sets different priorities for them.
 */
public class PriorityThread extends Thread{
	public void run() {
			System.out.println(Thread.currentThread().getName()+" IS EXECUTED WITH PRIORITY OF "+Thread.currentThread().getPriority());
	}
	public static void main(String[] args) {
		PriorityThread t1=new PriorityThread();
		PriorityThread t2=new PriorityThread();
		PriorityThread t3=new PriorityThread();
		t1.setName("Thread A");
		t2.setName("Thread B");
		t3.setName("Thread C");
		t1.setPriority(MIN_PRIORITY);
		t2.setPriority(NORM_PRIORITY);
		t3.setPriority(MAX_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
		
	}

}
/*
output:
Thread A IS EXECUTED WITH PRIORITY OF 1
Thread B IS EXECUTED WITH PRIORITY OF 5
Thread C IS EXECUTED WITH PRIORITY OF 10
*/