package rpg_game;

import org.junit.Test;

public class CombateTest {

	@Test
	public void CombateArqueiroVsMago() {
		Arqueiro verde = new Arqueiro("verde");
		Mago merlin = new Mago("merlin");

		Combate combate = new Combate();

		combate.lutaCorporal(verde, merlin);

		System.out.println(combate.embateXadrez(merlin, verde));
	}
 
	
	@Test
	public void CombateArqueiroVsGuerreiro() {

		Arqueiro verde = new Arqueiro("verde");
		Guerreiro leonidas = new Guerreiro("leonidas");

		Combate combate = new Combate();

		combate.lutaCorporal(verde, leonidas);

		System.out.println(combate.embateXadrez(leonidas, verde));
	}

	@Test
	public void CombateGuerreiroVsMago() {
		Guerreiro leonidas = new Guerreiro("leonidas");
		Mago merlin = new Mago("merlin");

		Combate combate = new Combate();

		combate.lutaCorporal(merlin, leonidas);

		System.out.println(combate.embateXadrez(merlin, leonidas));

	}

}
