//8. Write a program to convert a double value to an int without data loss.
package Day1;

public class NoDataloss {
    public static void main(String[] args) {
        double d = 123.0; 
       d = (int) d;
            int i = (int) d;
            System.out.println(i);
    }
}

/*
output:
123
*/