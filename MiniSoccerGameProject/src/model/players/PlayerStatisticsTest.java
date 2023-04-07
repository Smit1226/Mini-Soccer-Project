package model.players;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PlayerStatisticsTest {

	@Test
	void getSetStatsTest() {
		PlayerStatistics pst = new PlayerStatistics();
		pst.setStatistics(10);
		assertEquals(10,pst.getStatistics());
		pst.setStatistics(20);
		assertEquals(20,pst.getStatistics());
		pst.setStatistics(0);
		assertEquals(0,pst.getStatistics());
	}

}
