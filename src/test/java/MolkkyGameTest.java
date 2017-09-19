import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MolkkyGameTest {

    @Test
    public void canKnockOverPin3() {
        MolkkyGame game = new MolkkyGame();

        game.knockOver(3);

        assertEquals(3, game.score());
    }

    @Test
    public void canKnockOverPin5() {
        MolkkyGame game = new MolkkyGame();

        game.knockOver(5);

        assertEquals(5, game.score());
    }

    @Test
    public void canKnockOverPin5AndPin6() {
        MolkkyGame game = new MolkkyGame();

        game.knockOver(5, 6);

        assertEquals(2, game.score());
    }

    @Test
    public void canKnockOverTwice() {
        MolkkyGame game = new MolkkyGame();

        game.knockOver(5);
        game.knockOver(6);

         assertEquals(11, game.score());
    }

    @Test
    public void canKnockOverPinsTwice() {
        MolkkyGame game = new MolkkyGame();

        game.knockOver(5); // => 5
        game.knockOver(6,1); // => 2

        assertEquals(7, game.score());
    }

}
