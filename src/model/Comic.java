package model;

public class Comic extends Merchandise{
    private int volumeNumber;
    private boolean colored;
    public Comic() {}

    public Comic(String title, double price, double weightm, int id, int volumeNumber, boolean colored) {
        super.setTitle(title);
        super.setPrice(price);
        super.setWeight(weight);
        super.setId(id);
        this.volumeNumber = volumeNumber;
        this.colored = colored;
    }

    public int getVolumeNumber() {
        return volumeNumber;
    }
    public void setVolumeNumber(int volumeNumber) {
        this.volumeNumber = volumeNumber;
    }

    public boolean isColored() {
        return colored;
    }
    public void setColored(Boolean colored) {
        this.colored = colored;
    }
}
