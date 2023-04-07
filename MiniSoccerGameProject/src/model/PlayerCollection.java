package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import model.players.GamePlayer;
import model.players.Goalkeeper;

public class PlayerCollection implements Collection<GamePlayer>{
	
	private Collection<GamePlayer> allPlayers;
	private int size = 0;

	public PlayerCollection(){
		allPlayers = new ArrayList<GamePlayer>();
	}
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(GamePlayer e) {
		// TODO Auto-generated method stub
		size++;
		allPlayers.add(e);
		return false;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends GamePlayer> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Iterator<GamePlayer> iterator() {
		// TODO Auto-generated method stub
		if(size==0) {
			return null;
		}
		return new AllPlayerIterator(allPlayers);
	}
	
	public Collection getGamePlayers() {
		return allPlayers;
	}
	public GamePlayer get(String string) {
		// TODO Auto-generated method stub
		for(GamePlayer gp : allPlayers) {
			if(string==gp.getPlayerName()) {
				return gp;
			}
		}
		return null;
	}
	public void sort() {
		// TODO Auto-generated method stub
		
	}

}
