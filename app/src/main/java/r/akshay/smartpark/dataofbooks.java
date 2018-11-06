package r.akshay.smartpark;

public class dataofbooks {
    private int id;
    private String title;
    private String shortdesc;
    private String info;

    private double rating;
    private int image;
    public dataofbooks(int id, String title, String shortdesc, String info, double rating, int image) {
        this.id = id;
        this.title = title;
        this.shortdesc = shortdesc;
        this.rating = rating;
        this.image = image;
        this.info = info;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getShortdesc() {
        return shortdesc;
    }
    public String getInfo() {
        return info;
    }
    public double getRating() {
        return rating;
    }
    public int getImage() {
        return image;
    }
}

