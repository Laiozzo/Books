package model;

public class Book extends Merchandise {
    private String author;
    private String genre;
    public Book() {}

    public Book(int id, String title, double price, double weight, String author, String genre) {
        super.setTitle(title);
        super.setPrice(price);
        super.setWeight(weight);
        super.setId(id);
        this.author = author;
        this.genre = genre;
    }

    public void setGenre(String title) {
        this.genre = title;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public void setShelf(Shelf shelf)throws Exception
    {
        if(shelf.getMaxItem() < 1){
            throw new Exception();
        }
        shelf.addBook(this);
        shelf.setMaxItem(shelf.getMaxItem()-1);
    }

}
