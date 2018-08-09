package testerecyclerviewgrid.com.testerecyclerviewgrid;

public class Book {

    private String tittle;
    private String category;
    private String Description;
    private int Thumbnail;

    public Book() {
    }

    public Book(String tittle, String category, String description, int thumbnail) {
        this.tittle = tittle;
        this.category = category;
        Description = description;
        Thumbnail = thumbnail;
    }

    public String getTittle() {
        return tittle;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return Description;
    }

    public int getThumbnail() {
        return Thumbnail;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }
}
