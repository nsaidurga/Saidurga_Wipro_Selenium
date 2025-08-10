package Day9;
/*
 Q8. Sort Employee objects by joining date using Comparator.
Use Comparator to sort employees based on LocalDate or Date.
 */
import java.time.LocalDate;
import java.util.*;

class Employee1 {
    int id;
    String name;
    LocalDate joiningDate;

    public Employee1(int id, String name, LocalDate joiningDate) {
        this.id = id;
        this.name = name;
        this.joiningDate = joiningDate;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Joining Date: " + joiningDate;
    }
}

public class SortJoiningDate {
    public static void main(String[] args) {
        List<Employee1> employees = new ArrayList<>();
        employees.add(new Employee1(101, "Alice", LocalDate.of(2022, 5, 10)));
        employees.add(new Employee1(102, "Bob", LocalDate.of(2020, 3, 15)));
        employees.add(new Employee1(103, "Charlie", LocalDate.of(2021, 7, 20)));

        employees.sort(Comparator.comparing(e -> e.joiningDate));

        System.out.println("\nAfter Sorting:");
        for (Employee1 e : employees) {
            System.out.println(e);
        }
    }
}
/*
output:
After Sorting:
ID: 102, Name: Bob, Joining Date: 2020-03-15
ID: 103, Name: Charlie, Joining Date: 2021-07-20
ID: 101, Name: Alice, Joining Date: 2022-05-10
*/