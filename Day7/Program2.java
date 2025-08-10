package Day7;
/*
 2 Create a thread by implementing the Runnable interface that prints the current thread name.
 */
public class Program2 {

	public static void main(String[] args) {
		MyRunnable runnable = new MyRunnable();
	     Thread t1 = new Thread(runnable);
	     t1.start();
	}

}
class MyRunnable implements Runnable {
 public void run() {
     System.out.println("Current thread name: " + Thread.currentThread().getName());
 }
}
//output:
//Current thread name: Thread-0