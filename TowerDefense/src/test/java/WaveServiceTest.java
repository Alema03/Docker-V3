import static org.mockito.Mockito.*;

import org.example.WaveService;
import org.junit.jupiter.api.Test;

public class WaveServiceTest {

    @Test
    public void testStartWave() {
        WaveService waveService = new WaveService();
        waveService.start();

    }
}
