package Day9;
/*
  Q9. Write a program that sorts a list of cities by population using Comparator.
 */
import java.util.*;

class City {
 String name;
 int population;

 public City(String name, int population) {
     this.name = name;
     this.population = population;
 }

 @Override
 public String toString() {
     return "City: " + name + ", Population: " + population;
 }
}

public class CitySortByPopulation {
 public static void main(String[] args) {
     List<City> cities = new ArrayList<>();
     cities.add(new City("Mumbai", 20400000));
     cities.add(new City("Delhi", 16700000));
     cities.add(new City("Bangalore", 12300000));
     cities.add(new City("Chennai", 10000000));
     
     cities.sort(Comparator.comparingInt(c -> c.population));

     System.out.println("\nAfter Sorting by Population (Ascending):");
     for (City c : cities) {
         System.out.println(c);
     }

 }
}
/*
output:
After Sorting by Population (Ascending):
City: Chennai, Population: 10000000
City: Bangalore, Population: 12300000
City: Delhi, Population: 16700000
City: Mumbai, Population: 20400000
*/