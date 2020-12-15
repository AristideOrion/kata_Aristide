package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import kata.Fraction;
import kata.OperationsOnFraction;

public class OperationsOnFractionsTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddition() {
		OperationsOnFraction operFraction=new OperationsOnFraction();
		Fraction fractionexpected=new Fraction(3,2);
		Assert.assertEquals(fractionexpected.returnFraction(), operFraction.addition(new Fraction(1, 2), new Fraction(2,2)).returnFraction());
	}

}
