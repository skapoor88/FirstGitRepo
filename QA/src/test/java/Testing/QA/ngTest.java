package Testing.QA;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class ngTest {
	@Test
	  public void f() {
		  System.out.println("inside Test");
		  assertEquals(false, true);
	  }

}
