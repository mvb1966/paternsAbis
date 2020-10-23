package be.abis.exercice01.part2.com.model;

public class PacketPart2 {
    private String destinationAdress;
    private String contents;

    public PacketPart2(String destinationAdress, String contents) {
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
