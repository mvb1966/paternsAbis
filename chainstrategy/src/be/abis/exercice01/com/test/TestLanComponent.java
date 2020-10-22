package be.abis.exercice01.com.test;

import be.abis.exercice01.com.model.*;

public class TestLanComponent {
    Packet packet1 = new Packet("seconNode","message1");
    LanComponent w1 = new Workstation("workstation1");
    LanComponent n1 = new Node("firstNode");
    LanComponent p1 = new PrintServer("print1");
    LanComponent n2 = new Node("secondNode");
    LanComponent p2 = new PrintServer("print2");
    w1.originate (packet1);
    n1.receive (packet1);
    n1.send (packet1);
    p1.receive (packet1);
    p1.send (packet1);
    n2.receive (packet1);
    n2.send(packet1);

}
