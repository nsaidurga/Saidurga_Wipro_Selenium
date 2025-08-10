//8. How do you exit from nested loops in Java?
package Day1;

public class NestedLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i * j > 4) {
                    break ;
                }
                System.out.println("i=" + i + ", j=" + j);
            }
        }
    }
}

/*
output:
i=1, j=1
i=1, j=2
i=1, j=3
i=2, j=1
i=2, j=2
*/