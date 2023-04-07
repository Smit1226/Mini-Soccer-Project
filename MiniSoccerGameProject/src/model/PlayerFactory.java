package model;

import java.awt.Color;

import model.players.GamePlayer;
import model.players.Goalkeeper;
import model.players.Striker;

public class PlayerFactory {

	public GamePlayer getPlayer(String string) {
		// TODO Auto-generated method stub
		if(string=="Striker") {
			return new Striker(string, Color.blue);
		} else {
			return new Goalkeeper(string, Color.yellow);
		}
	}

}
