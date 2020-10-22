package be.abis.exercice01.com.test;

import be.abis.exercice01.com.model.*;

public class TestLanComponent {
    Packet packet1 = new Packet("seconNode","message1");
    Workstation w1 = new Workstation("workstation1");

    LanComponent n1 = new Node("firstNode");
    LanComponent p1 = new PrintServer("print1");
    LanComponent n2 = new Node("secondNode");
    LanComponent p2 = new PrintServer("print2");
    
    w1.setNextComponent(n1);
    n1.setNextComponent(p1);
    p1.setNextComponent(n2);
    n2.setNextComponent(p2);
    p2.setNextComponent(w1);
    if (w1 instanceof Workstation){
        (Workstation) w1.originate(packet1);
    }
}
