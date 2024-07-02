import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.TowerService;
import org.junit.jupiter.api.Test;

public class TowerServiceTest {

    @Test
    public void testGetSymbol() {
        TowerService towerService = new TowerService('T');
        assertEquals('T', towerService.getSymbol());
    }
}
