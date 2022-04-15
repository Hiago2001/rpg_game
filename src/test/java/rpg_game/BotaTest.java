package rpg_game;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class BotaTest {
        Bota botinha = new Bota();

	@Test
	public void testeAtribuirHabilidadesBota() {
		
		
		botinha.setForca(2); 
		assertEquals(botinha.getForca(), 2);
		
		botinha.setAgilidade(10);
		assertEquals(botinha.getAgilidade(), 13);
		
		botinha.setForca(50);
		assertEquals(botinha.getForca(), 5);
		
		botinha.setInteligencia(120);
		assertEquals(botinha.getInteligencia(), 33);
		
		assertNotNull(botinha.getNomeBota());
	}
	
}
