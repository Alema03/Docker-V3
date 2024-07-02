import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.PlayerService;
import org.junit.jupiter.api.Test;

public class PlayerServiceTest {

    @Test
    public void testInitialScore() {
        PlayerService playerService = new PlayerService();
        assertEquals(0, playerService.getScore());
    }

    @Test
    public void testInitialBaseHealth() {
        PlayerService playerService = new PlayerService();
        assertEquals(100, playerService.getBaseHealth());
    }
}
