package be.abis.exercice01.com.model;

public class Node extends LanComponent {

    public Node (String address){
        super(address);
    }
    public void receive (Packet packet){
        System.out.println("i am a node so i only send");

            this.send (packet);

    }
    public void send (Packet packet){
        this.getNextComponent().receive(packet);
    }
}
