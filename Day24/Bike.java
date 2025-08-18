package ttestpack2;

import org.testng.annotations.Test;

public class Bike {
  @Test
  public void model() {
	  System.out.println("Fz is a model of Bike");
	  System.out.println(Thread.currentThread().getId());
  }
  @Test
  public void speed() {
	  System.out.println("bike is move faster than car");
	  System.out.println(Thread.currentThread().getId());
  }
}
