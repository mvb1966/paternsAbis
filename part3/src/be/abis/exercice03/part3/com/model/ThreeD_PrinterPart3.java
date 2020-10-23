package be.abis.exercice03.part3.com.model;

public class ThreeD_PrinterPart3 implements PrintStrategyPart3 {
    @Override
    public void print(PacketPart3 packet) {
        System.out.println("Hello i am the 3d printer give your design " + packet.getContents());
    }
}
