package be.abis.exercice01.com.model;

public class PrintServer extends Node{
    public String name;
    PrintServer(String name){
        this.name= name;
    }
    public void receive (Packet packet){
        if(packet.destinationAdress.equals(name)){
            Print(packet);
        }
    }
    public void Print (Packet packet){
        System.out.println("the packet is printed by "+ getClass().getSimpleName()+ " with content " + packet.contents);

    }
}
