import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {
	BowlingGame bg= new BowlingGame();
	@Test
	public void test() {
		fail("Not yet implemented");
	}


	@Test
	public void testFrameStrike() {

		Frame f= new Frame(10, 0);
		assertTrue(f.isStrike());

	}
	@Test
	public void testFramePare() {

		Frame f= new Frame(0, 10);
		assertTrue(f.isSpare());

	}
	@Test
	public void testFrameScore() {

		Frame f= new Frame(3, 5);
		assertEquals(f.score(), 8);		
	}

}
