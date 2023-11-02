package com.Ass;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoHardAssert {
  @Test
  public void m1() 
  {
	  Assert.assertEquals(10, 10);
	  System.out.println("1");
	  Assert.assertEquals(20, 20);
	  System.out.println("2");
	  Assert.assertEquals("cjc", "cjc");
	  System.out.println("3");
	  Assert.assertEquals(20, 10);
	  System.out.println("4");
	  Assert.assertEquals("saurabh", "cjc");
	  System.out.println("5");
	  
  }
}
