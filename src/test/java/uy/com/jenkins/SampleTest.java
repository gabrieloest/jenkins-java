package uy.com.jenkins;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class SampleTest {

	@BeforeAll
	public static void beforeClass() {
		System.out.println("Before Class");
	}

	@BeforeEach
	public void before() {
		System.out.println("Before Test Case");
	}

	@Test
	public void isGreaterTest() {
		System.out.println("Test");
		Sample tester = new Sample();
		assertTrue("Num 1 is greater than Num 2", tester.isGreater(2, 3));
	}

	@AfterEach
	public void after() {
		System.out.println("After Test Case");
	}

	@AfterAll
	public static void afterClass() {
		System.out.println("After Class");
	}
}
