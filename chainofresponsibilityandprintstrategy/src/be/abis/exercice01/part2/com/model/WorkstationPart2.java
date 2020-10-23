package be.abis.exercice01.part2.com.model;

import be.abis.exercice01.part2.com.model.PacketPart2;
import be.abis.exercice01.part2.com.model.NodePart2;

public class WorkstationPart2 extends NodePart2 {

    public WorkstationPart2(String address){
        super(address);
    }
    public void originate (PacketPart2 packet){
         this.send(packet);
    }
}
