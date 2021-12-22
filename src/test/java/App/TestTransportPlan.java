package App;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import Exceptions.InvalidPassenger;

public class TestTransportPlan {

	private TransportPlan t;

	@Before
	public void setUp() throws Exception {
		t = new TransportPlan();
	}

	@Test
	public void testAge() {
		assertEquals(t.getAge(), 0);
		t.setAge(24);
		assertEquals(t.getAge(), 24);
	}

	@Test
	public void testIll_Suspected() {
		assertEquals(t.getIll_Suspected(), false);
		t.setIll_Suspected(true);
		assertEquals(t.getIll_Suspected(), true);
	}

	@Test
	public void testEssential() {
		assertEquals(t.getEssential(), false);
		t.setEssential(true);
		assertEquals(t.getEssential(), true);
	}

	@Test
	public void testGetPrice() throws InvalidPassenger {
		t.setAge(25);
		t.setEssential(false);
		t.setIll_Suspected(false);

		assertEquals(t.GetPrice(), 8.0, 0);
	}

}
