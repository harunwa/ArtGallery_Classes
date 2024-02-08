import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtistTest {

    Artist artist;
    @BeforeEach
    public void setUp(){
        artist = new Artist("Monet");
    }
    @Test
    public void testGetName() {
        Artist artist = new Artist("Monet");
        assertThat(artist.getName()).isEqualTo("Monet");
    }
    public void setName() {
        artist.setName("Pollock");
        String realName = artist.getName();
        assertThat((realName)).isEqualTo("Pollock");

    }
}
