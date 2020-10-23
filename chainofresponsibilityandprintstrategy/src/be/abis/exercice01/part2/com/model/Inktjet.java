package be.abis.exercice01.part2.com.model;

import be.abis.exercice01.part2.com.model.PacketPart2;

public class Inktjet implements PrintStrategy{

    @Override
    public void print(PacketPart2 packet) {
        System.out.println("i am an old inktjet printer don't push me to the limits " + packet.getContents());
    }
}
