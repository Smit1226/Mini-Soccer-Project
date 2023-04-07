package model;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collection;

import org.junit.jupiter.api.Test;

import model.players.GamePlayer;
import model.players.Goalkeeper;
import model.players.Striker;

class PlayerCollectionTest {

	private PlayerCollection pc = new PlayerCollection();
	private GamePlayer temps = new Striker("Striker",Color.blue);
	private GamePlayer tempgk = new Goalkeeper("Goalkeeper",Color.yellow);
	
	@Test
	void getPlayerTest() {	
		pc.add(temps);
		pc.add(tempgk);
		
		assertEquals(temps, pc.get("Striker"));
		assertEquals(tempgk, pc.get("Goalkeeper"));
	}
	
	@Test
	void allPlayerTest() {
		pc.add(temps);
		pc.add(tempgk);
		
		Collection<GamePlayer> cgp = new ArrayList<GamePlayer>();
		cgp.add(temps);
		cgp.add(tempgk);
		
		assertEquals(cgp, pc.getGamePlayers());
	}
}
