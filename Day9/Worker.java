package Day9;
/*
Q11. Create a program where:
Student implements Comparable to sort by name
Use Comparator to sort by marks
Demonstrate both sorting techniques in the same program.
 */

import java.util.*;

public class Worker implements Comparable<Worker> {
    int id;
    String name;
    int marks;

    public Worker(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(Worker other) {
        return this.name.compareTo(other.name);
    }

    public static Comparator<Worker> MarksComparator = new Comparator<Worker>() {
        @Override
        public int compare(Worker s1, Worker s2) {
            return Integer.compare(s2.marks, s1.marks); // descending
        }
    };

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Marks: " + marks;
    }

    public static void main(String[] args) {
        List<Worker> students = new ArrayList<>();
        students.add(new Worker(101, "Charlie", 82));
        students.add(new Worker(102, "Alice", 95));
        students.add(new Worker(103, "David", 76));
        students.add(new Worker(104, "Bob", 89));

        System.out.println("Original List:");
        for (Worker s : students) {
            System.out.println(s);
        }

        // Sort by name (Comparable)
        Collections.sort(students);
        System.out.println("\nSorted by Name (Comparable):");
        for (Worker s : students) {
            System.out.println(s);
        }

        // Sort by marks (Comparator)
        Collections.sort(students, Worker.MarksComparator);
        System.out.println("\nSorted by Marks (Comparator):");
        for (Worker s : students) {
            System.out.println(s);
        }
    }
}
/*
output:
Original List:
ID: 101, Name: Charlie, Marks: 82
ID: 102, Name: Alice, Marks: 95
ID: 103, Name: David, Marks: 76
ID: 104, Name: Bob, Marks: 89

Sorted by Name (Comparable):
ID: 102, Name: Alice, Marks: 95
ID: 104, Name: Bob, Marks: 89
ID: 101, Name: Charlie, Marks: 82
ID: 103, Name: David, Marks: 76

Sorted by Marks (Comparator):
ID: 102, Name: Alice, Marks: 95
ID: 104, Name: Bob, Marks: 89
ID: 101, Name: Charlie, Marks: 82
ID: 103, Name: David, Marks: 76
*/