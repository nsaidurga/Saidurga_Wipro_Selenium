/*
 15  Create a program where one thread prints A-Z and another prints 1-26 alternately
 */
package Day7;
public class Alphabets {
    public static void main(String[] args) {
        Thread lettersThread = new Thread(new LettersPrinter());
        Thread numbersThread = new Thread(new NumbersPrinter());

        lettersThread.start();
        numbersThread.start();
    }
}

class LettersPrinter implements Runnable {
    public synchronized void run() {
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.println(c);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class NumbersPrinter implements Runnable {
    public synchronized void run() {
        for (int i = 1; i <= 26; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
//output: it prints alternatively