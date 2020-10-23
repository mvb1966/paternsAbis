package be.abis.exercice03.part3.com.model;

public class PacketPart3 {
    private String destinationAdress;
    private String contents;

    public PacketPart3(String destinationAdress, String contents) {
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
