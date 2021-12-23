package Exercise2_TheoreticalWork2.Exercise_2;

import static org.junit.Assert.assertEquals;
import org.junit.Assert;

import org.junit.Before;
import org.junit.Test;


public class TestTransportPlan {

	private TransportPlan t;

	@Before
	public void setUp() throws Exception {
		t = new TransportPlan(0, 7, 40);
	}

	@Test
	public void testIA() {
		assertEquals(t.getIA(), 0);
		t.setIA(200);
		assertEquals(t.getIA(), 200);
	}

	@Test
	public void testSt_price() {
		assertEquals(t.getSt_price(), 7, 0);
		t.setSt_price(8);
		assertEquals(t.getSt_price(), 8, 0);
	}

	@Test
	public void testSeats() {
		assertEquals(t.getSeats(), 40);
		t.setSeats(50);
		assertEquals(t.getSeats(), 50);
	}

	@Test
	public void testGetPrice() throws InvalidPassenger {

		assertEquals(t.calculatePrice(24, false, false), 7.0, 0);
	}

    //Exception testing
  
    @Test
    public void testUsernameTooShort() throws InvalidPassenger {
    	try {
    	    assertEquals("You can't travel.", t.calculatePrice(24, true, false));
    	    Assert.fail( "Should have thrown an exception" );
    	} 
    	catch (Exception e) {
    	    String expectedMessage = "You can't travel.";
    	    Assert.assertEquals( "Exception message must be correct", expectedMessage, e.getMessage() );
    	}
    }

    @Test
	public void testCalculatePrice() throws InvalidPassenger{
		t.calculatePrice(-80000, false, false);
		t.calculatePrice(-65535, false, false);
		t.calculatePrice(-65534, false, false);
		t.calculatePrice(-65536, false, false);
		t.calculatePrice(-60000, false, false);
		t.calculatePrice(-1, false, false);
		t.calculatePrice(0, false, false);
		t.calculatePrice(1, false, false);
		t.calculatePrice(22, false, false);
		t.calculatePrice(23, false, false);
		t.calculatePrice(24, false, false);
		t.calculatePrice(65, false, false);
		t.calculatePrice(64, false, false);
		t.calculatePrice(66, false, false);
		t.calculatePrice(60000, false, false);
		t.calculatePrice(65535, false, false);
		t.calculatePrice(65534, false, false);
		t.calculatePrice(65536, false, false);
		t.calculatePrice(80000, false, false);
	}
	
	@Test
	public void test1() throws InvalidPassenger {

		int age = 0;
		boolean ill_Suspected = false;
		boolean essential = false;
		int IA = 35;
		double default_price = 7.50;
		int seats = 50;
		
		TransportPlan plan = new TransportPlan(IA, default_price, seats);
		assertEquals(3, plan.calculatePrice(age, ill_Suspected, essential),0);
	}
	
	@Test
	public void test2() throws InvalidPassenger {

		int age = 26;
		boolean ill_Suspected = false;
		boolean essential = false;
		int IA = 30;
		double default_price = 7.50;
		int seats = 50;
		
		TransportPlan plan = new TransportPlan(IA, default_price, seats);
		assertEquals(7.5, plan.calculatePrice(age, ill_Suspected, essential),0);
	}
	
	@Test
	public void test3() throws InvalidPassenger {

		int age = 78;
		boolean ill_Suspected = false;
		boolean essential = false;
		int IA = 45;
		double default_price = 7.50;
		int seats = 50;
		
		TransportPlan plan = new TransportPlan(IA, default_price, seats);
		assertEquals(1.5, plan.calculatePrice(age, ill_Suspected, essential),0);
	}
	
	@Test
	public void test4() throws InvalidPassenger {

		int age = 7;
		boolean ill_Suspected = false;
		boolean essential = false;
		int IA = 156;
		double default_price = 7.50;
		int seats = 50;
		
		TransportPlan plan = new TransportPlan(IA, default_price, seats);
		assertEquals(5.25, plan.calculatePrice(age, ill_Suspected, essential),0);
	}
	
	@Test
	public void test5() throws InvalidPassenger {

		int age = 27;
		boolean ill_Suspected = false;
		boolean essential = false;
		int IA = 156;
		double default_price = 8;
		int seats = 50;
		
		TransportPlan plan = new TransportPlan(IA, default_price, seats);
		assertEquals(8, plan.calculatePrice(age, ill_Suspected, essential),0);
	}
	
	@Test
	public void test6() throws InvalidPassenger {

		int age = 27;
		boolean ill_Suspected = false;
		boolean essential = false;
		int IA = 256;
		double default_price = 8;
		int seats = 50;
		
		TransportPlan plan = new TransportPlan(IA, default_price, seats);
		assertEquals(8, plan.calculatePrice(age, ill_Suspected, essential),0);
	}
	
	@Test
	public void test7() throws InvalidPassenger {

		int age = 27;
		boolean ill_Suspected = false;
		boolean essential = false;
		int IA = 456;
		double default_price = 8;
		int seats = 50;
		
		TransportPlan plan = new TransportPlan(IA, default_price, seats);
		assertEquals(8, plan.calculatePrice(age, ill_Suspected, essential),0);
	}
	
	@Test
	public void test8() throws InvalidPassenger {

		int age = 27;
		boolean ill_Suspected = false;
		boolean essential = false;
		int IA = 456;
		double default_price = 8;
		int seats = 50;
		
		TransportPlan plan = new TransportPlan(IA, default_price, seats);
		assertEquals(8, plan.calculatePrice(age, ill_Suspected, essential),0);
	}
	
	@Test
	public void test9() throws InvalidPassenger {

		int age = 27;
		boolean ill_Suspected = false;
		boolean essential = true;
		int IA = 456;
		double default_price = 8;
		int seats = 50;
		
		TransportPlan plan = new TransportPlan(IA, default_price, seats);
		assertEquals(8,plan.calculatePrice(age, ill_Suspected, essential),0);
	}
	
	@Test
	public void test10() throws InvalidPassenger {

		int age = 27;
		boolean ill_Suspected = false;
		boolean essential = true;
		int IA = 556;
		double default_price = 8;
		int seats = 50;
		
		TransportPlan plan = new TransportPlan(IA, default_price, seats);
		assertEquals(8,plan.calculatePrice(age, ill_Suspected, essential),0);
	}
	
	@Test
	public void test11() throws InvalidPassenger {

		int age = 28;
		boolean ill_Suspected = false;
		boolean essential = false;
		int IA = 556;
		double default_price = 8;
		int seats = 50;
		
		TransportPlan plan = new TransportPlan(IA, default_price, seats);
		assertEquals(8,plan.calculatePrice(age, ill_Suspected, essential),0);
	}
	
	@Test
	public void test12() throws InvalidPassenger {

		int age = 28;
		boolean ill_Suspected = false;
		boolean essential = true;
		int IA = 220;
		double default_price = 8;
		int seats = 50;
		
		TransportPlan plan = new TransportPlan(IA, default_price, seats);
		assertEquals(8,plan.calculatePrice(age, ill_Suspected, essential),0);
	}
	
	@Test
	public void test13() throws InvalidPassenger {

		int age = 12;
		boolean ill_Suspected = false;
		boolean essential = true;
		int IA = 520;
		double default_price = 8;
		int seats = 50;
		
		TransportPlan plan = new TransportPlan(IA, default_price, seats);
		assertEquals(12,plan.calculatePrice(age, ill_Suspected, essential),0);
	}



}