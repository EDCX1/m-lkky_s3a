package molky;

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
    @Test
    public void canWin() {
        MolkkyGame game = new MolkkyGame();

        game.knockOver(5); // => 5
        game.knockOver(5); // => 2
        game.knockOver(5); // => 5
        game.knockOver(5); // => 2        game.knockOver(5); // => 5
        game.knockOver(5); // => 2        game.knockOver(5); // => 5
        game.knockOver(5); // => 2        game.knockOver(5); // => 5
        game.knockOver(5); // => 2
        game.knockOver(5);
        game.knockOver(5);
        game.knockOver(5);
        
        assertEquals(true, game.testScore());
    }
    @Test
    public void canReset() {
        MolkkyGame game = new MolkkyGame();

        game.knockOver(5); // => 5
        game.knockOver(5); // => 2
        game.knockOver(5); // => 5
        game.knockOver(5); // => 2        game.knockOver(5); // => 5
        game.knockOver(5); // => 2        game.knockOver(5); // => 5
        game.knockOver(5); // => 2        game.knockOver(5); // => 5
        game.knockOver(5); // => 2
        game.knockOver(5); // => 5
        game.knockOver(5); // => 2
        game.knockOver(5); // => 5
        game.knockOver(5); // => 2
        game.knockOver(5); // => 5
        game.knockOver(5); // => 2        game.knockOver(5); // => 5
        game.knockOver(5); // => 2        game.knockOver(5); // => 5
        game.knockOver(5); // => 2        game.knockOver(5); // => 5
        game.knockOver(5); // => 2
        game.knockOver(5);
        game.knockOver(5);
        game.knockOver(5);

        assertEquals(false, game.testScore());

        assertEquals(25, game.score());
    }

}