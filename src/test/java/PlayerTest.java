import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class PlayerTest {

    @Test
    public void canCreatePlayer() {

        Player p = new Player("toto");

        assertEquals("toto", p.nom());

    }
    @Test
    public void scoreEquals0() {

        Player p = new Player("toto");
        assertEquals(0, p.score());

    }

    @Test
    public void scoreEquals10() {

        Player p = new Player("toto");
        Player tata = new Player("tata");

        tata.play();

        assertEquals(0, p.score());
        assertNotEquals(0, tata.score());

    }
}
