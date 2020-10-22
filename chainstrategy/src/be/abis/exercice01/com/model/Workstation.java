package be.abis.exercice01.com.model;

public class Workstation extends Node {
    String workstationName = "";
    public Workstation(String address){
        super(address);
    }
    public void originate (Packet packet){
         this.send(packet);
    }
}
