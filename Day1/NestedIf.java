//6. Write a Java program using nested if statements.
package Day1;

public class NestedIf {
    public static void main(String[] args) {
        int number = 25;

        if (number > 0) {
            if (number % 2 == 0) {
                System.out.println("The number is positive and even.");
            } else {
                System.out.println("The number is positive and odd.");
            }
        } else {
            System.out.println("The number is not positive.");
        }
    }
}
/*
output:
The number is positive and odd.
*/