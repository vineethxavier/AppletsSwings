import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCase {
	private LoginEmployeeApplet objApplet;
	@BeforeEach
	void setUp() throws Exception {
		objApplet = new LoginEmployeeApplet(); 
	}
	@Test
	void test() {
		assertEquals(5, objApplet.add(3, 2));
	}

	@Test 
	void testAddCustomerBtn() {		
		
		
		assertEquals(true,objApplet.AddCustomerBtn("a","a","a","a","a","a"));

		assertNotEquals(false,objApplet.AddCustomerBtn("a","a","a","a","a","a"));

	}
	@Test
	void testAddCustomerBtnWithValue() {
		assertEquals(true,objApplet.AddCustomerBtn("a","a","a","a","a","a"));
	}
	 
	

}
