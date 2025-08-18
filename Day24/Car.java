package ttestpack2;

import org.testng.annotations.Test;

public class Car {
  @Test
  public void move() {
	  System.out.println("Tata is a model of Car");
	  System.out.println(Thread.currentThread().getId());
  }
  @Test
  public void speed() {
	  System.out.println("Car can move fast");
	  System.out.println(Thread.currentThread().getId());
  }
}
