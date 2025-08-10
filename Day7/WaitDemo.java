//14. Create a Producer-Consumer problem using wait() and notify().
package Day7;
class Shared{
	int num;
	boolean ready=false;
	synchronized void produce(int n) {
		if(ready) return;
		num=n;
		System.out.println("Produced: "+num);
		ready=true;
		notify();
	}
	synchronized void consume() {
		while(!ready) {
			try {
				wait();
			}
			catch(Exception e) {
				
			}
		}
		System.out.println("Consumed: "+num);
	}
}
public class WaitDemo {

	public static void main(String[] args) {
		Shared s=new Shared();
		new Thread(()->s.produce(4)).start();
		new Thread(()->s.consume()).start();
	}

}
