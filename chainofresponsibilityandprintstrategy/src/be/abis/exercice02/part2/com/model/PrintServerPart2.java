package be.abis.exercice01.part2.com.model;

public class PrintServerPart2 extends NodePart2 {
    public PrintStrategy printer;
    public PrintServerPart2(String address, PrintStrategy printer){
        super(address);
        this.printer = printer;
    }

    public void receive (PacketPart2 packet){
        if(packet.getDestinationAdress().equals(address)){
            printer.print(packet);
        } else {
            this.send(packet);
        }
    }/*
    public void print (PacketPart2 packet){
        System.out.println("the packet is printed by "+ getClass().getSimpleName()+ " with content " + packet.getContents());

    }*/
}
