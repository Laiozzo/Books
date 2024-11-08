package model;

import javax.imageio.plugins.tiff.GeoTIFFTagSet;
import java.util.ArrayList;

public class Shelf {
    private int shelfID;
    private int number;
    private String material;
    private int maxItem;
    ArrayList<Merchandise> obj = new ArrayList<>();

    public Shelf(int shelfID, int number, String material, int maxItem) {
        this.shelfID = shelfID;
        this.number = number;
        this.material = material;
        this.maxItem = maxItem;

    }

    public Shelf() {}

    public void addComic(Comic comic) {
        obj.add(comic);
    }
    public void addNewspaper(Newspaper newspaper) {
        obj.add(newspaper);
    }
    public void addBook(Book book) {
        obj.add(book);
    }

    public void setId(int shelfID) {
        this.shelfID = shelfID;
    }
    public void setMaxItems(int maxItem) {
        this.maxItem = maxItem;
    }
    public int getShelfID() {
        return shelfID;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public int getNumber() {
        return number;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    public String getMaterial() {
        return material;
    }
    public void setMaxItem(int maxItem) {
        this.maxItem = maxItem;
    }
    public int getMaxItem() {
        return maxItem;
    }

    public double merchWeight(){
        double maxWeight = 0;
        for(Merchandise obj : obj){
            maxWeight += obj.getWeight();
        }

        return maxWeight;
    }

    public double maxWeight(){
        if(getMaterial().equals("pvc")){
            return 0.75 * getMaxItem();
        }
        if(getMaterial().equals("wood")){
            return 0.5 * getMaxItem();
        }
        if(getMaterial().equals("steel")){
            return 1.5 * getMaxItem();
        }
        if(getMaterial().equals("adamantium")){
            return 50 * getMaxItem();
        }
        return 0;
    }

    public double riskLevel() {
        System.out.println(merchWeight());
        if (merchWeight() <= (maxWeight() * 0.5)) {
            return 1;
        } else if (maxWeight() <= maxWeight() * 0.75 || maxWeight() < 3.0) {
            return 2;
        } else {
            return 3;
        }
    }



    public static void main(String[] args) throws Exception{
        Shelf s = new Shelf();
        s.setId(1);
        s.setNumber(101);
        s.setMaterial("pvc");
        s.setMaxItems(4);

        Newspaper n1 = new Newspaper();
        n1.setId(2);
        n1.setTitle("Il Bug 24 Ore");
        n1.setWeight(2);
        n1.setPageNumber(1400);
        n1.setPublisher("JavissimaSpring");
        n1.setDay("07/11/2024");
        n1.setShelf(s);

        Comic c1 = new Comic();
        c1.setId(3);
        c1.setTitle("Capitan HashMap");
        c1.setWeight(0.4);
        c1.setPageNumber(80);
        c1.setVolumeNumber(2);
        c1.setColored(true);
        c1.setShelf(s);

        Comic c2 = new Comic();
        c2.setId(4);
        c2.setTitle("Iron Main");
        c2.setWeight(0.2);
        c2.setPageNumber(90);
        c2.setVolumeNumber(3);
        c2.setColored(true);
        c2.setShelf(s);

        Book b1 = new Book();
        b1.setId(5);
        b1.setTitle("Il Signore dei Modelli: return del Re");
        b1.setWeight(0.3);
        b1.setPageNumber(1500);
        b1.setAuthor("Stefano");
        b1.setGenre("Horror");
        b1.setShelf(s);

        System.out.println("IL livello di rischio deve essere 2");
        System.out.println("Il tuo è :"+s.riskLevel());


        Book b2 = new Book();
        b2.setId(6);
        b2.setTitle("OOP is OP");
        b2.setWeight(4);
        b2.setPageNumber(1500);
        b2.setAuthor("Stefano");
        b2.setGenre("Horror");

        try
        {
            b2.setShelf(s);
            System.out.println("Sbagliato, vi ha inserito il libro nonostante lo spazio sia finito");
        }catch (Exception e)
        {
            System.out.println("Riusciro mai a stampare queste righe?");
            System.out.println("Giusto, vi ha lanciato eccezione e non ha inserito il libro");
        }
    }
}
