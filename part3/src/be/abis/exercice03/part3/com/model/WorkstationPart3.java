package be.abis.exercice03.part3.com.model;

public class WorkstationPart3 extends NodePart3 {

    public WorkstationPart3(String address){
        super(address);
    }
    public void originate (PacketPart3 packet){
         this.send(packet);
    }
}
