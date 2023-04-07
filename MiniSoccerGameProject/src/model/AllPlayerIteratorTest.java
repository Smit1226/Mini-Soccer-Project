package model;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collection;

import org.junit.jupiter.api.Test;

import model.players.GamePlayer;
import model.players.Goalkeeper;
import model.players.Striker;

class AllPlayerIteratorTest {

	private boolean iteratorCheck = false;
	@Test
	void initTest() {
		Collection<GamePlayer> c = new ArrayList<GamePlayer>();
		c.add(new Striker("Striker",Color.blue));
		c.add(new Goalkeeper("Goalkeeper",Color.yellow));
		
		AllPlayerIterator api = new AllPlayerIterator(c);
		
		for(GamePlayer gp : c) {
			if((api.hasNext()) && gp.getPlayerName()==(api.next().getPlayerName())) {
				iteratorCheck = true;
			} else {
				iteratorCheck = false;
				break;
			}
		}
		assertEquals(true, iteratorCheck);
	}

}
