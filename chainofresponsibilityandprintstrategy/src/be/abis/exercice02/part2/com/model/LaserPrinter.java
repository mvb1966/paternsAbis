package be.abis.exercice01.part2.com.model;

public class LaserPrinter implements PrintStrategy {
    public void print (PacketPart2 packet){
        System.out.println("I am the laser printer " + packet.getContents());
    }
}
