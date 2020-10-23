package be.abis.exercice03.part3.com.model;

import be.abis.exercice03.part3.com.test.TestLanComponentpart3;

public class Facade {
    private TestLanComponentpart3 ws3;
    PacketPart3 packet1 = new PacketPart3("print2","eindelijk gevonden de messagege Q");
    PacketPart3 packet2 = new PacketPart3("print3","eindelijk gevonden de 3 d");
    PacketPart3 packet3 = new PacketPart3("print1","eindelijk gevonden de laser printer");
    PacketPart3 packet4 = new PacketPart3("print4","eindelijk gevonden de inktjet");
    PacketPart3 packet5 = new PacketPart3("print5","eindelijk gevonden de fileserver");
    WorkstationPart3 w1 = new WorkstationPart3("workstation1");

    LanComponentPart3 n1 = new NodePart3("firstNode");
    PrintStrategyPart3 laser = new LaserPrinterPart3();

    LanComponentPart3 p1 = new PrintServerPart3("print1",laser);
    LanComponentPart3 n2 = new NodePart3("secondNode");

    LanComponentPart3 p2 = new MessageQueServerPart3("print3");

    LanComponentPart3 n3 = new NodePart3("thirdNode");
    PrintStrategyPart3 threeD = new ThreeD_PrinterPart3();

    LanComponentPart3 p3 = new PrintServerPart3("print2", threeD);
    LanComponentPart3 n4 = new NodePart3("Node4");

    PrintStrategyPart3 inktjet = new InktjetPart3();
    LanComponentPart3 p4 = new PrintServerPart3("print4", inktjet);
    LanComponentPart3 n5 = new NodePart3("Node5");
    LanComponentPart3 p5 = new FileserverPart3("print5");
    public Facade (TestLanComponentpart3 ws3){
        this.ws3 = ws3;
    }
    public void initialize(){


        w1.setNextComponent(n1);
        n1.setNextComponent(p1);
        p1.setNextComponent(n2);
        n2.setNextComponent(p2);
        p2.setNextComponent(n3);
        n3.setNextComponent(p3);
        p3.setNextComponent(n4);
        n4.setNextComponent(p4);
        p4.setNextComponent(n5);
        n5.setNextComponent(p5);
        p5.setNextComponent(w1);
    }

    public void runProgram(){
        if (w1 instanceof WorkstationPart3){
            ( (WorkstationPart3) w1).originate(packet1);
            System.out.println("einde 1");

            ( (WorkstationPart3) w1).originate(packet2);
            System.out.println("einde 2");
            ( (WorkstationPart3) w1).originate(packet3);
            System.out.println("einde 3");
            ( (WorkstationPart3) w1).originate(packet4);
            System.out.println("einde 4");
            ( (WorkstationPart3) w1).originate(packet5);
            System.out.println("einde 5");
        }
    }

}
