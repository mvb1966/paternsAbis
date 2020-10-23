package be.abis.exercice01.part2.com.model;

import be.abis.exercice01.part2.com.model.PrintStrategy;

public class ThreeD_Printer implements PrintStrategy {
    @Override
    public void print(PacketPart2 packet) {
        System.out.println("Hello i am the 3d printer give your design " + packet.getContents());
    }
}
