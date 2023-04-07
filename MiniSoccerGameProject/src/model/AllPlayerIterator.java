package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import model.players.GamePlayer;

public class AllPlayerIterator implements Iterator<GamePlayer>{

	
	private List<GamePlayer> allPlayer;
	private int f = 0;
	
	public AllPlayerIterator(Collection<GamePlayer> gp) {
		this.allPlayer = new ArrayList<GamePlayer>(gp);
	}
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return f < allPlayer.size();
	}

	@Override
	public GamePlayer next() {
		// TODO Auto-generated method stub
		return allPlayer.get(f++);
	}

}
