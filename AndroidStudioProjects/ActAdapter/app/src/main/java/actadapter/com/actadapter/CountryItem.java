package actadapter.com.actadapter;

public class CountryItem {

    private String countryName;
    private int Image;

    public CountryItem(String countryName, int image) {
        this.countryName = countryName;
        this.Image = image;
    }

    public String getCountryName() {
        return countryName;
    }

    public int getImage() {
        return Image;
    }
}
