public class Artwork {
    private String title;
    private String artist;
    private int price;

    public Artwork (String title, String artist, int price){
        this.title = title;
        this.artist = artist;
        this.price = price;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle( String title){
        this.title = title;
    }
    public String getArtist() {
        return artist;
    }
    public void setArtist(Artist artist){
        this.artist = String.valueOf(artist);
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }
}

