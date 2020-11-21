package locate;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test(priority=2)
  public void f() {
	  
	  System.out.println("@test .....1");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("@Before method .....");
  }
@Test(priority=3)
public void d() {
	  
	  System.out.println("@test .....2");
  }


@Test(priority=1)
public void e() {
	  
	  System.out.println("@test .....3");
  }
  @AfterMethod
  public void afterMethod() {
	  System.out.println("@after method .....");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("@Before class .....");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("@after class .....");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("@Before test .....");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("@after test .....");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("@Before suite .....");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("@after suite .....");
  }

}
