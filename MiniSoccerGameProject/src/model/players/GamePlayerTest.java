package model.players;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Color;
import java.awt.Point;

import org.junit.jupiter.api.Test;

class GamePlayerTest {

	@Test
	void initTest() {
		GamePlayer s = new Striker("Striker",Color.blue);
		GamePlayer gk = new Goalkeeper("Goalkeeper",Color.yellow);
		
		//Player 1
		assertEquals(Color.blue,s.getPlayerColor());
		assertEquals("Striker",s.getPlayerName());
		assertEquals(0,s.getPlayerStatistics());
		assertEquals(new Point(500,450),s.getPlayerPosition());
		
		//Player 2
		assertEquals(Color.yellow,gk.getPlayerColor());
		assertEquals("Goalkeeper",gk.getPlayerName());
		assertEquals(0,gk.getPlayerStatistics());
		assertEquals(new Point(280,70),gk.getPlayerPosition());
	}

}
