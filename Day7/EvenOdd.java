package Day7;
/*
 6  Implement a program where two threads print even and odd numbers respectively.
 */
class EvenThread extends Thread {
    public synchronized void run() {
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("Even: " + i);
        }
    }
}

class OddThread extends Thread {
    public void run() {
        for (int i = 1; i < 10; i += 2) {
            System.out.println("Odd: " + i);
        }
    }
}

public class EvenOdd {

	public static void main(String[] args) {
		EvenThread even = new EvenThread();
        OddThread odd = new OddThread();
        even.start();
        odd.start();
	}

}
/*output:
Even: 2
Even: 4
Even: 6
Even: 8
Even: 10
Odd: 1
Odd: 3
Odd: 5
Odd: 7
Odd: 9
*/