package uy.com.jenkins;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class SampleTest {

	@Test
	public void isGreaterTest() {
		Sample tester = new Sample();
		assertTrue(tester.isGreater(3, 2));
	}
	
	@Test
	public void isNotGreaterTest() {
		Sample tester = new Sample();
		assertFalse(tester.isGreater(2, 3));
	}
}
