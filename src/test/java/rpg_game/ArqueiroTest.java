package rpg_game;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class ArqueiroTest {

	@Test
	public void instanciaArqueiroTest() {
		Arqueiro verde = new Arqueiro("Green Archer");
		assertNotNull(verde); 
	}

	@Test
	public void testeAtribuirHabilidadesArqueiro() {
		Arqueiro verde = new Arqueiro("Green Archer");
		verde.setForca(5);
		assertEquals(verde.getForca(), 5);

		verde.setAgilidade(100);
		assertEquals(verde.getAgilidade(), 100);

		verde.setFuncao("Atirar flechas"); 
		assertNotNull(verde.getFuncao());

		verde.setHp(10);
		assertEquals(verde.getHp(), 10);

		verde.setInteligencia(100);
		assertEquals(verde.getInteligencia(), 100);

		verde.setLevel(0);
		assertEquals(verde.getLevel(), 0);

		verde.setMana(5);
		assertEquals(verde.getMana(), 10000);

		assertNotNull("sem nome", verde.getNome());

		assertEquals(verde.ataque(), 8);
		assertEquals(verde.ataque2(), 10);

		verde.lvlUp();
		assertEquals(verde.getLevel(), 1);
		assertEquals(verde.getForca(), 6);
		assertEquals(verde.getAgilidade(), 103);
		assertEquals(verde.getInteligencia(), 101);
	}

}