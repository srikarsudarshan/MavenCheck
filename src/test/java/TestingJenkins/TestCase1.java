package TestingJenkins;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase1 {
  @Test
  public void jp() {
	  
	  String name = "Japan";
	  
	  Assert.assertEquals(name, "Japan");
	   System.out.println("The Given Country is correct as : " +name);  
  
  }
  
  @Test
  public void po() {
	  
	  String name = "Poland";
	  
	  Assert.assertEquals(name, "Poland");
	   System.out.println("The Given Country is correct as : " +name);  
  
  }
  
  @Test
  public void ge() {
	  
	  String name = "Germany";
	  
	  Assert.assertEquals(name, "Germany");
	   System.out.println("The Given Country is correct as : " +name);  
  
  }
  
  @Test
  public void sl() {
	  
	  String name = "Srilanka";
	  
	  Assert.assertEquals(name, "Srilanka");
	   System.out.println("The Given Country is correct as : " +name);  
  
  }
  
}
