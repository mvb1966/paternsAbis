package be.abis.exercice01.part2.com.model;

public class NodePart2 extends LanComponentPart2{
    public NodePart2 (String address){
        super(address);
    }
    public void receive (PacketPart2 packet){
        System.out.println("i am a node so i only send");

        this.send (packet);

    }
    public void send (PacketPart2 packet){

        this.getNextComponent().receive(packet);
    }
}
