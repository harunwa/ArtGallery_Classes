import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GalleryTest {
    Gallery gallery;
    Artist daVinci;
    Artwork monaLisa;
    Artwork battlesoftheplague;
    Customer customer;
    ArrayList<Artwork> stock;

    @BeforeEach
    public void setUp(){
        gallery = new Gallery("The Louvre");
        daVinci = new Artist("Da Vinci");
        monaLisa = new Artwork("Mona Lisa", "Colin", 100);
        battlesoftheplague = new Artwork("Battle of the plague", "Anna", 100);
        customer = new Customer("Phil Yarrow", 500);
        stock = new ArrayList<>(Arrays.asList(monaLisa, battlesoftheplague));
    }
    @Test
    public void getName(){
        assertThat(gallery.getName()).isEqualTo("The Louvre");
    }
    @Test
    public void detName(){
        gallery.setName("French Gallery");
        assertThat(gallery.getName()).isEqualTo("French Gallery");
    }
    @Test
    public void checkTill(){
        assertThat(gallery.getTill()).isEqualTo(0);
    }
    @Test
    public void getStock(){
        assertThat(gallery.getStock()).isEqualTo(stock);
    }
    @Test
    public void setStock(){
        Artist colin = new Artist("Colin");
        Artwork james = new Artwork("James", "May", 50);
        Artwork alex = new Artwork("Alex", "Holder", 70);
        ArrayList<Artwork> artStock = new ArrayList<>(Arrays.asList(james, alex));
        gallery.setStock(artStock);
        assertThat(gallery.getStock()).isEqualTo(artStock);
    }

}

