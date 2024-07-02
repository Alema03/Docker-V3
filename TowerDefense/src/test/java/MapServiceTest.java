import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.MapService;
import org.example.TowerService;
import org.junit.jupiter.api.Test;

public class MapServiceTest {

    @Test
    public void testPlaceTower() {
        MapService mapService = new MapService();
        TowerService towerService = new TowerService('T');
        mapService.placeTower(towerService, 2, 2);
        assertEquals("[ ][ ][ ][ ][ ]\n[ ][ ][ ][ ][ ]\n[ ][ ][T][ ][ ]\n[ ][ ][ ][ ][ ]\n[ ][ ][ ][ ][ ]\n", mapService.toString());
    }
}
