package junittest;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


	public class TestJunit{
		@BeforeClass
		public static void testEnvSetup() throws Exception {
			System.out.println("set up test environment");
		}
		@Before
		public void testCaseSetup() throws Exception{
			System.out.println("before test case");
			
		}
		@After
		public void testWindup() throws Exception{
			System.out.println("after test case");
			
		}
		@Test
		public void testFindMax() {
			System.out.println("test case find max");
			assertEquals(4,AssertequalsTest.findMax(new int[] {1,2,3,4}));
			assertEquals(-1,AssertequalsTest.findMax(new int[] {-1,-2,-4,-5}));
			assertEquals(125,AssertequalsTest.cube(5));
		}
		
	}

