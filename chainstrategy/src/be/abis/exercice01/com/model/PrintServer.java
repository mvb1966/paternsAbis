package be.abis.exercice01.com.model;

public class PrintServer extends Node{

    public PrintServer(String address){
        super(address);
    }
    public void receive (Packet packet){
        if(packet.getDestinationAdress().equals(address)){
            Print(packet);
        } else {
            this.send(packet);
        }
    }
    public void Print (Packet packet){
        System.out.println("the packet is printed by "+ getClass().getSimpleName()+ " with content " + packet.getDestinationAdress());

    }
}
