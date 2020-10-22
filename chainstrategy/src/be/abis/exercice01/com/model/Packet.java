package be.abis.exercice01.com.model;

public class Packet {
    String destinationAdress;
    String contents;

    public Packet(String destinationAdress, String contents) {
        this.destinationAdress = destinationAdress;
        this.contents = contents;
    }

    public String getDestinationAdress() {
        return destinationAdress;
    }

    public void setDestinationAdress(String destinationAdress) {
        this.destinationAdress = destinationAdress;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
}
