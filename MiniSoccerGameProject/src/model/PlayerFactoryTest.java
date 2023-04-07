package model;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Color;

import org.junit.jupiter.api.Test;

import model.players.GamePlayer;
import model.players.Goalkeeper;
import model.players.Striker;

class PlayerFactoryTest {

	private PlayerFactory pf = new PlayerFactory();

	private GamePlayer temps = new Striker("Striker",Color.blue);
	private GamePlayer tempgk = new Goalkeeper("Goalkeeper",Color.yellow);
	
	@Test
	void pfTest() {
		//Player 1
		assertEquals(temps.getPlayerColor(), pf.getPlayer("Striker").getPlayerColor());
		assertEquals(temps.getPlayerName(), pf.getPlayer("Striker").getPlayerName());
		assertEquals(temps.getPlayerPosition(), pf.getPlayer("Striker").getPlayerPosition());
		assertEquals(temps.getPlayerStatistics(), pf.getPlayer("Striker").getPlayerStatistics());
		
		//Player 2
		assertEquals(tempgk.getPlayerColor(), pf.getPlayer("Goalkeeper").getPlayerColor());
		assertEquals(tempgk.getPlayerName(), pf.getPlayer("Goalkeeper").getPlayerName());
		assertEquals(tempgk.getPlayerPosition(), pf.getPlayer("Goalkeeper").getPlayerPosition());
		assertEquals(tempgk.getPlayerStatistics(), pf.getPlayer("Goalkeeper").getPlayerStatistics());
	}

}
