package DetectAnagramTest;

import com.sharpness.DetectAnagram.DetectAnagram;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DetectAnagramTest {

    @Test
    void detectAnagram() {

        DetectAnagram d = new DetectAnagram();

        assertTrue(d.detectAnagram("army","Mary"));
        assertFalse(d.detectAnagram("false","falsee"));
        assertTrue(d.detectAnagram("Sharpness","shapRenss"));
        assertFalse(d.detectAnagram("false","falso"));
        assertTrue(d.detectAnagram("TRUE","eurt"));

    }
}