package be.abis.exercice03.part3.com.model;

public class LaserPrinterPart3 implements PrintStrategyPart3 {
    public void print (PacketPart3 packet){
        System.out.println("I am the laser printer " + packet.getContents());
    }
}
