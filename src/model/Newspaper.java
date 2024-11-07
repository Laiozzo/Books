package model;

public class Newspaper extends Merchandise{
    private String publisher;
    private String day;

    public Newspaper() {}
    public Newspaper(String title, double price, int id, String publisher, String day) {
        super.setTitle(title);
        super.setPrice(price);
        super.setWeight(weight);
        super.setId(id);
        this.publisher = publisher;
        this.day = day;
    }

    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public String getDay() {
        return day;
    }
    public void setDay(String day) {
        this.day = day;
    }
}
