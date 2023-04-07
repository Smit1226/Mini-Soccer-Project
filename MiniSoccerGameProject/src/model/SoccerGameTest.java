package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SoccerGameTest {
	private SoccerGame sg = new SoccerGame();
	
	@Test
	void timeTest() {
		sg.setTimeRemaining(10);
		assertEquals(10, sg.getTimeRemaining());
		sg.setTimeRemaining(0);
		assertEquals(0, sg.getTimeRemaining());
		sg.setTimeRemaining(60);
		assertEquals(60, sg.getTimeRemaining());
	}
	
	@Test
	void pauseGameTest() {
		assertEquals(false,sg.isPaused());
		sg.setPaused(true);
		assertEquals(true,(sg.isPaused()));
	}
	
	@Test
	void GoalTest() {
		sg.setGoal(10);
		assertEquals(10,sg.getGoal());
		sg.setGoal(0);
		assertEquals(0,sg.getGoal());
	}
	
	@Test
	void isOverTest() {
		assertEquals(false,sg.isOver());
		sg.setOver(true);
		assertEquals(true,sg.isOver());
	}
	
	@Test
	void playersTest() {
		assertEquals("Striker",sg.getActivePlayer().getPlayerName());
	}
}
