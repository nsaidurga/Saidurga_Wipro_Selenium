package Day7;
//3  Write a program to create two threads, each printing a different message 5 times.
public class MessagePrinter extends Thread{
	String message;
	MessagePrinter(String message){
		this.message=message;
	}
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println(message+" "+i);
			try {
				Thread.sleep(100);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}
	public static void main(String[] args) {
		MessagePrinter m1=new MessagePrinter("Hello everyone");
		MessagePrinter m2=new MessagePrinter("How are you");
		m1.start();
		m2.start();
	}

}
/*
output:
Hello everyone 0
How are you 0
Hello everyone 1
How are you 1
Hello everyone 2
How are you 2
How are you 3
Hello everyone 3
How are you 4
Hello everyone 4
How are you 5
Hello everyone 5
*/