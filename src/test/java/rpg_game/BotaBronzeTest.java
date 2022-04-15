package rpg_game;

import static org.junit.Assert.*;

import org.junit.Test;

public class BotaBronzeTest {

	@Test
	public void testBotaBronze() {
        BotaBronze bb = new BotaBronze();
		
		bb.setForca(2);
		assertEquals(bb.getForca(), 2);
		
		bb.setAgilidade(10);
		assertEquals(bb.getAgilidade(), 10);
		 
		bb.setForca(50);
		assertEquals(bb.getForca(), 50);
		
		bb.setInteligencia(100);
		assertEquals(bb.getInteligencia(), 100);
		
		assertNotNull(bb.getNomeBota());
		
	}

}
