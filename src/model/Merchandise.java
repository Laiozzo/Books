package model;

public class Merchandise {
    protected int id;
    protected String title;
    protected double price;
    protected double weight;
    protected int pageNumber;
    protected int shelf;

    public Merchandise() {}



    public Merchandise(int id, String title, double price, double weight, int pageNumber) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.weight = weight;
        this.pageNumber = pageNumber;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getPageNumber() {
        return pageNumber;
    }
    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public void setShelf(Shelf shelf)
    {
        if(shelf.riskLevel() >= 3)
            throw new RuntimeException("Peso superato");
        this.shelf = shelf.getShelfID();
    }
}
