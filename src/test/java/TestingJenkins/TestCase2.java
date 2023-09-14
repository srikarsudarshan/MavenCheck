package TestingJenkins;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase2 {
  @Test
  public void tu() {
	  
	  String name = "Turkey";
	  
	  Assert.assertEquals(name, "Turkey");
	   System.out.println("The Given Country is correct as : " +name);  
  
  }
  
  @Test
  public void chi() {
	  
	  String name = "China";
	  
	  Assert.assertEquals(name, "China");
	   System.out.println("The Given Country is correct as : " +name);  
  
  }
  
  @Test
  public void no() {
	  
	  String name = "Norway";
	  
	  Assert.assertEquals(name, "Norway");
	   System.out.println("The Given Country is correct as : " +name);  
  
  }
  
  @Test
  public void sa() {
	  
	  String name = "South Africa";
	  
	  Assert.assertEquals(name, "South Africa");
	   System.out.println("The Given Country is correct as : " +name);  
  
  }
  
}
