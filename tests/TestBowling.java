import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {



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

	@Test
	public void testBowlingAddFrame() {
		BowlingGame bg= new BowlingGame();
		int before=((BowlingGame) bg).getFrames().size();
		bg.addFrame(new Frame(1, 1));

		assertTrue(((BowlingGame) bg).getFrames().size()-before==1);	
	}
	@Test
	public void testBowlingScore() {
		BowlingGame bg= new BowlingGame();
		bg.addFrame(new Frame(1, 4));	
		bg.addFrame(new Frame(4, 5));
		bg.addFrame(new Frame(6, 4));
		bg.addFrame(new Frame(5, 5));	
		bg.addFrame(new Frame(10, 0));
		bg.addFrame(new Frame(0, 1));
		bg.addFrame(new Frame(7, 3));
		bg.addFrame(new Frame(6, 4));
		bg.addFrame(new Frame(10, 0));
		bg.addFrame(new Frame(2, 0));
		bg.setBonus(8, 6);




assertEquals(133, bg.score());



	}
	
}
