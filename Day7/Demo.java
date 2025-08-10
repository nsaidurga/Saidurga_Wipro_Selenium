/*
3  Write a program to create two threads, each printing a different message 5 times.
 */
package Day7;
class Demo1 extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Hello");
		}
		System.out.println(Thread.currentThread().getName());
	}
}
public class Demo extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Welcome");
		}
		System.out.println(Thread.currentThread().getName());
		Thread.yield();
	}
	public static void main(String[] args) {
		Demo t=new Demo();
		Demo1 t1=new Demo1();
		t.start();
		t1.start();
	}

}
/*
output:
Welcome
Welcome
Welcome
Welcome
Welcome
Thread-0
Hello
Hello
Hello
Hello
Hello
Thread-1
*/