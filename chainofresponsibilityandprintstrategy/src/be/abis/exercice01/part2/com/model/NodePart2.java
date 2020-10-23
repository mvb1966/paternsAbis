package be.abis.exercice01.part2.com.model;

import be.abis.exercice01.part2.com.model.PacketPart2;

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
