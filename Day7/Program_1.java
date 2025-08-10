package Day7;
/*
 1 Write a program to create a thread by 
 extending the Thread class and print numbers from 1 to 5.
 4. Demonstrate the use of Thread.sleep() by pausing execution between numbers from 1 to 3.
 */
public class Program_1 {

	public static void main(String[] args) {
		MyThread t1 = new MyThread();
	     t1.start();
	}

}
class MyThread extends Thread {
 public void run() {
     for (int i = 1; i <= 5; i++) {
         System.out.println(i);
         try {
             Thread.sleep(500);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
     }
 }
}

/*
output:
1
2
3
4
5
*/