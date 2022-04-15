package rpg_game;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class MagoTest {
		
	@Test
	public void MagoValidarTest() {
		Mago merlin = new Mago("merlin");
		assertNotNull(merlin);		
	}
	
	@Test
	public void testeAtribuirHabilidadesMago() {
		Mago merlin = new Mago("merlin");
		merlin.setForca(2);
		assertEquals( merlin.getForca(), 2);
		 
		merlin.setAgilidade(5);
		assertEquals( merlin.getAgilidade(), 5);
		
		merlin.setFuncao("Magias e Encantamentos");
		assertNotNull(merlin.getFuncao());
		
		merlin.setHp(150);
		assertEquals(merlin.getHp(), 150);
		
		merlin.setInteligencia(10);
		assertEquals(merlin.getInteligencia(), 10);
		
		merlin.setLevel(2);
		assertEquals(merlin.getLevel(), 2);

		merlin.setMana(5);
		assertEquals(merlin.getMana(), 1000);
		
		assertNotNull("sem nome", merlin.getNome());

		assertEquals(merlin.ataque(), 5);
		assertEquals(merlin.ataque2(), 6);
		
		merlin.lvlUp();
		assertEquals(merlin.getLevel(), 3);
		assertEquals(merlin.getForca(), 3);
		assertEquals(merlin.getAgilidade(), 6);
		assertEquals(merlin.getInteligencia(), 13);
		

	}
	
	}


