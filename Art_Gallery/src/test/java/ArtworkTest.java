import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtworkTest {
    Artwork artwork;
    Artist artist;

    @BeforeEach
    public void setUo(){
        artist = new Artist("Jamie");
        artwork = new Artwork("Miami", "Florida", 30);
    }

    @Test
    public void getTitle(){
        assertThat(artwork.getTitle()).isEqualTo("Miami");
    }
    @Test
    public void setTitle(){
        artwork.setTitle("London");
        assertThat(artwork.getTitle()).isEqualTo("London");
    }
    @Test
    public void getArtist(){
        assertThat(artwork.getArtist()).isEqualTo("Florida");
    }
    @Test
    public void setArtist(){
        Artist harun = new Artist("Harun");
        artwork.setArtist(harun);
        assertThat(artwork.getArtist()).isEqualTo("Harun");
    }

}