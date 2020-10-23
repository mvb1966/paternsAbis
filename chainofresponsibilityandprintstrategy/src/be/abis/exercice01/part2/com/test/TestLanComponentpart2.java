package be.abis.exercice01.part2.com.test;

import be.abis.exercice01.part2.com.model.*;
import be.abis.exercice01.part2.com.model.Inktjet;
import be.abis.exercice01.part2.com.model.LaserPrinter;
import be.abis.exercice01.part2.com.model.PacketPart2;
import be.abis.exercice01.part2.com.model.PrintServerPart2;
import be.abis.exercice01.part2.com.model.PrintStrategy;
import be.abis.exercice01.part2.com.model.WorkstationPart2;
import be.abis.exercice01.part2.com.model.LanComponentPart2;
import be.abis.exercice01.part2.com.model.NodePart2;

import javax.print.attribute.standard.PrinterState;

public class TestLanComponentpart2 {
    public TestLanComponentpart2(){
        PacketPart2 packet1 = new PacketPart2("print2","eindelijk gevonden de inktjet");
        PacketPart2 packet2 = new PacketPart2("print3","eindelijk gevonden de 3 d");
        PacketPart2 packet3 = new PacketPart2("print1","eindelijk gevonden de laser printer");
        WorkstationPart2 w1 = new WorkstationPart2("workstation1");

        LanComponentPart2 n1 = new NodePart2("firstNode");
        PrintStrategy laser = new LaserPrinter();
        LanComponentPart2 p1 = new PrintServerPart2("print1",laser);
        LanComponentPart2 n2 = new NodePart2("secondNode");
        PrintStrategy inktjet = new Inktjet();
        LanComponentPart2 p2 = new PrintServerPart2("print2", inktjet);
        LanComponentPart2 n3 = new NodePart2("thirdNode");
        PrintStrategy threeD = new ThreeD_Printer();
        LanComponentPart2 p3 = new PrintServerPart2("print3", threeD);
        w1.setNextComponent(n1);
        n1.setNextComponent(p1);
        p1.setNextComponent(n2);
        n2.setNextComponent(p2);
        p2.setNextComponent(n3);
        n3.setNextComponent(p3);
        p3.setNextComponent(w1);

        if (w1 instanceof WorkstationPart2){
            ( (WorkstationPart2) w1).originate(packet1);
            ( (WorkstationPart2) w1).originate(packet2);
            ( (WorkstationPart2) w1).originate(packet3);
        }
    }
    public static void main (String[] args){
        TestLanComponentpart2 a = new TestLanComponentpart2();
    }
}
