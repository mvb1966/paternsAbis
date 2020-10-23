package be.abis.exercice01.part2.com.model;

import be.abis.exercice01.part2.com.model.PacketPart2;
import be.abis.exercice01.part2.com.model.PrintStrategy;
import be.abis.exercice01.part2.com.model.NodePart2;
import be.abis.exercice01.part2.com.model.PacketPart2;
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
