package be.abis.exercice03.part3.com.model;

public class InktjetPart3 implements PrintStrategyPart3 {

    @Override
    public void print(PacketPart3 packet) {
        System.out.println("i am an old inktjet printer don't push me to the limits " + packet.getContents());
    }
}
