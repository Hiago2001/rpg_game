package rpg_game;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class GuerreiroTest {

	@Test
	public void GuerreiroValidarTest() {
		Guerreiro leonidas = new Guerreiro("leonidas");
		assertNotNull(leonidas);
	}

	@Test
	public void testeAtribuirHabilidadesGuerreiro() {
		Guerreiro leonidas = new Guerreiro("leonidas");
		leonidas.setForca(2);
		assertEquals(leonidas.getForca(), 2);
 
		leonidas.setAgilidade(5);
		assertEquals(leonidas.getAgilidade(), 5);

		leonidas.setFuncao("Atacar e Defender");
		assertNotNull(leonidas.getFuncao());

		leonidas.setHp(300);
		assertEquals(leonidas.getHp(), 300);

		leonidas.setInteligencia(2);
		assertEquals(leonidas.getInteligencia(), 2);

		leonidas.setLevel(2);
		assertEquals(leonidas.getLevel(), 2);

		leonidas.setMana(5);
		assertEquals(leonidas.getMana(), 200);

		assertNotNull("sem nome", leonidas.getNome());

		assertEquals(leonidas.ataque(), 4);
		assertEquals(leonidas.ataque2(), 10);

		leonidas.lvlUp();
		assertEquals(leonidas.getLevel(), 3);
		assertEquals(leonidas.getForca(), 5);
		assertEquals(leonidas.getAgilidade(), 6);
		assertEquals(leonidas.getInteligencia(), 3);
	}

}