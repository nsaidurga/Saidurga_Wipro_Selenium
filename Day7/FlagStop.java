package Day7;
//9  Show how to stop a thread using a boolean flag.
public class FlagStop extends Thread{
	private boolean running=true;
	public void stopRunning() {
		running = false;
	}
	public void run() {
		while(running) {
			System.out.println("Thread is running...");
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {}
		}
		System.out.println("Thread stopped");
	}
	public static void main(String[] args) throws InterruptedException {
		FlagStop t=new FlagStop();
		t.start();
		Thread.sleep(1000);
		t.stopRunning();
	}

}
/*
output:
Thread is running...
Thread is running...
Thread is running...
Thread stopped
*/