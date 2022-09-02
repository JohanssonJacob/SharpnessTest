package FindAllLinksTest;

import com.sharpness.FindAllLinks.FindLinks;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindLinksTest {

    @Test
    void findAllLinks() {
        FindLinks findLinks = new FindLinks();
        assertEquals(21, findLinks.findAllLinks("http://google.com").size());
    }
}