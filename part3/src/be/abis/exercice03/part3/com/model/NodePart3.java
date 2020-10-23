package be.abis.exercice03.part3.com.model;

public class NodePart3 extends LanComponentPart3 {
    public NodePart3(String address){
        super(address);
    }
    public void receive (PacketPart3 packet){
        System.out.println("i am a node so i only send");

        this.send (packet);

    }
    public void send (PacketPart3 packet){

        this.getNextComponent().receive(packet);
    }
}
