package rpg_game;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class BotaPrataTest {


	@Test
	public void testeAtribuirHabilidadesBotaPrata() {

		BotaPrata bp = new BotaPrata();
		
		bp.setForca(2); 
		assertEquals(bp.getForca(), 2);
		
		bp.setAgilidade(10);  
		assertEquals(bp.getAgilidade(), 10);
		
		bp.setForca(50);
		assertEquals(bp.getForca(), 50);
		
		bp.setInteligencia(100);
		assertEquals(bp.getInteligencia(), 100);
		
		assertNotNull(bp.getNomeBota());
	}

}
