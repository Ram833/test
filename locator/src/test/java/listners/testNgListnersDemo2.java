package listners;

import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import junit.framework.Assert;

@Listeners(listners.TestNgListners.class)
public class testNgListnersDemo2 {

	@Test
	public void test4() {
		System.out.println("I am inside test 1");
	}
	
	@Test
	public void test5() {
		System.out.println("I am inside test 2");
	}
	
	@Test
	public void test6() {
		System.out.println("I am inside test 3");
		throw new SkipException("this is skiped test");
	}
}
